package org.apache.rocketmq.eventbridge.adapter.runtime.env;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.rocketmq.eventbridge.adapter.runtime.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class EnvironmentArgumentParser implements IEnvironmentArgsParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentArgumentParser.class);

    private static final String CLUSTER_ARGS = "cluster";
    private static final String BRIDGE_PREFIX = "bridge";


    @Override
    public Map<String, String> parse(String[] args) {
        if (args == null || args.length == 0) {
            return Collections.emptyMap();
        }

        LOGGER.warn("user config: {}", Arrays.asList(args));
        Map<String, String> mainArgs = JsonUtils.parseJson2map(StringEscapeUtils.unescapeJava(args[0]));


        Map<String, String> clusterArgs = null;
        if (mainArgs.containsKey(CLUSTER_ARGS)) {
            clusterArgs = JsonUtils.parseJson2map(mainArgs.remove(CLUSTER_ARGS));
        }

        LOGGER.info("build Env with clusterArgs: {}", JsonUtils.toJsonString(clusterArgs));

        Map<String, String> envConfig = new HashMap<>();

        if (clusterArgs != null) {
            envConfig.putAll(clusterArgs);
        }

        LOGGER.info("build envConfig: {}", JsonUtils.toJsonString(envConfig));

        return envConfig;
    }

    private Map<String, String> parseSystemArgs(String jsonStr) {
        Map<String, String> systemArgs = JsonUtils.parseJson2map(jsonStr);


        Map<String, String> finalSystemArgs = new HashMap<>();
        fillSystemConfig(finalSystemArgs, systemArgs);


        return finalSystemArgs;
    }


    private static void fillSystemConfig(Map<String, String> finalSystemArgs, Map<String, String> tmp) {
        for (Map.Entry<String, String> entry : tmp.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.startsWith(BRIDGE_PREFIX)) {
                finalSystemArgs.put(key, value);
            } else {
                LOGGER.warn("ignore nonstandard system config: {} {}", key, value);
            }
        }
    }

}
