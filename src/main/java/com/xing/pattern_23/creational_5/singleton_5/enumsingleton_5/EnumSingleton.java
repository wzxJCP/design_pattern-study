package com.xing.pattern_23.creational_5.singleton_5.enumsingleton_5;

public enum EnumSingleton {
    // 声明一个枚举常量 INSTANCE，作为单例对象
    INSTANCE;

    // 静态方法，用于获取单例对象实例
    public static EnumSingleton getInstance() {
        // 返回枚举常量 INSTANCE
        return INSTANCE;
    }
}
