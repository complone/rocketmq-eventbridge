package org.apache.rocketmq.eventbridge.adapter.runtime.task;

public interface ITaskRunner<TASK> extends Runnable {

    /**
     * Add task into processing queue.
     */
    void add(TASK task);

    /**
     * Interrupt current running task events.
     */
    void interrupt();

    /**
     * Shutdown task runner.
     */
    void shutdown();

}
