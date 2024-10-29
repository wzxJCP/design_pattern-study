package com.xing.principle.openclose_01;

public class Student implements Human {
    @Override
    public void eat() {
        System.out.println("学生在吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("学生在睡觉。");
    }

    public void study() {
        System.out.println("学生在学习。");
    }

    // public void highSchoolStudent() {
    //     System.out.println("我是一名高中生。");
    // }
}
