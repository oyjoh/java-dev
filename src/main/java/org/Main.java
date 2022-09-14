package org;


import org.cmds.Mul;
import org.cmds.Sum;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.RunAll;

import java.util.Locale;
import java.util.concurrent.Callable;

@Command(name = "calculator", mixinStandardHelpOptions = true, subcommands = {Sum.class, Mul.class,
}, description = "Simple calculator")
public class Main implements Callable<Integer> {

    @CommandLine.Option(names = {"-t", "threads"}, scope = CommandLine.ScopeType.INHERIT)
    public int threads;

    @Override
    public Integer call() throws Exception {
        return 0;
    }


    public static void main(String[] args) {
        CommandLine cmd = new CommandLine(new Main());
        cmd.setExecutionStrategy(new RunAll()); // default is RunLast
        cmd.execute(args);

        if (args.length == 0) {
            cmd.usage(System.out);
        }
    }
}
