package org.apache.rocketmq.eventbridge.adapter.runtime.worker;


import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.IEventContext;

import java.io.Serializable;

public interface IWorkerContext extends Serializable {

    /**
     * Init the worker context.
     */
    void init(IEventContext eventContext);

    /**
     * Close runtime resource of worker.
     */
    void close();

}
