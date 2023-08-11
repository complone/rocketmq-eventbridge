package org.apache.rocketmq.eventbridge.adapter.runtime.scheduler;

public interface IPipelineResult<R> {

    /**
     * PipelineTask execute successful.
     * @return true if pipeline execute successful, otherwise false.
     */
    boolean isSuccess();

    /**
     * Get the result of PipelineTask.
     * Will block until PipelineTask success to return result.
     * @return the final pipeline result.
     */
    R get();
}
