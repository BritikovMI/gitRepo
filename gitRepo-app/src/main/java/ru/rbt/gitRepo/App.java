package ru.rbt.gitRepo;

import gitRepo.api.parser.CliParser;
import ru.rbt.gitrepo.jdbc.JdbcController;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {



    public static void main(String[] args) {
        ConfigurationReader configurationReader = new ConfigurationReader();
        configurationReader.readConfig();
        routeCmd(args);
    }

    private static void routeCmd(String[] args) {
        CliParser cliParser = new CliParser(args);

        if (args[0].equals("o")) {
            //
        } else {
            //
        }
        new JdbcController().doSomething();
    }


}
