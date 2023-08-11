package org.apache.rocketmq.eventbridge.adapter.runtime.protocol;

import java.io.Serializable;

/**
 * An interface that defined the data/control flow of the cycle scheduling.
 */
public interface IEvent extends Serializable {

    /**
     * Return the type of event.
     */
    EventType getEventType();

}
