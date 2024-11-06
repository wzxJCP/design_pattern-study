package com.xing.principle_7.interfacesegregation_04;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student.sleep();
        student.swim();
    }
}

/**
 * 客户端不应该被迫依赖于它不使用的方法。换句话说，不应该将太多的方法放在一个接口中，而是应该提供更加具体化的接口。
 * 吃东西接口、睡觉接口、游泳接口 3个接口 都继承人类接口；学生类实现这3个接口。
 */