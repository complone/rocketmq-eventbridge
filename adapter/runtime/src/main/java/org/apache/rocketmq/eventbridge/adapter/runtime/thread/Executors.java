package org.apache.rocketmq.eventbridge.adapter.runtime.thread;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Executors {

    private static final int DEFAULT_KEEP_ALIVE_MINUTES = 30;
    private static final int DEFAULT_QUEUE_CAPACITY = 1024;
    private static final int DEFAULT_MAGNIFICATION = 2;

    private static Map<String, ExecutorService> boundedExecutors = new HashMap<>();
    private static int CORE_NUM = Runtime.getRuntime().availableProcessors();

    private static String getKey(String type, int bound, int capacity, long keepAliveTime,
                                 TimeUnit unit) {
        return String.format("%s%s%s%s%s", type, bound, capacity, keepAliveTime, unit);
    }

    public static synchronized ExecutorService getService(int bound, int capacity,
                                                          long keepAliveTime, TimeUnit unit) {
        String key = getKey("normal", bound, capacity, keepAliveTime, unit);
        if (boundedExecutors.get(key) == null) {
            ExecutorService boundedExecutor = new ThreadPoolExecutor(bound, bound, keepAliveTime,
                unit, new LinkedBlockingQueue<>(capacity));
            boundedExecutors.put(key, boundedExecutor);
        }
        return boundedExecutors.get(key);
    }

    public static synchronized ExecutorService getMultiCoreExecutorService(int maxMultiple,
                                                                           double magnification) {
        return getExecutorService(maxMultiple, (int) (magnification * CORE_NUM));
    }

    public static synchronized ExecutorService getExecutorService(int maxMultiple, int coreNumber) {
        Preconditions.checkArgument(coreNumber > 0 && coreNumber <= maxMultiple * CORE_NUM,
            "executor core not right " + coreNumber + " is greater than " + maxMultiple * CORE_NUM);
        return getService(coreNumber, Integer.MAX_VALUE, DEFAULT_KEEP_ALIVE_MINUTES,
            TimeUnit.MINUTES);
    }

    public static synchronized ExecutorService getExecutorService(int coreNumber,
                                                                  String threadFormat) {
        int maxThreads = 10 * CORE_NUM;
        Preconditions.checkArgument(coreNumber > 0 && coreNumber <= maxThreads,
            "executor threads should be smaller than " + maxThreads);
        Preconditions.checkArgument(StringUtils.isNotEmpty(threadFormat),
            "thread format couldn't" + " be empty");
        return getNamedService(coreNumber, Integer.MAX_VALUE, DEFAULT_KEEP_ALIVE_MINUTES,
            TimeUnit.MINUTES, threadFormat, null);
    }

    public static synchronized ExecutorService getExecutorService(int coreNumber,
                                                                  String threadFormat,
                                                                  Thread.UncaughtExceptionHandler handler) {
        int maxThreads = 10 * CORE_NUM;
        Preconditions.checkArgument(coreNumber > 0 && coreNumber <= maxThreads,
            "executor threads should be smaller than " + maxThreads);
        Preconditions.checkArgument(StringUtils.isNotEmpty(threadFormat),
            "thread format couldn't" + " be empty");
        return getNamedService(coreNumber, Integer.MAX_VALUE, DEFAULT_KEEP_ALIVE_MINUTES,
            TimeUnit.MINUTES, threadFormat, handler);
    }

    public static synchronized ExecutorService getExecutorService(int maxMultiple, int coreNumber,
                                                                  String threadFormat) {
        int maxThreads = maxMultiple * CORE_NUM;
        Preconditions.checkArgument(coreNumber > 0 && coreNumber <= maxThreads,
            "executor threads should be smaller than " + maxThreads);
        Preconditions.checkArgument(StringUtils.isNotEmpty(threadFormat),
            "thread format couldn't" + " be empty");
        return getNamedService(coreNumber, Integer.MAX_VALUE, DEFAULT_KEEP_ALIVE_MINUTES,
            TimeUnit.MINUTES, threadFormat, null);
    }

    private static synchronized ExecutorService getNamedService(int bound, int capacity,
                                                                long keepAliveTime, TimeUnit unit,
                                                                String threadFormat,
                                                                Thread.UncaughtExceptionHandler handler) {
        String key = getKey(threadFormat, bound, capacity, keepAliveTime, unit);
        if (boundedExecutors.get(key) == null || boundedExecutors.get(key).isShutdown()) {
            ThreadFactoryBuilder builder  = new ThreadFactoryBuilder()
                .setNameFormat(threadFormat)
                .setDaemon(true);
            if (handler != null) {
                builder.setUncaughtExceptionHandler(handler);
            }
            ExecutorService boundedExecutor = new ThreadPoolExecutor(bound, bound, keepAliveTime,
                unit, new LinkedBlockingQueue<>(capacity), builder.build());
            boundedExecutors.put(key, boundedExecutor);
        }
        return boundedExecutors.get(key);
    }

}
