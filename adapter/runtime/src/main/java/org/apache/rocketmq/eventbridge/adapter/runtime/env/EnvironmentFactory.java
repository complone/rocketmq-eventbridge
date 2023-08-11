package org.apache.rocketmq.eventbridge.adapter.runtime.env;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

public class EnvironmentFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentFactory.class);

    public static Environment onLocalEnvironment() {
        return onLocalEnvironment(new String[]{});
    }

    public static Environment onLocalEnvironment(String[] args) {
        IEnvironmentArgsParser argsParser = loadEnvironmentArgsParser();
        Map<String, String> config = new HashMap<>(argsParser.parse(args));

        Environment environment = (Environment) loadEnvironment(IEnvironment.EnvType.LOCAL);
        environment.getEnvironmentContext().withConfig(config);
        return environment;
    }




    public static Environment onK8SEnvironment() {
        return (Environment) loadEnvironment(IEnvironment.EnvType.K8S);
    }

    public static Environment onK8SEnvironment(String[] args) {
        Environment environment = (Environment) loadEnvironment(IEnvironment.EnvType.K8S);
        IEnvironmentArgsParser argsParser = loadEnvironmentArgsParser();
        environment.getEnvironmentContext().withConfig(argsParser.parse(args));
        return environment;
    }

    private static IEnvironment loadEnvironment(IEnvironment.EnvType envType) {
        ServiceLoader<IEnvironment> contextLoader = ServiceLoader.load(IEnvironment.class);
        Iterator<IEnvironment> contextIterable = contextLoader.iterator();
        while (contextIterable.hasNext()) {
            IEnvironment environment = contextIterable.next();
            if (environment.getEnvType() == envType) {
                LOGGER.info("loaded IEnvironment implementation {}", environment);
                return environment;
            }
        }
        LOGGER.error("NOT found IEnvironment implementation with type:{}", envType);
        throw new RuntimeException(String.format("NOT found IEnvironment implementation with type:{}", envType));
    }

    private static IEnvironmentArgsParser loadEnvironmentArgsParser() {
        ServiceLoader<IEnvironmentArgsParser> contextLoader = ServiceLoader.load(IEnvironmentArgsParser.class);
        Iterator<IEnvironmentArgsParser> contextIterable = contextLoader.iterator();
        boolean hasNext = contextIterable.hasNext();
        IEnvironmentArgsParser argsParser;
        if (hasNext) {
            argsParser = contextIterable.next();
        } else {
            // Use default argument parser.
            argsParser = new EnvironmentArgumentParser();
        }
        LOGGER.info("loaded IEnvironmentArgsParser implementation {}", argsParser);
        return argsParser;
    }
}
