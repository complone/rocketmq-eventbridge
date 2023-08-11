package org.apache.rocketmq.eventbridge.adapter.runtime.task.pipeline;

public interface PipelineEvent {

    /**
     * Get the window id of this pipeline event.
     *
     * @return window id.
     */
    long getWindowId();

}
