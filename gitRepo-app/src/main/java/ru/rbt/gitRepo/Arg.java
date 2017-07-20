package ru.rbt.gitRepo;

/**
 * Created by er23887 on 28.06.2017.
 */
public class Arg {

    private String name;

    public Arg() {
    }

    public Arg(String name, String dataType) {
        this.name = name;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " IN ";
    }
}
