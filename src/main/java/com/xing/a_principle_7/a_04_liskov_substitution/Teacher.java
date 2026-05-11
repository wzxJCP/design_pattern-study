package com.xing.a_principle_7.a_04_liskov_substitution;

public class Teacher extends Human {
    public int fun1(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }
}
