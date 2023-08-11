package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.service;


import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window.IWindow;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window.PWindowSource;
import org.apache.rocketmq.eventbridge.adapter.runtime.source.SourceFunction;

import java.io.Serializable;

public interface IPipelineServiceContext extends Serializable {

    /**
     * Returns session id.
     */
    long sessionId();

    /**
     * Get the request.
     */
    Object getRequest();

    /**
     * Collect response.
     */
    void response(Object response);

    /**
     * Returns configuration of pipeline service context.
     */
    Configuration getConfig();

    /**
     * Build window source with corresponding source function and window.
     */
    <T> PWindowSource<T> buildSource(SourceFunction<T> sourceFunction, IWindow<T> window);

}
