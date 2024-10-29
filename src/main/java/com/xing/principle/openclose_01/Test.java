package com.xing.principle.openclose_01;

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
    }
}
