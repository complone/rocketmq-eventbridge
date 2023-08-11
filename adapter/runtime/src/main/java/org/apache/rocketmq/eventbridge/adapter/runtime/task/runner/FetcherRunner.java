package org.apache.rocketmq.eventbridge.adapter.runtime.task.runner;

import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.apache.rocketmq.eventbridge.adapter.runtime.fetcher.IFetchRequest;
import org.apache.rocketmq.eventbridge.adapter.runtime.fetcher.InitFetchRequest;
import org.apache.rocketmq.eventbridge.adapter.runtime.fetcher.PipelineInputFetcher;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.AbstractTaskRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FetcherRunner extends AbstractTaskRunner<IFetchRequest> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FetcherRunner.class);

    private final PipelineInputFetcher fetcher;

    public FetcherRunner(Configuration configuration) {
        this.fetcher = new PipelineInputFetcher(configuration);
    }

    @Override
    protected void process(IFetchRequest task) {
        if (task instanceof InitFetchRequest) {
            fetcher.init((InitFetchRequest) task);
        }
    }

    @Override
    public void interrupt() {
        LOGGER.info("cancel fetcher runner");
        fetcher.cancel();
    }

    @Override
    public void shutdown() {
        super.shutdown();
        fetcher.close();
    }
}
