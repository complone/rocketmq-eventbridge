package org.apache.rocketmq.eventbridge.adapter.runtime.env;


import org.apache.rocketmq.eventbridge.adapter.runtime.env.context.EnvironmentContext;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.context.IEnvironmentContext;
import org.apache.rocketmq.eventbridge.adapter.runtime.scheduler.Pipeline;

public abstract class Environment implements IEnvironment {

    protected Pipeline pipeline;
    protected IEnvironmentContext context;

    public Environment() {
        context = new EnvironmentContext();
    }

    public void addPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    public IEnvironmentContext getEnvironmentContext() {
        return context;
    }
}
