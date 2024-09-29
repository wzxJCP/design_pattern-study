package com.xing.principle.openclose_01;

public class Student implements Human {
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生睡觉");
    }

    public void study() {
        System.out.println("学生学习");
    }
}
