package org.apache.rocketmq.eventbridge.adapter.runtime.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SleepUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(SleepUtils.class);

    public static void sleepSecond(long second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            LOGGER.warn("sleep {}s interrupted", second);
            throw new RuntimeException(e);
        }
    }

    public static void sleepMilliSecond(long mileSecond) {
        try {
            TimeUnit.MILLISECONDS.sleep(mileSecond);
        } catch (InterruptedException e) {
            LOGGER.warn("sleepMilliSecond {}ms interrupted", mileSecond);
            throw new RuntimeException(e);
        }
    }
}
