package com.xing.pattern_23.behavioral_11.observer_5;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 16:36
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个主题对象
        Subject subject = new Subject();
        // 创建一个二进制观察者，并将其绑定到主题对象
        new BinaryObserver(subject);
        // 创建一个十六进制观察者，并将其绑定到主题对象
        new HexObserver(subject);
         // 输出状态值为 15
        System.out.println("状态值为 : 15");
        // 设置主题对象的状态为 15，这将触发所有观察者的 update 方法
        subject.setState(15);

        System.out.println("======================");

        // 输出状态值为 8
        System.out.println("状态值为 : 8");
        // 设置主题对象的状态为 8，这将再次触发所有观察者的 update 方法
        subject.setState(8);
    }
}


/**
 * 状态值为 : 15
 * Binary String : 1111
 * Hex String : F
 * ======================
 * 状态值为 : 8
 * Binary String : 1000
 * Hex String : 8
 */
/**
 * 2.3.5 观察者模式
 */