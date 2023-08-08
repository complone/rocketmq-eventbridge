package org.apache.rocketmq.eventbridge.adapter.runtime.task;

import java.io.Serializable;

public interface PipelineTask extends Serializable {

    /**
     * Define the execution logic of task.
     */
    void execute(IPipelineTaskContext pipelineTaskCxt);

}
