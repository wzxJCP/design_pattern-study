package com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3;

public class Test {
    public static void main(String[] args) {
        // 创建三个线程，每个线程都运行 Run 类的实例
        Thread thread = new Thread(new Run());
        Thread thread1 = new Thread(new Run());
        Thread thread2 = new Thread(new Run());
        // 启动这三个线程
        thread.start();
        thread1.start();
        thread2.start();

        // 打印当前主线程的信息
        System.out.println("当前程序结束了......");
    }
}

/**
 * 当前程序结束了......
 * Thread-2 com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3.StaticInnerClassSingleton@9e6007b
 * Thread-0 com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3.StaticInnerClassSingleton@9e6007b
 * Thread-1 com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3.StaticInnerClassSingleton@9e6007b
 */