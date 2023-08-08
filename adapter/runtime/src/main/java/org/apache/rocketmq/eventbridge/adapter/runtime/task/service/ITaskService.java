package org.apache.rocketmq.eventbridge.adapter.runtime.task.service;

public interface ITaskService<TASK> {

    /**
     * Start task service.
     */
    void start();

    /**
     * Process event on workerId.
     */
    void process(int workerId, TASK task);

    /**
     * Interrupt running task worker.
     */
    void interrupt(int workerId);

    /**
     * Shutdown task service.
     */
    void shutdown();
}
