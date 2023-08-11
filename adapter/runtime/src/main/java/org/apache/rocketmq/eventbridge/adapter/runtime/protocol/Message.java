package org.apache.rocketmq.eventbridge.adapter.runtime.protocol;


import org.apache.rocketmq.eventbridge.adapter.runtime.task.pipeline.PipelineMessage;

/**
 * A message which is processed by worker.
 */
public class Message<T> implements IMessage {

    private final long windowId;
    private PipelineMessage message;
    private long windowCount;

    public Message(long windowId, PipelineMessage message) {
        this.windowId = windowId;
        this.message = message;
    }

    public Message(long windowId, long windowCount) {
        this.windowId = windowId;
        this.windowCount = windowCount;
    }

    public long getWindowId() {
        return windowId;
    }

    public PipelineMessage getMessage() {
        return message;
    }

    public long getWindowCount() {
        return windowCount;
    }

    @Override
    public EventType getEventType() {
        return EventType.MESSAGE;
    }
}
