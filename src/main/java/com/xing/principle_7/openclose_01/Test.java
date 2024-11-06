package com.xing.principle_7.openclose_01;

public class Test {
    public static void main(String[] args) {
        // Student student = new Student();
        // student.eat();
        // student.sleep();
        // student.study();

        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.eat();
        highSchoolStudent.sleep();
        highSchoolStudent.study();
        highSchoolStudent.doSomeThing();

        /**
         * 软件实体（如类、模块、函数等）应当对扩展开放，对修改关闭。这意味着在不影响现有代码的情况下，通过增加新的类来实现新功能或行为。
         * 学生和高中生都依赖于人类接口，如果还有高中生、研究生等等都是通过增加新的类并继承人类接口来实现新功能或行为。
         */
    }
}
