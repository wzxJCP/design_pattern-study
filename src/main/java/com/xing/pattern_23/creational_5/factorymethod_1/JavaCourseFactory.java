package com.xing.pattern_23.creational_5.factorymethod_1;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
