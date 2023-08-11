package org.apache.rocketmq.eventbridge.adapter.runtime.task.record;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractMessageIterator <T> implements IMessageIterator{

    private long recordNum;
    protected  T currentValue;

    protected OutputStream outputStream;
    protected InputStream inputStream;

    public AbstractMessageIterator(OutputStream outBuffer) {
        this.outputStream = outBuffer;
    }

}
