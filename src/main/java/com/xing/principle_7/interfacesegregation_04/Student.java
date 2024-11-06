package com.xing.principle_7.interfacesegregation_04;

public class Student implements EatAction, SleepAction, SwimAction {
    @Override
    public void eat() {
        System.out.println("学生正在吃东西。");
    }

    @Override
    public void sleep() {
        System.out.println("学生正在睡觉。");
    }

    @Override
    public void swim() {
        System.out.println("学生正在游泳。");
    }
}
