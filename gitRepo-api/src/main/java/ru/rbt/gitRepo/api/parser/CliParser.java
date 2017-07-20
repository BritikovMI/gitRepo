package ru.rbt.gitRepo.api.parser;

import java.util.Arrays;
import java.util.List;

/**
 * Created by er23887 on 20.07.2017.
 */
public class CliParser {

    private List<String> args;

    public CliParser(String args[]) {
        this.args = Arrays.asList(args);
    }

    public CmdAction getAction() {
        return CmdAction.customers;
    }

    public String getQuery() {
        return null;
    }

    enum CmdAction {
        customers, orders, orderItems, products
    }

}
