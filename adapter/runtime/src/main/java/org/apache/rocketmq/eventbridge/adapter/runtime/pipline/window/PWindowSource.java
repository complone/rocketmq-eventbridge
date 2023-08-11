package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window;



import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.PWindowStream;

import java.util.Map;

public interface PWindowSource<T> extends PWindowStream<T> {

    @Override
    PWindowSource<T> withConfig(Map map);

    @Override
    PWindowSource<T> withConfig(String key, String value);


    @Override
    PWindowSource<T> withParallelism(int parallelism);

}
