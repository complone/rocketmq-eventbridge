package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.callback;

public interface ICallbackFunction {

    /**
     * Pass window id by callback.
     */
    void window(long windowId);

    /**
     * Logical definition of all Windows finished.
     */
    void terminal();
}
