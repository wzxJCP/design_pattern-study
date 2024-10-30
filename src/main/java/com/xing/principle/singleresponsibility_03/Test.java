package com.xing.principle.singleresponsibility_03;

public class Test {
    public static void main(String[] args) {
        // JavaProgrammer javaProgrammer = new JavaProgrammer();
        // javaProgrammer.orderTake();
        // javaProgrammer.eat();
        // javaProgrammer.sleep();
        // javaProgrammer.work();

        JavaProgrammer javaProgrammer = new JavaProgrammer();
        Order order = new Order();
        javaProgrammer.setOrder(order);
        javaProgrammer.eat();
        javaProgrammer.sleep();
        javaProgrammer.work();
    }
}
