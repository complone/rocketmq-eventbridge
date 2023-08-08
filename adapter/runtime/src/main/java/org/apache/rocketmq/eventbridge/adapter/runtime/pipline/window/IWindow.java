package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window;


import java.io.Serializable;

public interface IWindow<T> extends Function, Serializable {

    /**
     * Returns the window id.
     */
    long windowId();

    /**
     * Initialize window with windowId.
     */
    void initWindow(long windowId);

    /**
     * Assign window id for value.
     */
    long assignWindow(T value);

}
