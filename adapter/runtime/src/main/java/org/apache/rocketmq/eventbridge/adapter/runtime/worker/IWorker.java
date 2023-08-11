package org.apache.rocketmq.eventbridge.adapter.runtime.worker;

import java.io.Serializable;

public interface IWorker<I, O> extends Serializable {

    /**
     * Open worker processor.
     */
    void open(IWorkerContext workerContext);

    /**
     * Init worker processor runtime info.
     */
    void init(long windowId);

    /**
     * Worker do processing of processor.
     */
    O process(I input);

    /**
     * Worker finish processing of processor.
     */
    void finish(long windowId);

    /**
     * Interrupt the processing of current window.
     */
    void interrupt();

    /**
     * Release worker resource if needed.
     */
    void close();

    /**
     * Returns the runtime context of worker.
     */
    IWorkerContext getWorkerContext();
}
