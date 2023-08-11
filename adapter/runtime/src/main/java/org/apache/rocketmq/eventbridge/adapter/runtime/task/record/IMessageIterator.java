package org.apache.rocketmq.eventbridge.adapter.runtime.task.record;

import java.util.Iterator;

public interface IMessageIterator<T> extends Iterator<T> {
    /**
     * Get total record accessed.
     *
     * @return total record number.
     */
    long getSize();

    /**
     * Close this iterator.
     */
    void close();
}
