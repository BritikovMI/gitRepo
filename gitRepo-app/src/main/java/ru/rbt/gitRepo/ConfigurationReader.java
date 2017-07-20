package ru.rbt.gitRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by er23887 on 20.07.2017.
 */
public class ConfigurationReader {

    private final Map<String, String> jdbcProps = new HashMap<String, String>();
    private final Map<String, String> otherProps = new HashMap<String, String>();

    public void readConfig() {
        jdbcProps.put("host", "");
//        jdbcProps.put("port", "");
        jdbcProps.put("user", "");
        jdbcProps.put("pswd", "");

        otherProps.put("name", "Orderes Program 1.0");
    }

    public Map<String, String> getJdbcProps() {
        return jdbcProps;
    }

    public Map<String, String> getOtherProps() {
        return otherProps;
    }
}
