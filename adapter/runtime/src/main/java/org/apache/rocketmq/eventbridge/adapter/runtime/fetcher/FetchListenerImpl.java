package org.apache.rocketmq.eventbridge.adapter.runtime.fetcher;


import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.Message;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.pipeline.PipelineMessage;
import org.apache.rocketmq.eventbridge.adapter.runtime.worker.InputReader;

public class FetchListenerImpl implements FetcherListener {

    private InputReader inputReader;

    public FetchListenerImpl(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    /**
     * Trigger processor to process message.
     */
    @Override
    public void onMessage(PipelineMessage message) {
        long windowId = message.getWindowId();
        inputReader.add(new Message(windowId, message));
    }

    @Override
    public void onCompleted(long windowId, long windowCount) {
        inputReader.add(new Message(windowId, windowCount));
    }
}
