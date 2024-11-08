package com.xing.pattern_23.creational_5.prototype_4;

public class Pig implements Cloneable {

    public Pig() {
        System.out.println("小猪被初始化了...");
    }

    private String name;
    private String doSomething;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoSomething() {
        return doSomething;
    }

    public void setDoSomething(String doSomething) {
        this.doSomething = doSomething;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", doSomething='" + doSomething + '\'' +
                '}'+super.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
