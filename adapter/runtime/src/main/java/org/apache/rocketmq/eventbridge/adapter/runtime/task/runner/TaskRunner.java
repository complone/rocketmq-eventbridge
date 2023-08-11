package org.apache.rocketmq.eventbridge.adapter.runtime.task.runner;


import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.ICommand;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.AbstractTaskRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskRunner extends AbstractTaskRunner<ICommand> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskRunner.class);

    public TaskRunner() {
        super();
    }

    @Override
    protected void process(ICommand command) {
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }
}
