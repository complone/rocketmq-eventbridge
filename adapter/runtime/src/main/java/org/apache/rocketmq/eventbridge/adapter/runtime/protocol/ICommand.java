package org.apache.rocketmq.eventbridge.adapter.runtime.protocol;

/**
 * A command is the event of control flow of among cycle scheduling.
 */
public interface ICommand extends IEvent {

    /**
     * Define the target worker to execute the event.
     */
    int getWorkerId();
}
