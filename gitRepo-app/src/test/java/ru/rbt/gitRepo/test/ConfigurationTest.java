package ru.rbt.gitRepo.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.rbt.gitRepo.ConfigurationReader;

/**
 * Created by er23887 on 20.07.2017.
 */
public class ConfigurationTest {

    @Test
    @Ignore
    public void testConfig() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        configurationReader.readConfig();
        Assert.assertNotNull(configurationReader.getJdbcProps().get("host"));
        Assert.assertNotNull(configurationReader.getJdbcProps().get("port"));
        Assert.assertNotNull(configurationReader.getJdbcProps().get("user"));
        Assert.assertNotNull(configurationReader.getJdbcProps().get("pswd"));
    }

    @Test
    public void testConfigUser() {
        ConfigurationReader configurationReader = new ConfigurationReader();
        configurationReader.readConfig();
        Assert.assertNotNull(configurationReader.getJdbcProps().get("user"));
        Assert.assertNotNull(configurationReader.getJdbcProps().get("pswd"));
    }
}
