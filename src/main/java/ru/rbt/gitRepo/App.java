package ru.rbt.gitRepo;

import ru.rbt.gitRepo.api.parser.CliParser;
import ru.rbt.gitrepo.jdbc.JdbcController;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {

    private final static Map<String, String> jdbcProps = new HashMap<String, String>();

    public static void main(String[] args) {
        readConfig(args);
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

    private static void readConfig(String[] args) {
        jdbcProps.put("host", "");
        jdbcProps.put("port", "");
        jdbcProps.put("user", "");
        jdbcProps.put("pswd", "");
    }
}
