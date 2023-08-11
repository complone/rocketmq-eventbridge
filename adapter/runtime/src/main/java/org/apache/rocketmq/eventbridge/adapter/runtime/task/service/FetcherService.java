package org.apache.rocketmq.eventbridge.adapter.runtime.task.service;

import com.google.common.base.Preconditions;
import org.apache.rocketmq.eventbridge.adapter.runtime.env.config.Configuration;
import org.apache.rocketmq.eventbridge.adapter.runtime.fetcher.IFetchRequest;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.runner.AbstractTaskService;
import org.apache.rocketmq.eventbridge.adapter.runtime.task.runner.FetcherRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class FetcherService extends AbstractTaskService<IFetchRequest, FetcherRunner> implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(FetcherService.class);

    private static final String FETCHER_FORMAT = "bridge-fetcher-%d";

    private int slots;
    private Configuration configuration;

    public FetcherService(int slots, Configuration configuration) {
        super(FETCHER_FORMAT);
        this.slots = slots;
        this.configuration = configuration;
    }

    @Override
    protected FetcherRunner[] buildTaskRunner() {
        Preconditions.checkArgument(slots > 0, "fetcher pool should be larger than 0");
        FetcherRunner[] fetcherRunners = new FetcherRunner[slots];
        for (int i = 0; i < slots; i++) {
            FetcherRunner runner = new FetcherRunner(configuration);
            fetcherRunners[i] = runner;
        }
        return fetcherRunners;
    }
}
