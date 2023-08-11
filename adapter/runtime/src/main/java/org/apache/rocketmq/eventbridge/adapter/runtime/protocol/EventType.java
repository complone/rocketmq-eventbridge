package org.apache.rocketmq.eventbridge.adapter.runtime.protocol;

import java.io.Serializable;

/**
 * The enum class for all event types.
 */
public enum EventType implements Serializable {

    /**
     * A basic cycle execution command to assign resource and initialize cycle context.
     */
    INIT_CYCLE,

    /**
     * A basic cycle execution command to assign loop data exchange for iteration.
     */
    INIT_ITERATION,

    /**
     * A basic cycle execution command to load graph vertex and edge..
     */
    PRE_GRAPH_PROCESS,

    /**
     * A basic cycle execution command to reset input or output shuffle descriptors.
     */
    REASSIGN,

    /**
     * A basic cycle command to start one cycle iteration.
     * The command send from scheduler to cycle heads.
     */
    EXECUTE_COMPUTE,

    /**
     * A basic cycle command to start one cycle iteration to fetch source.
     * The command send from scheduler to cycle heads.
     */
    LAUNCH_SOURCE,

    /**
     * A basic cycle command to start one the first round of iteration cycle.
     * The command send from scheduler to cycle heads.
     */
    EXECUTE_FIRST_ITERATION,

    /**
     * A basic cycle command denotes the end of a cycle iteration.
     * The command send from cycle tails to scheduler.
     */
    DONE,

    /**
     * A basic cycle command that transfer between cycle intermediate tasks.
     */
    BARRIER,

    /**
     * A basic cycle command to finish iteration cycle.
     */
    FINISH_ITERATION,

    /**
     * A basic cycle command to clean up cycle context after all iterations finished.
     */
    CLEAN_CYCLE,

    /**
     * A compose command contains a collection of basic cycle command.
     */
    COMPOSE,

    /**
     * Clean env after all cycle of a pipeline task finished.
     */
    CLEAN_ENV,

    /**
     * Rollback to certain iteration id.
     */
    ROLLBACK,

    /**
     * Interrupt running task.
     */
    INTERRUPT_TASK,

    /**
     * Open container event.
     */
    OPEN_CONTAINER,

    /**
     * Response event by open container.
     */
    OPEN_CONTAINER_RESPONSE,

    /**
     * A inner message event to trigger processing worker to execute.
     */
    MESSAGE,

    /**
     * Create task.
     */
    CREATE_TASK,

    /**
     * Destroy task.
     */
    DESTROY_TASK,

    /**
     * A basic cycle command to create worker.
     */
    CREATE_WORKER,

    /**
     * Stash current worker that can be reused on demand.
     */
    STASH_WORKER,

    /**
     * Pop worker to reuse worker for following events.
     */
    POP_WORKER,

    /**
     * Collect execute result data.
     */
    COLLECT_DATA,
}
