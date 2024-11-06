package com.xing.principle_7.dependencyinversion_02;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        javaProgrammer.eat();
        javaProgrammer.sleep();
        javaProgrammer.work();

        TestProgrammer testProgrammer = new TestProgrammer();
        testProgrammer.work();

        /**
         * 高层模块不应该依赖于低层模块，二者都应该依赖于抽象；抽象不应该依赖于细节，细节应该依赖于抽象。这有助于降低系统的耦合度，提高灵活性。
         * 抽象类程序员实现人类接口，Java程序员和测试程序员都继承于抽象类程序员。
         */
    }
}
