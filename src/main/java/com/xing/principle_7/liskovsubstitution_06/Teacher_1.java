package com.xing.principle_7.liskovsubstitution_06;

public class Teacher_1 extends Person_1 {
    private String subject;

    public Teacher_1(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String introduce() {
        return super.introduce() + " 老师 " + subject + ".";
    }

    @Override
    public boolean canTeach() {
        return true; // 老师可以教书
    }

    public String teach() {
        return name + " 任教 " + subject + ".";
    }
}