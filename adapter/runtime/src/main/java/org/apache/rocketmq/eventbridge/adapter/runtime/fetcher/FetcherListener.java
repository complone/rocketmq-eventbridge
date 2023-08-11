package org.apache.rocketmq.eventbridge.adapter.runtime.fetcher;

import org.apache.rocketmq.eventbridge.adapter.runtime.task.pipeline.PipelineMessage;

public interface FetcherListener {

    /**
     * Trigger processor to process message.
     */
    void onMessage(PipelineMessage message);

    /**
     * Trigger processor to process barrier.
     */
    void onCompleted(long windowId, long windowCount);
}
