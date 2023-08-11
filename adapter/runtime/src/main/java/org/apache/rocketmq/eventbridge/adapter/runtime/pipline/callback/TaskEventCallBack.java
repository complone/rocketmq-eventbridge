package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.callback;

public class TaskEventCallBack {

    private ICallbackFunction callbackFunction;

    public void addCallBack(ICallbackFunction callbackFunction) {
        this.callbackFunction = callbackFunction;
    }

    public ICallbackFunction getCallbackFunction() {
        return callbackFunction;
    }
}
