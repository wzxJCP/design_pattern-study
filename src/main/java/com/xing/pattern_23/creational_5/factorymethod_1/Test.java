package com.xing.pattern_23.creational_5.factorymethod_1;

public class Test {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Course javaCourse = javaCourseFactory.getCourse();
        javaCourse.make();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        Course pythonCourse = pythonCourseFactory.getCourse();
        pythonCourse.make();
    }
}
/**
 * 制作Java课程。
 * 制作Python课程。
 */
/**
 * 2.1.1 工厂方法模式
 */
