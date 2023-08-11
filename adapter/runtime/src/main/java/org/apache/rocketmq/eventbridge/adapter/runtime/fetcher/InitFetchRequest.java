package org.apache.rocketmq.eventbridge.adapter.runtime.fetcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitFetchRequest implements IFetchRequest {

    private final long pipelineId;
    private final String pipelineName;

    private int taskId;
    private int taskIndex;
    private String taskName;

    private int componentId;

    private Map<Integer, String> inputStreamMap;

    private  List<FetcherListener> fetchListeners;


    public InitFetchRequest(long pipelineId, String pipelineName, String taskName) {
        this.pipelineId = pipelineId;
        this.pipelineName = pipelineName;
        this.taskName = taskName;
    }

    public long getPipelineId() {
        return pipelineId;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getTaskIndex() {
        return taskIndex;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getComponentId() {
        return componentId;
    }

    public Map<Integer, String> getInputStreamMap() {
        return inputStreamMap;
    }


    public InitFetchRequest setTaskId(int taskId) {
        this.taskId = taskId;
        return this;
    }

    public InitFetchRequest setTaskIndex(int taskIndex) {
        this.taskIndex = taskIndex;
        return this;
    }

    public InitFetchRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public InitFetchRequest setComponentId(int componentId) {
        this.componentId = componentId;
        return this;
    }


    public List<FetcherListener> getFetchListeners() {
        return fetchListeners;
    }


}
