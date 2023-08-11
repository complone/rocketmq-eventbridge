package org.apache.rocketmq.eventbridge.adapter.runtime.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class ExecutorUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExecutorUtil.class);

    private static final int SHUTDOWN_TIMEOUT_MS = 1000;

    public static void execute(ExecutorService service, Runnable command, ExceptionHandler handler) {
        service.execute(() -> {
            try {
                command.run();
            } catch (Throwable throwable) {
                handler.handle(throwable);
            }
        });
    }

    public static void spinLockMs(Supplier<Boolean> condition, Runnable checkFun, long ms) {
        while (!condition.get()) {
            SleepUtils.sleepMilliSecond(ms);
            checkFun.run();
        }
    }

    public static void shutdown(ExecutorService executorService, long timeout, TimeUnit timeUnit) {
        LOGGER.info("shutdown executor service {}", executorService);
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(timeout, timeUnit)) {
                LOGGER.info("shutdown executor service force");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            LOGGER.warn("Interrupted when shutdown executor service", e);
        }
    }

    public static void shutdown(ExecutorService executorService) {
        shutdown(executorService, SHUTDOWN_TIMEOUT_MS, TimeUnit.MILLISECONDS);
    }

    public interface ExceptionHandler {
        void handle(Throwable exp);
    }

}
