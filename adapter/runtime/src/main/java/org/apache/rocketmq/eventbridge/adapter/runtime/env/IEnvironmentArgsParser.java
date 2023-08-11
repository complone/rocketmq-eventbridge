package org.apache.rocketmq.eventbridge.adapter.runtime.env;

import java.util.Map;

public interface IEnvironmentArgsParser {

    /**
     * Parse input arguments.
     */
    Map<String, String> parse(String[] args);
}
