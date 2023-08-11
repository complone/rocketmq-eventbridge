package org.apache.rocketmq.eventbridge.adapter.runtime.env;

import org.apache.rocketmq.eventbridge.adapter.runtime.scheduler.IPipelineResult;

import java.io.Serializable;

public interface IEnvironment extends Serializable {

    /**
     * Initialize environment.
     */
    void init();

    /**
     * Submit pipeline by bridge client.
     */
    IPipelineResult submit();

    /**
     * Shutdown bridge client.
     */
    void shutdown();

    /**
     * Returns the env type.
     */
    EnvType getEnvType();

    enum EnvType {

        /**
         * K8s cluster.
         */
        K8S,

        /**
         * Local.
         */
        LOCAL,
    }

}
