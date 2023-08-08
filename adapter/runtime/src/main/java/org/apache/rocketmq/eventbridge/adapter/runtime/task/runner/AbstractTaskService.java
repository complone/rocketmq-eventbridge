package org.apache.rocketmq.eventbridge.adapter.runtime.task.runner;

import com.google.common.base.Preconditions;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.ITaskRunner;
import org.apache.rocketmq.eventbridge.adapter.runtime.thread.Executors;
import org.apache.rocketmq.eventbridge.adapter.runtime.utils.ExecutorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

public abstract class AbstractTaskService<TASK, R extends ITaskRunner<TASK>> implements ITaskService<TASK> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractTaskService.class);

    protected ExecutorService executorService;
    private R[] tasks;
    private String threadFormat;

    public AbstractTaskService(String threadFormat) {
        this.threadFormat = threadFormat;
    }

    public void start() {
        this.tasks = buildTaskRunner();
        Preconditions.checkArgument(tasks != null && tasks.length != 0, "must specify at least one task");
        this.executorService = Executors.getExecutorService(tasks.length, threadFormat);
        for (int i = 0; i < tasks.length; i++) {
            executorService.execute(tasks[i]);
        }
    }

    public void process(int workerId, TASK task) {
        tasks[workerId].add(task);
    }

    @Override
    public void interrupt(int workerId) {
        tasks[workerId].interrupt();
    }

    @Override
    public void shutdown() {
        LOGGER.info("shutdown executor service {}", threadFormat);
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].shutdown();
        }
        // try shutdown executor service
        ExecutorUtil.shutdown(executorService);
    }

    public R getRunner(int workerId) {
        return tasks[workerId];
    }

    protected abstract R[] buildTaskRunner();

}
