package org.apache.rocketmq.eventbridge.adapter.runtime.buffer;

import io.netty.channel.FileRegion;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MemoryBuffer implements OutBuffer {

    private static final int INITIAL_BUFFER_SIZE = 4096;
    private byte[] bytes;


    public MemoryBuffer(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public InputStream getInputStream() {
        return new ByteArrayInputStream(bytes);
    }

    @Override
    public int getBufferSize() {
        return bytes == null ? 0 : bytes.length;
    }

    // TODO Implement reference counting
    @Override
    public void write(OutputStream outputStream) throws IOException {
        if (bytes != null) {
            outputStream.write(bytes);
        }
    }

    @Override
    public void setRefCount(int refCount) {

    }

    @Override
    public boolean isDisposable() {
        return false;
    }

    @Override
    public void release() {

    }

    @Override
    public FileRegion toFileRegion() {
        return null;
    }
}
