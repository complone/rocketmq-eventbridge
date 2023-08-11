package org.apache.rocketmq.eventbridge.adapter.runtime.env.context;

import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;

import java.util.Map;

public interface IEnvironmentContext {

    /**
     * Put config into global config.
     */
    void withConfig(Map<String, String> config);

    /**
     * Get the config.
     */
    Configuration getConfig();
}
