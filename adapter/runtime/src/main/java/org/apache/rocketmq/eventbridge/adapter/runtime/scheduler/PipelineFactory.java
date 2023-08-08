package org.apache.rocketmq.eventbridge.adapter.runtime.scheduler;


import org.apache.rocketmq.eventbridge.adapter.runtime.env.Environment;

public class PipelineFactory {

    public static Pipeline buildPipeline(Environment environment) {
        return new Pipeline(environment);
    }

    public static SchedulerPipeline buildSchedulerPipeline(Environment environment) {
        return new SchedulerPipeline(environment);
    }

}
