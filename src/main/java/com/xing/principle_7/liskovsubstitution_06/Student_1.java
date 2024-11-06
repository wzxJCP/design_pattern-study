package com.xing.principle_7.liskovsubstitution_06;

public class Student_1 extends Person_1 {
    private int grade;

    public Student_1(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() + " 学生 " + grade + "。";
    }

    @Override
    public boolean canTeach() {
        return false; // 学生通常不能教书
    }

    public String study() {
        return name + " 学习 " + grade + "。";
    }
}