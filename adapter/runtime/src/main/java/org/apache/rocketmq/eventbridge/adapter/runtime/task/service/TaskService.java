package org.apache.rocketmq.eventbridge.adapter.runtime.task.service;

import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.ICommand;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.runner.AbstractTaskService;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.runner.TaskRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskService extends AbstractTaskService<ICommand, TaskRunner> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskService.class);

    private static final String WORKER_FORMAT = "bridge-worker-%d";

    private int containerId;

    private int taskNum;

    public TaskService(int containerId, int taskNum, Configuration configuration, String threadFormat) {
        super(threadFormat);
    }


    @Override
    protected TaskRunner[] buildTaskRunner() {
        return new TaskRunner[0];
    }
}
