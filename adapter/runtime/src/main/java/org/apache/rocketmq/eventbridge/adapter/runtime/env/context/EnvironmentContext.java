package org.apache.rocketmq.eventbridge.adapter.runtime.env.context;


import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;

import java.util.Map;
import java.util.UUID;

public class EnvironmentContext implements IEnvironmentContext {

    private final Configuration config;

    public EnvironmentContext() {
        this.config = new Configuration();
        buildDefaultConfig();
    }

    @Override
    public void withConfig(Map<String, String> config) {
        if (config != null) {
            this.config.putAll(config);
        }
    }

    public Configuration getConfig() {
        return config;
    }

    private void buildDefaultConfig() {
        String jobUid = UUID.randomUUID().toString();
        this.config.put("UNIQUE_ID", jobUid);
        this.config.put("APP_NAME", "eventbridge" + jobUid);
    }

}
