package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.service;

import java.io.Serializable;

public interface PipelineService extends Serializable {

    /**
     * Define the execution logic of service.
     */
    void execute(IPipelineServiceContext pipelineServiceContext);

}
