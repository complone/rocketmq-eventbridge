/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.eventbridge.adapter.persistence.data.rocketmq.repository;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.admin.ConsumeStats;
import org.apache.rocketmq.common.admin.OffsetWrapper;
import org.apache.rocketmq.common.admin.TopicOffset;
import org.apache.rocketmq.common.admin.TopicStatsTable;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.common.protocol.body.ClusterInfo;
import org.apache.rocketmq.common.protocol.route.BrokerData;
import org.apache.rocketmq.eventbridge.exception.EventBridgeException;
import org.apache.rocketmq.eventbridge.exception.code.DefaultErrorCode;
import org.apache.rocketmq.remoting.exception.RemotingConnectException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.remoting.exception.RemotingSendRequestException;
import org.apache.rocketmq.remoting.exception.RemotingTimeoutException;
import org.apache.rocketmq.tools.admin.DefaultMQAdminExt;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RocketMQMetaService {

    private final DefaultMQAdminExt defaultMQAdminExt;

    private final static int DEFAULT_QUEUE_NUM = 1;

    public RocketMQMetaService(DefaultMQAdminExt defaultMQAdminExt) {
        this.defaultMQAdminExt = defaultMQAdminExt;
    }

    public boolean createTopic(String clusterName, String topicName) {
        try {
            defaultMQAdminExt.createTopic(clusterName, topicName, DEFAULT_QUEUE_NUM, Maps.newHashMap());
        } catch (MQClientException e) {
            log.error("Create topic failed.", e);
            throw new EventBridgeException(DefaultErrorCode.InternalError, e);
        }
        return Boolean.TRUE;
    }

    public boolean deleteTopic(String clusterName, String topicName) {
        try {
            Set<String> brokerAddressSet = fetchMasterAndSlaveAddrByClusterName(clusterName);
            defaultMQAdminExt.deleteTopicInBroker(brokerAddressSet, topicName);
            List<String> nameServerList = defaultMQAdminExt.getNameServerAddressList();
            defaultMQAdminExt.deleteTopicInNameServer(new HashSet<String>(nameServerList), topicName);
        } catch (Throwable e) {
            log.error("Delete topic failed.", e);
            throw new EventBridgeException(DefaultErrorCode.InternalError, e);
        }
        return Boolean.TRUE;
    }

    private Set<String> fetchMasterAndSlaveAddrByClusterName(String clusterName)
        throws InterruptedException, RemotingConnectException, RemotingTimeoutException, RemotingSendRequestException,
        MQBrokerException {
        Set<String> brokerAddressSet = new HashSet<String>();
        ClusterInfo clusterInfoSerializeWrapper = defaultMQAdminExt.examineBrokerClusterInfo();
        Set<String> brokerNameSet = clusterInfoSerializeWrapper.getClusterAddrTable()
            .get(clusterName);
        if (brokerNameSet != null) {
            for (String brokerName : brokerNameSet) {
                BrokerData brokerData = clusterInfoSerializeWrapper.getBrokerAddrTable()
                    .get(brokerName);
                if (brokerData != null) {
                    final Collection<String> addrs = brokerData.getBrokerAddrs()
                        .values();
                    brokerAddressSet.addAll(addrs);
                }
            }
        }
        return brokerAddressSet;
    }

    /**
     * 获取分区信息,计算consumer的消费速度
     * 未消费的消息量 ConsumerLag = MaxOffset - consumerOffset
     * 正在消费的消息量 InflightMessageCount = PullOffset - ConsumerOffset
     * 等待拉取的消息量 AvaliableMessageCount = MaxOffset- PullOffset
     * 消费速度 = 正在消费的消息量 / 未消费的消息量 + 正在消费的消息量 + 等待拉取的消息量
     * 基于Guava计算限流
     * 消费延迟的情况
     *  - 拉取延时：ConsumerOffset 在每次拉取新消息时更新，而 RocketMQ 是使用长轮询方式更新消息，每次长轮询的默认超时时间是 30s。
     *     也就是说如果没有足够数量的消息产生，ConsumerOffset 要 30s 才能更新一次
     *  - 消费延时：消费者每次提交的 commitOffset 字段是当前还未消费的第一个消息的位点而不是最后一个消费成功的消息的位点。
     *    之前的消息未能结束消费的情况下后面已经消费完的消息位点就迟迟得不到更新
     * pullOffset的意义为 Broker 在回复消费者拉取消息的响应中有 nextBeginOffset 字段,即当前拉取到的消息的下一条消息的位点
     * 5.0之前没有pullOffset,只有在pullOffset与MaxOffset中取最大值
     * @param topic
     * @param messageQueueList
     * @return
     */
    public  Map<Integer, Pair<Long, Long>> fetchPartitionInfo (String topic, List<MessageQueue> messageQueueList) {
        // <ConsumerOffset, <PullOffset，MaxOffset>>
        // queueId为consumerOffset
        Map<Integer, Pair<Long, Long>> offsetMap =new HashMap<>();
        try {
            //获取每个分区的最大最小位移
            TopicStatsTable topicStatsTable = defaultMQAdminExt.examineTopicStats(topic);
            //获取每个队列的
            ConsumeStats consumeStats = defaultMQAdminExt.examineConsumeStats("consumerGroup");
            HashMap<MessageQueue, OffsetWrapper> offsetWrapperTable = consumeStats.getOffsetTable();
            HashMap<MessageQueue, TopicOffset> offsetTable =  topicStatsTable.getOffsetTable();
            for (MessageQueue messageQueue : messageQueueList) {
                TopicOffset topicOffset = offsetTable.get(messageQueue);
                OffsetWrapper offsetWrapper = offsetWrapperTable.get(messageQueue);
                offsetMap.put(messageQueue.getQueueId(), Pair.of(offsetWrapper.getBrokerOffset(), topicOffset.getMaxOffset()));
            }

        } catch (RemotingException | InterruptedException | MQBrokerException|  MQClientException e) {
            e.printStackTrace();
        }
        return offsetMap;
    }
}
