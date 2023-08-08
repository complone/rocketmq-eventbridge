package org.apache.rocketmq.eventbridge.adapter.runtime.scheduler;


import org.apache.rocketmq.eventbridge.adapter.runtime.env.Environment;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.callback.TaskCallBack;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.service.PipelineService;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.PipelineTask;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pipeline implements Serializable {

    private transient Environment environment;
    private List<PipelineTask> pipelineTaskList;
    private List<TaskCallBack> pipelineTaskCallbacks;
    private List<PipelineService> pipelineServices;

    public Pipeline(Environment environment) {
        this.environment = environment;
        this.environment.addPipeline(this);
        this.pipelineTaskList = new ArrayList<>();
        this.pipelineTaskCallbacks = new ArrayList<>();
        this.pipelineServices = new ArrayList<>();
    }

    public void init() {

    }

    public TaskCallBack submit(PipelineTask pipelineTask) {
        this.pipelineTaskList.add(pipelineTask);
        TaskCallBack taskCallBack = new TaskCallBack();
        this.pipelineTaskCallbacks.add(taskCallBack);
        return taskCallBack;
    }

    public Pipeline start(PipelineService pipelineService) {
        this.pipelineServices.add(pipelineService);
        return this;
    }

    public Pipeline schedule(PipelineTask pipelineTask) {
        this.pipelineTaskList.add(pipelineTask);
        return this;
    }

    public IPipelineResult execute() {
        this.environment.init();
        return this.environment.submit();
    }


    public void shutdown() {
        this.environment.shutdown();
    }


    public List<PipelineTask> getPipelineTaskList() {
        return pipelineTaskList;
    }

    public List<TaskCallBack> getPipelineTaskCallbacks() {
        return pipelineTaskCallbacks;
    }

    public List<PipelineService> getPipelineServices() {
        return pipelineServices;
    }
}
