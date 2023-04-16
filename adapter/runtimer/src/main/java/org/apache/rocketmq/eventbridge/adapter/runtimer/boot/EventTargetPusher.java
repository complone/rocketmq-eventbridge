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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.rocketmq.eventbridge.adapter.runtimer.boot;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import io.openmessaging.connector.api.component.task.sink.SinkTask;
import io.openmessaging.connector.api.data.ConnectRecord;
import org.apache.rocketmq.eventbridge.adapter.runtimer.boot.listener.CirculatorContext;
import org.apache.rocketmq.eventbridge.adapter.runtimer.common.ServiceThread;
import org.apache.rocketmq.eventbridge.adapter.runtimer.config.RuntimerConfigDefine;
import org.apache.rocketmq.eventbridge.exception.EventBridgeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/**
 * event target push to sink task
 *
 * @author artisan
 */
public class EventTargetPusher extends ServiceThread{

    private static final Logger logger = LoggerFactory.getLogger(EventTargetPusher.class);

    private final CirculatorContext circulatorContext;

    private final Object resultLock;
    private final List<ConnectRecord> changeRecordBuffer;
    private final int maxBufferSize;

    private CompletableFuture<String> taskExecutionResultFuture;
    private AtomicReference<EventBridgeException> executionException = new AtomicReference<>();


    public EventTargetPusher(CirculatorContext circulatorContext) {
        resultLock = new Object();
        this.circulatorContext = circulatorContext;
        changeRecordBuffer = new ArrayList<>();
        this.maxBufferSize = 100;
    }

    @Override
    public void run() {
        while (!stopped) {
            ConnectRecord targetRecord = circulatorContext.takeTargetMap();

            processRecord(targetRecord);
            if (Objects.isNull(targetRecord)) {
                logger.info("current target pusher is empty");
                this.waitForRunning(1000);
                continue;
            }
            if(logger.isDebugEnabled()){
                logger.debug("start push content by pusher - {}", JSON.toJSONString(targetRecord));
            }

            //线程池定时执行批量递送的任务,对每个不同的topic而言
            List<ConnectRecord> result =  retrieveChanges();
            String sinkTaskClass = targetRecord.getExtensions().getString(RuntimerConfigDefine.TASK_CLASS);
            //一个sinkTaskClass用一个线程池, 太耗费资源了, 用CompletedFuture异步非阻塞的方式投递
            //CompletableFuture中以async结尾的方法将会在一个新的线程中执行组合操作
            taskExecutionResultFuture = CompletableFuture.completedFuture(sinkTaskClass)
                    .thenCompose(sink -> CompletableFuture.supplyAsync( () -> {
                        String runnerName = targetRecord.getExtensions().getString(RuntimerConfigDefine.RUNNER_NAME);
                        SinkTask sinkTask = circulatorContext.getPusherTaskMap().get(runnerName);;
                        sinkTask.put(Lists.newArrayList(targetRecord));
                        return sinkTaskClass;
                    }))
                    .whenComplete((unused, throwable) -> {
                        if (throwable != null) {
                            executionException.compareAndSet(
                                    null,
                                    new EventBridgeException("Error sink Task.", throwable));
                        }
                    });
        }
    }

    @Override
    public String getServiceName() {
        return EventTargetPusher.class.getSimpleName();
    }

    private void processRecord(ConnectRecord change) {
        synchronized (resultLock) {
            // wait if the buffer is full
            if (changeRecordBuffer.size() >= maxBufferSize) {
                try {
                    resultLock.wait();
                } catch (InterruptedException e) {
                    // ignore
                }
            } else {
                changeRecordBuffer.add(change);
            }
        }
    }

    public List<ConnectRecord> retrieveChanges() {
        synchronized (resultLock) {
            if (isStopped() && executionException.get() == null) {
                if (changeRecordBuffer.isEmpty()) {
                    return new ArrayList<>();
                } else {
                    final List<ConnectRecord> change = new ArrayList<>(changeRecordBuffer);
                    changeRecordBuffer.clear();
                    resultLock.notify();
                    return change;
                }
            }
            else if (!isStopped() && !changeRecordBuffer.isEmpty()) {
                final List<ConnectRecord> change = new ArrayList<>(changeRecordBuffer);
                changeRecordBuffer.clear();
                return change;
            }
            // no results can be returned anymore
            else {
                return handleMissingResult();
            }
        }
    }

    //异步的方式提交到sink端存在延时，需要将taskExecutionResultFuture的信息做实时判断
    private <T> List<ConnectRecord> handleMissingResult() {

        // check if the monitoring thread is still there
        // we need to wait until we know what is going on
        if (!taskExecutionResultFuture.isDone()) {
            return new ArrayList<>();
        }

        if (executionException.get() != null) {
            throw executionException.get();
        }

        // we assume that a task finished
        return changeRecordBuffer;
    }

}
