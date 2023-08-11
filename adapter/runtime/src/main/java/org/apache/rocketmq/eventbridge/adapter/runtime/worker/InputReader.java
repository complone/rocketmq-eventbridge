package org.apache.rocketmq.eventbridge.adapter.runtime.worker;

import org.apache.rocketmq.eventbridge.adapter.runtime.protocol.Message;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class InputReader implements Serializable {

    private LinkedBlockingQueue<Message> inputQueue;

    public InputReader() {
        this.inputQueue = new LinkedBlockingQueue<>();
    }

    /**
     * Add message into input queue.
     */
    public void add(Message message) {
        inputQueue.add(message);
    }

    /**
     * Returns message from input queue.
     */
    public Message poll(long timeout, TimeUnit unit) {
        Message message;
        try {
            message = inputQueue.poll(timeout, unit);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
        return message;
    }
}
