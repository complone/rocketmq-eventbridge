package org.apache.rocketmq.eventbridge.adapter.runtime.resource;

import org.apache.rocketmq.eventbridge.adapter.runtime.common.entity.TargetRunnerConfig;
import org.apache.rocketmq.eventbridge.adapter.runtime.resource.manager.WorkerInfo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IScheduledWorkerManager {

    /**
     * Init the worker manager by input graph.
     */
    void init(TargetRunnerConfig graph);

    /**
     * Assign workers for execution task of input vertex.
     * @return Workers if assign worker succeed, otherwise empty.
     */
    List<WorkerInfo> assign(Map<String, String> transform);

    /**
     * Release all worker resource for the input vertex.
     */
    void release(Map<String, String> transform);

    /**
     * Clean worker runtime context for used workers by specified clean function.
     */
    void clean(CleanWorkerFunction cleaFunc);

    /**
     * Release all worker to master resource manager.
     */
    void close();

    /**
     * Function interface to clean runtime context for already assigned workers.
     */
    interface CleanWorkerFunction {

        void clean(Set<WorkerInfo> assignedWorkers);

    }
}
