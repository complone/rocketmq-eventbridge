package org.apache.rocketmq.eventbridge.adapter.runtime.scheduler;


import org.apache.rocketmq.eventbridge.adapter.runtime.boot.listener.EventSubscriber;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.Environment;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.scheduler.ISchedule;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.PipelineTask;

public class SchedulerPipeline extends Pipeline {

    private ISchedule scheduler;

    public SchedulerPipeline(Environment environment) {
        super(environment);
    }

    public SchedulerPipeline schedule(PipelineTask pipelineTask) {
        submit(pipelineTask);
        return this;
    }

    public void with(ISchedule scheduler) {
        this.scheduler = scheduler;
    }
}
