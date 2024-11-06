package com.xing.principle_7.singleresponsibility_03;

public class JavaProgrammer extends Programmer {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void work() {
        System.out.println("Java程序员在工作。");
    }

    @Override
    public void eat() {
        // System.out.println("Java程序员在吃东西。");
        order.take();
    }

    @Override
    public void sleep() {
        System.out.println("Java程序员在睡觉。");
    }

    // public void orderTake() {
    //     System.out.println("Java程序员在订外卖。");
    // }
}
