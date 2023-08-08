package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.encoder;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public interface IEncoder<T> extends Serializable {

    /**
     * Encode an object to output stream.
     *
     * @param data data
     * @param outputStream output stream
     * @throws IOException IO exception
     */
    void encode(T data, OutputStream outputStream) throws IOException;

    /**
     * Decode an object from input stream.
     *
     * @param inputStream input stream
     * @return data
     * @throws IOException IO exception
     */
    T decode(InputStream inputStream) throws IOException;

}
