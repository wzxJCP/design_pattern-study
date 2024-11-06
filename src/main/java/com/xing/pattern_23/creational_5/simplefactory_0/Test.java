package com.xing.pattern_23.creational_5.simplefactory_0;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();

        // Course javaCourse = courseFactory.getCourse("java");
        // javaCourse.make();

        Course pythonCourse = courseFactory.getCourse("python");
        pythonCourse.make();

    }
}
/**
 * 制作Python课程。
 */
/**
 * 2.1.0 简单工厂模式
 */
