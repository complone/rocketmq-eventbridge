

package org.apache.rocketmq.eventbridge.adapter.runtime.pipline;


import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.encoder.IEncoder;

import java.util.Map;

public interface PWindowStream<T>  {

    /**
     * Set config.
     */
    PWindowStream<T> withConfig(Map map);

    /**
     * Set config with key value pair.
     */
    PWindowStream<T> withConfig(String key, String value);


    /**
     * Set parallelism of stream.
     */
    PWindowStream<T> withParallelism(int parallelism);

    /**
     * Set encoder for performance.
     */
    PWindowStream<T> withEncoder(IEncoder<T> encoder);

    /**
     * Returns the parallelism.
     */
    int getParallelism();
}
