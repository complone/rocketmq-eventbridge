package org.apache.rocketmq.eventbridge.adapter.runtime.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTaskRunner<TASK> implements ITaskRunner<TASK> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractTaskRunner.class);
    private static final int POOL_TIMEOUT = 100;

    private final LinkedBlockingQueue<TASK> taskQueue;
    protected volatile boolean running;

    public AbstractTaskRunner() {
        this.running = true;
        this.taskQueue = new LinkedBlockingQueue<>();
    }

    @Override
    public void run() {
        while (running) {
            try {
                TASK task = taskQueue.poll(POOL_TIMEOUT, TimeUnit.MILLISECONDS);
                if (running && task != null) {
                    process(task);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (Throwable t) {
                LOGGER.error(t.getMessage(), t);
                throw new RuntimeException(t);
            }
        }
    }

    @Override
    public void add(TASK task) {
        this.taskQueue.add(task);
    }

    protected abstract void process(TASK task);

    @Override
    public void interrupt() {
        // TODO interrupt running task.
    }

    @Override
    public void shutdown() {
        this.running = false;
    }
}
