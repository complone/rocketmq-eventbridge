package org.apache.rocketmq.eventbridge.adapter.runtime.task;


import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window.IWindow;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window.PWindowSource;
import org.apache.rocketmq.eventbridge.adapter.runtime.source.SourceFunction;

import java.io.Serializable;

public interface IPipelineTaskContext extends Serializable {

    /**
     * Returns pipeline task id.
     */
    long getPipelineTaskId();

    /**
     * Returns pipeline config.
     */
    Configuration getConfig();

    /**
     * Build window source with source function and window.
     */
    <T> PWindowSource<T> buildSource(SourceFunction<T> sourceFunction, IWindow<T> window);



}
