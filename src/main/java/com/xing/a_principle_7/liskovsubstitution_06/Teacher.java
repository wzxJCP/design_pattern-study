package com.xing.a_principle_7.liskovsubstitution_06;

public class Teacher extends Human {
    public int fun1(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }
}
