package com.xing.pattern_23.creational_5.singleton_5.enumsingleton_5;

/**
 * @project：design_pattern-study
 * @since：2024/11/8 16:57
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 获取第一个单例对象实例
        EnumSingleton e1 = EnumSingleton.getInstance();
        // 获取第二个单例对象实例
        EnumSingleton e2 = EnumSingleton.getInstance();

        // 输出第一个单例对象实例
        System.out.println(e1);
        // 输出第二个单例对象实例
        System.out.println(e2);
        // 比较两个单例对象实例是否相等
        System.out.println(e1 == e2);
    }
}

/**
 * INSTANCE
 * INSTANCE
 * true
 */