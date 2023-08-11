package org.apache.rocketmq.eventbridge.adapter.runtime.task.record;

public class RecordArgs {

    private long windowId;
    private String name;

    public RecordArgs() {
        this.windowId = 0;
        this.name = "";
    }

    public RecordArgs(long windowId) {
        this.windowId = windowId;
    }


    public RecordArgs(long windowId, String name) {
        this.windowId = windowId;
        this.name = name;
    }

    public long getWindowId() {
        return windowId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RecordArgs{" + "windowId=" + windowId + ", name='" + name + '\'' + '}';
    }

}
