package org.apache.rocketmq.eventbridge.adapter.runtime.fetcher;

import org.apache.rocketmq.eventbridge.adapter.runtime.boot.EventRuleTransfer;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PipelineInputFetcher {


    private static final Logger logger = LoggerFactory.getLogger(PipelineInputFetcher.class);

    private Configuration config;
    private InitFetchRequest initRequest;

    private List<FetcherListener> fetchListeners;

    private long pipelineId;
    private String pipelineName;

    public PipelineInputFetcher(Configuration config) {
        this.config = config;
    }

    /**
     * Init input fetcher reader.
     *
     * @param request
     */
    public void init(InitFetchRequest request) {


        this.pipelineId = request.getPipelineId();
        this.pipelineName = request.getPipelineName();
        this.initRequest = request;
        this.fetchListeners = request.getFetchListeners();
    }

    /**
     * Fetch batch data and trigger process.
     */
    public void fetch(long startWindowId, long windowCount) {
        logger.info("task {} start fetch windowId:{} count:{}", initRequest.getTaskId(),
            startWindowId, windowCount);
        long targetWindowId = startWindowId + windowCount - 1;
        fetch(buildFetchRequest(targetWindowId));
    }

    /**
     * Build the fetch request.
     * @return
     */
    protected FetchRequest buildFetchRequest(long targetBatchId) {
        FetchRequest request = new FetchRequest();
        request.setPipelineId(pipelineId);
        request.setPipelineName(pipelineName);
        request.setTaskId(initRequest.getTaskId());
        request.setTaskIndex(initRequest.getTaskIndex());
        request.setTaskName(initRequest.getTaskName());
        request.setComponentId(initRequest.getComponentId());
        request.setTargetBatchId(targetBatchId);
        request.setInputStreamMap(initRequest.getInputStreamMap());
        return request;
    }

    /**
     * Fetch data according to fetch request and process by worker.
     *
     * @param request
     */
    protected void fetch(FetchRequest request) {
        //TODO Distribute tasks among workers
    }

    public void cancel() {
        // TODO Cancel fetching task.
        //      Shuffle reader should support cancel.
    }

    public void close() {
       //TODO Terminate the task when the task is abnormal
    }
}
