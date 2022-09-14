package org.cmds;

import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "mul", description = "mul two numbers")
public class Mul implements Callable<Integer> {

    @CommandLine.Option(names = {"-a"})
    int a;

    @CommandLine.Option(names = {"-b"})
    int b;

    @Override
    public Integer call() throws Exception {
        System.out.println(CommandLine.ScopeType.valueOf("threads"));
        System.out.println("res: " + (a*b));
        return 0;
    }
}