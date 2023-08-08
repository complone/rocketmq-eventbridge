package org.apache.rocketmq.eventbridge.adapter.runtime.source;


import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window.Function;
import org.apache.rocketmq.eventbridge.adapter.runtime.pipline.window.IWindow;

public interface SourceFunction<T> extends Function {

    /**
     * Initialize source function.
     */
    void init(int parallel, int index);

    /**
     * Fetch data from source by window, and collect data by ctx.
     * @param window Used to split windows for source.
     * @param ctx The source context.
     */
    boolean fetch(IWindow<T> window, SourceContext<T> ctx) throws Exception;

    /**
     * Close source function.
     */
    void close();

    interface SourceContext<T> {

        /**
         * Partition element data.
         */
        boolean collect(T element) throws Exception;

    }

}
