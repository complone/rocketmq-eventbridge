package org.apache.rocketmq.eventbridge.adapter.runtime.fetcher;

import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.encoder.IEncoder;

import java.util.Map;

public class FetchRequest {


    private long pipelineId;
    private String pipelineName;
    private int componentId;
    private int taskId;
    private int taskIndex;
    private String taskName;
    private long targetBatchId;

    //transformMap
    private Map<Integer, String> inputStreamMap;
    private Map<Integer, IEncoder<?>> encoders;

    public long getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(long pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public long getTargetBatchId() {
        return targetBatchId;
    }

    public void setTargetBatchId(long targetBatchId) {
        this.targetBatchId = targetBatchId;
    }

    public int getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setInputStreamMap(Map<Integer, String> inputStreamMap) {
        this.inputStreamMap = inputStreamMap;
    }

    public Map<Integer, String> getInputStreamMap() {
        return inputStreamMap;
    }

    public Map<Integer, IEncoder<?>> getEncoders() {
        return this.encoders;
    }

    public void setEncoders(Map<Integer, IEncoder<?>> encoders) {
        this.encoders = encoders;
    }


}
