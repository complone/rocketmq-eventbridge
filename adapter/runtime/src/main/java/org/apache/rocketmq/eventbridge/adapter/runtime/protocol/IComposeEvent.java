package org.apache.rocketmq.eventbridge.adapter.runtime.protocol;

import java.util.List;

/**
 * A compose command contains a collection of basic cycle commands.
 */
public interface IComposeEvent extends IEvent {

    /**
     * A collection of basic cycle command, e.g:
     *     {@link EventType#INIT_CYCLE}, {@link EventType#EXECUTE_COMPUTE} and {@link EventType#BARRIER}
     */
    List<IEvent> getEventList();
}
