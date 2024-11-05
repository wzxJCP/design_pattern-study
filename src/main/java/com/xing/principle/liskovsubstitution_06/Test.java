package com.xing.principle.liskovsubstitution_06;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("1+2= " + teacher.fun1(1,2));
        System.out.println("++++++++++++");

        Student student = new Student();
        student.setTeacher(teacher);
        System.out.println("3+4= " + student.fun1(3,4));
        System.out.println("2+5+10= " + student.fun2(2,5));
        System.out.println("9-6= " + student.fun3(9,6));
    }
}
/**
 * 3
 * 1+2= 3
 * ++++++++++++
 * 7
 * 3+4= 7
 * 2+5+10= 17
 * 9-6= 3
 * 人类类，学生类和老师类
 * 解释
 * 基类 Human：定义了所有人的共同属性和方法
 * 子类 Student：继承自 Human，并添加了学生特有的属性和方法，如 fun1 和 fun2、fun3方法。
 * 子类 Teacher：继承自 Human，并添加了教师特有的属性和方法，如 fun1方法。
 * 测试代码：创建了 Student 和 Teacher 对象，并验证了里氏替换原则。通过将 Student 和 Teacher 对象赋值给 Human 类型的变量，
 * 确保子类对象可以安全地替换基类对象，而不影响程序的正确性。这样，我们就通过具体的代码示例展示了里氏替换原则的应用。
 */
