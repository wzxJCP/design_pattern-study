package com.xing.a_principle_7.a_04_liskov_substitution;

public class Person_1 {
    protected String name;

    public Person_1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String introduce() {
        return "Hello,我是 " + name + "。";
    }

    public boolean canTeach() {
        return false;
    }
}