package org.apache.rocketmq.eventbridge.adapter.runtime.env.config;

import java.io.Serializable;

public class ConfigKeys implements Serializable {

    public static ConfigKeyBuilder key(String key) {
        return new ConfigKeyBuilder(key);
    }

    public static class ConfigKeyBuilder {

        private final String key;

        public ConfigKeyBuilder(String key) {
            this.key = key;
        }

        public ConfigKey defaultValue(Object defaultValue) {
            return new ConfigKey(key, defaultValue);
        }

        public ConfigKey noDefaultValue() {
            return new ConfigKey(key);
        }

    }

}
