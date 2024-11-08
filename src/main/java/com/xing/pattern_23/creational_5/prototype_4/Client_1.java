package com.xing.pattern_23.creational_5.prototype_4;

public class Client_1 {
    public static void main(String[] args) {
        // 创建原始对象
        ConcretePrototype_1 original = new ConcretePrototype_1("ID1");
        System.out.println("原文: " + original);

        // 复制对象
        Prototype_1 cloned = original.clone();
        System.out.println("克隆: " + cloned);

        // 修改原始对象的属性，确保复制对象不受影响
        original.setId("ID2");
        System.out.println("修改原文: " + original);
        System.out.println("克隆修改的原文: " + cloned);
    }
}
/**
 * 原文: ConcretePrototype{id='ID1', creationDate=Fri Nov 08 08:55:44 CST 2024}
 * 克隆: ConcretePrototype{id='ID1', creationDate=Fri Nov 08 08:55:44 CST 2024}
 * 修改原文: ConcretePrototype{id='ID2', creationDate=Fri Nov 08 08:55:44 CST 2024}
 * 克隆修改的原文: ConcretePrototype{id='ID1', creationDate=Fri Nov 08 08:55:44 CST 2024}
 */
/**
 * Prototype Interface：定义了一个 clone 方法，所有具体的原型类都需要实现这个方法。
 * ConcretePrototype Class：实现了 Prototype 接口，并提供了一个具体的 clone 方法实现。
 * 这里使用了 Java 的 Cloneable 接口和 Object 类的 clone 方法来进行浅复制。为了确保深复制，我们手动复制了 creationDate 字段。
 * Client Class：展示了如何使用原型模式来创建和复制对象，并验证复制后的对象是否独立于原始对象。
 * 通过这种方式，原型模式可以帮助我们在不依赖具体类的情况下高效地创建对象。
 */