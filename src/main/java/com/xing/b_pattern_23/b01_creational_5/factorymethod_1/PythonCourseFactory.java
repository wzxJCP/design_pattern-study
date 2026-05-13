package com.xing.b_pattern_23.b01_creational_5.factorymethod_1;

public class PythonCourseFactory extends CourseFactory {
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
