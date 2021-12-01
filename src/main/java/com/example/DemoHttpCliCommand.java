package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "demo-http-cli", description = "...",
        mixinStandardHelpOptions = true)
public class DemoHttpCliCommand implements Runnable {
    @Inject
    public GithubClient client;

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DemoHttpCliCommand.class, args);
    }

    public void run() {
        // business logic here
        System.out.println(client.read());
    }
}
