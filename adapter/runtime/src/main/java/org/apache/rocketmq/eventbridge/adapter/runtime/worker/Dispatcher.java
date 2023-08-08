package org.apache.rocketmq.eventbridge.adapter.runtime.worker;


import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.ICommand;
import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.IComposeEvent;
import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.IEvent;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.AbstractTaskRunner;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dispatcher extends AbstractTaskRunner<ICommand> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Dispatcher.class);

    private TaskService taskService;

    public Dispatcher(TaskService taskService) {
        super();
        this.taskService = taskService;
    }

    @Override
    protected void process(ICommand command) {
        switch (command.getEventType()) {
            case COMPOSE:
                for (IEvent event : ((IComposeEvent) command).getEventList()) {
                    process((ICommand) event);
                }
                break;
            case INTERRUPT_TASK:
                LOGGER.info("{} interrupt current running task", command.getWorkerId());
                this.taskService.interrupt(command.getWorkerId());
                break;
            default:
                this.taskService.process(command.getWorkerId(), command);
                break;

        }
    }

}
