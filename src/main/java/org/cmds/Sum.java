package org.cmds;

import org.Main;
import picocli.CommandLine;

import java.util.Arrays;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "sum", description = "sum list of numbers")
public class Sum implements Callable<Integer> {

    @CommandLine.ParentCommand
    private Main parent;

    @CommandLine.Parameters(description = "Integers")
    int[] params;

    @CommandLine.Option(names = {"-a"})
    boolean a;

    @CommandLine.Option(names = {"-b"})
    boolean b;

    @Override
    public Integer call() throws Exception {
        System.out.println(parent.threads);
        System.out.println(a);
        System.out.println(b);
        System.out.println("res: " + (Arrays.stream(params).sum()));
        return 0;
    }
}
