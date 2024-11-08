package com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3;


public class Run implements Runnable {
    @Override
    public void run() {
        // 获取 LazySingleton 的单例实例
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        // 打印当前线程的名称和获取到的单例实例的引用
        System.out.println(Thread.currentThread().getName() + " "+instance+" ");
    }
}
