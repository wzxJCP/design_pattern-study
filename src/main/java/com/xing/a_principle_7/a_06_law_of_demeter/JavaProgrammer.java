package com.xing.a_principle_7.a_06_law_of_demeter;

public class JavaProgrammer extends Programmer{
    @Override
    public void work() {
        System.out.println("java程序员写代码");
    }
}
