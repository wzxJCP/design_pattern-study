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

/**
 * 抽象类程序员类实现人类接口类，Java程序员继承于抽象类程序员类。`JavaProgrammer` 类通过持有 `Order` 类的引用，
 * 表达了它对外卖订单功能的使用需求。这种方式遵循了单一职责原则，即一个类应该只有一个改变的理由。
 * 在这里，`JavaProgrammer` 负责描述程序员的工作、吃饭和睡觉等行为，而具体的订餐逻辑则由 `Order` 类负责，
 * 从而实现了职责分离，使得代码更加清晰和易于维护。
 */