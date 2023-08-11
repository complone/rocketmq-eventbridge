package org.apache.rocketmq.eventbridge.adapter.runtime.env.config;

import java.io.Serializable;

public class ConfigKey implements Serializable {

    private final String key;
    private String description;
    private Object defaultValue;

    public ConfigKey(String key) {
        this.key = key;
    }

    public ConfigKey(String key, Object defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public ConfigKey description(String description) {
        this.description = description;
        return this;
    }

    public ConfigKey defaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }
}
