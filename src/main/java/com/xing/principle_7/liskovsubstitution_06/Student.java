package com.xing.principle_7.liskovsubstitution_06;

public class Student extends Human {
    // 声明一个私有的 Teacher 类型的成员变量
    private Teacher teacher;

    // 设置 teacher 的方法
    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }
    // 其他方法
    public int fun1(int a, int b)
    {
        return teacher.fun1(a, b);
    }

    public int fun2(int a, int b)
    {
        return (a+b)+10;
    }

    public int fun3(int a, int b)
    {
        return a-b;
    }

}
