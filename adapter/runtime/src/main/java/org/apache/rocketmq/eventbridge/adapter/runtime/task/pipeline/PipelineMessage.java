package org.apache.rocketmq.eventbridge.adapter.runtime.task.pipeline;

import org.apache.rocketmq.eventbridge.adapter.runtime.task.record.RecordArgs;

public class PipelineMessage<T> implements PipelineEvent{

    private final RecordArgs recordArgs;

    public PipelineMessage(long batchId, String streamName, RecordArgs recordArgs) {
        this.recordArgs = recordArgs;
    }

    @Override
    public long getWindowId() {
        return 0;
    }
}
