package org.apache.rocketmq.eventbridge.runtimer.service;

import com.google.common.collect.Lists;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.Environment;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.EnvironmentFactory;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.context.EnvironmentContext;
import org.apache.rocketmq.eventbridge.adapter.runtime.scheduler.IPipelineResult;
import org.apache.rocketmq.eventbridge.adapter.runtime.scheduler.Pipeline;
import org.apache.rocketmq.eventbridge.adapter.runtime.scheduler.PipelineFactory;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.PipelineTask;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBridgeBuildPiplineTest {

    protected Environment environment;

    @Test

    public void testBuildPipline() {

        environment = EnvironmentFactory.onLocalEnvironment();
        Configuration config = ((EnvironmentContext) environment.getEnvironmentContext()).getConfig();
        config.put("bridge", getClass().getSimpleName());

        Pipeline pipeline = PipelineFactory.buildPipeline(environment);
        pipeline.submit((PipelineTask) pipelineTaskCxt -> {
            List<Map<String, String>> components = Lists.newArrayList(
                new HashMap<String, String>() {
                    {
                        put("account", "accountId1");
                    }
                },
                new HashMap<String, String>() {
                    {
                        put("runnername", "runnername1");
                    }
                },
                new HashMap<String, String>() {
                    {
                        put("transform", "transform1");
                    }
                });

            //TODO schedule

        });
        IPipelineResult result = pipeline.execute();
        result.get();
    }
}
