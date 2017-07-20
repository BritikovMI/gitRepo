package ru.rbt.gitRepo;

import gitRepo.api.parser.CliParser;
import ru.rbt.gitrepo.jdbc.JdbcController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("START!!!!!!!!!!!!!!!!!!!!");
        ConfigurationReader configurationReader = new ConfigurationReader();
        configurationReader.readConfig();
        routeCmd(args);
        System.out.println("DONE!!!!!!!!!!!!!!!!!!!!!!");
    }

    private static void routeCmd(String[] args) {
        CliParser cliParser = new CliParser(args);

        if (args.length < 1) {
            System.out.println("No Arguments Specified");
            //System.exit(1);
            return;
        }

        if (args[0].equals("o")) {
            System.out.println("args[0] = " + args[0]);
        } else {
            System.out.println("args = " + Arrays.toString(args));
        }
        new JdbcController().doSomething();
    }


}
