package org.apache.rocketmq.eventbridge.adapter.runtime.buffer;

import io.netty.channel.FileRegion;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface OutBuffer {

    /**
     * Get the input stream of this buffer.
     *
     * @return buffer input stream.
     */
    InputStream getInputStream();

    /**
     * Convert this buffer to file region.
     *
     * @return file region.
     */
    FileRegion toFileRegion();

    /**
     * Get the buffer size of this buffer.
     *
     * @return buffer size.
     */
    int getBufferSize();

    /**
     * Write data from a output stream.
     *
     * @param outputStream output stream.
     * @throws IOException io exception.
     */
    void write(OutputStream outputStream) throws IOException;

    /**
     * Set ref count, the number of consumer which handle this buffer.
     *
     * @param refCount ref count.
     */
    void setRefCount(int refCount);

    /**
     * Check if this buffer disposable.
     *
     * @return if disposable.
     */
    boolean isDisposable();

    /**
     * Release this buffer.
     */
    void release();

    interface BufferBuilder {

        OutputStream getOutputStream();

        /**
         * Set the position of the stream.
         *
         * @param position position
         */
        void positionStream(int position);

        /**
         * Get the buffer size.
         *
         * @return buffer size.
         */
        int getBufferSize();

        /**
         * Set memory track.
         */
        void enableMemoryTrack();

        /**
         * Build the buffer.
         *
         * @return buffer.
         */
        OutBuffer build();

        /**
         * Close this builder.
         */
        void close();

    }
}
