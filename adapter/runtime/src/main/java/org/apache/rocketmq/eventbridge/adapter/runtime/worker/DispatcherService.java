package org.apache.rocketmq.eventbridge.adapter.runtime.worker;


import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.ICommand;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.runner.AbstractTaskService;

public class DispatcherService extends AbstractTaskService<ICommand, Dispatcher> {

    private static final String MESSAGE_FORMAT = "geaflow-message-%d";

    private Dispatcher dispatcher;

    public DispatcherService(Dispatcher dispatcher) {
        super(MESSAGE_FORMAT);
        this.dispatcher = dispatcher;
    }

    @Override
    public Dispatcher[] buildTaskRunner() {
        return new Dispatcher[]{dispatcher};
    }
}
