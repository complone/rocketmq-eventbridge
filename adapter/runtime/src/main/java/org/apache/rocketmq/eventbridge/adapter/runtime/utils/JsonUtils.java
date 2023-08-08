package org.apache.rocketmq.eventbridge.adapter.runtime.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ContainerNode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JsonUtils {

    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static Map<String, String> parseJson2map(String str) {
        try {
            JsonNode jsonNode = MAPPER.readTree(str);
            Map<String, String> map = new HashMap<>();
            Iterator<String> fieldNames = jsonNode.fieldNames();
            while (fieldNames.hasNext()) {
                String key = fieldNames.next();
                JsonNode value = jsonNode.get(key);
                if (value instanceof ContainerNode) {
                    map.put(key, value.toString());
                } else {
                    map.put(key, value.asText());
                }
            }
            return map;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toJsonString(Object object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
