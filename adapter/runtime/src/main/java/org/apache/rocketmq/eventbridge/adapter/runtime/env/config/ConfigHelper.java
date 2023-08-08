
package org.apache.rocketmq.eventbridge.adapter.runtime.env.config;

import java.util.Map;

public class ConfigHelper {

    public static int getInteger(Map config, String configKey) {
        if (config.containsKey(configKey)) {
            return Integer.valueOf(String.valueOf(config.get(configKey)));
        } else {
            throw new RuntimeException(configKey);
        }
    }

    public static int getIntegerOrDefault(Map config, String configKey, int defaultValue) {
        if (config.containsKey(configKey)) {
            return Integer.valueOf(String.valueOf(config.get(configKey)));
        } else {
            return defaultValue;
        }
    }

    public static long getLong(Map config, String configKey) {
        if (config.containsKey(configKey)) {
            return Long.valueOf(String.valueOf(config.get(configKey)));
        } else {
            throw new RuntimeException(configKey);
        }
    }

    public static long getLongOrDefault(Map config, String configKey, long defaultValue) {
        if (config.containsKey(configKey)) {
            return Long.valueOf(String.valueOf(config.get(configKey)));
        } else {
            return defaultValue;
        }
    }

    public static boolean getBoolean(Map config, String configKey) {
        if (config.containsKey(configKey)) {
            return Boolean.valueOf(String.valueOf(config.get(configKey)));
        } else {
            throw new RuntimeException(configKey);
        }
    }

    public static boolean getBooleanOrDefault(Map config, String configKey, boolean defaultValue) {
        if (config.containsKey(configKey)) {
            return Boolean.valueOf(String.valueOf(config.get(configKey)));
        } else {
            return defaultValue;
        }
    }

    public static String getString(Map config, String configKey) {
        if (config.containsKey(configKey)) {
            return String.valueOf(config.get(configKey));
        } else {
            throw new RuntimeException("Missing config:'" + configKey + "'");
        }
    }

    public static String getStringOrDefault(Map config, String configKey, String defaultValue) {
        if (config.containsKey(configKey)) {
            return String.valueOf(config.get(configKey));
        } else {
            return defaultValue;
        }
    }

    public static Double getDoubleOrDefault(Map config, String configKey, double defaultValue) {
        if (config.containsKey(configKey)) {
            return Double.valueOf(String.valueOf(config.get(configKey)));
        } else {
            return defaultValue;
        }
    }

    public static Double getDouble(Map config, String configKey) {
        if (config.containsKey(configKey)) {
            return Double.valueOf(String.valueOf(config.get(configKey)));
        } else {
            throw new RuntimeException(configKey);
        }
    }

}
