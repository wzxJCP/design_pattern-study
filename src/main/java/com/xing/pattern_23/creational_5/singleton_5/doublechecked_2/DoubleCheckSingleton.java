package com.xing.pattern_23.creational_5.singleton_5.doublechecked_2;

import java.io.Serializable;

/**
 * @project：design_pattern-study
 * @since：2024/11/8 15:02
 * @author：wzx
 */
// 定义一个实现了 Serializable 接口的单例类 DoubleCheckSingleton
public class DoubleCheckSingleton implements Serializable {

    // 私有的静态变量，用于存储单例对象实例
    // 使用 volatile 关键字确保多线程环境下的可见性和有序性
    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    // 私有的构造函数，防止外部直接实例化
    private DoubleCheckSingleton(){
        if(doubleCheckSingleton == null){
            throw new RuntimeException("不允许通过反射,创建单例对象。");
        }
    }

    // 公有的静态方法，用于获取单例对象实例
    public static DoubleCheckSingleton getInstance() {
        // 第一次检查，如果实例已经存在，则直接返回
        if (doubleCheckSingleton == null) {
            // 同步代码块，确保只有一个线程可以进入
            synchronized (DoubleCheckSingleton.class) {
                // 第二次检查，确保只有一个线程会创建实例
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        // 返回单例对象实例
        return doubleCheckSingleton;
    }

    // 为了支持序列化和反序列化，防止反序列化时创建新的实例
    // 使用 readResolve 方法确保反序列化时返回的是同一个实例
    protected Object readResolve() {
        return getInstance();
    }
}

/**
 * 注释说明
 * 1、volatile 关键字：
 * volatile 关键字确保多线程环境下的可见性和有序性。当一个线程修改了 doubleCheckSingleton 的值，其他线程能够立即看到这个变化。
 * 同时，volatile 关键字还禁止了指令重排序，确保在多线程环境下创建单例对象时不会出现部分初始化的问题。
 * 2、私有构造函数：
 * 构造函数被声明为 private，防止外部代码通过 new 关键字直接创建 DoubleCheckSingleton 的实例。
 * 3、getInstance() 方法：
 * 这是一个公有的静态方法，用于获取单例对象实例。
 * 第一次检查：如果 doubleCheckSingleton 已经不是 null，则直接返回现有的实例，避免不必要的同步操作。
 * 同步块：只有当 doubleCheckSingleton 是 null 时，才会进入同步块。这样可以减少锁的竞争，提高性能。
 * 第二次检查：在同步块内部再次检查 doubleCheckSingleton 是否为 null，以确保只有一个线程会创建实例。
 * 4、readResolve() 方法：
 * 这个方法用于处理序列化和反序列化的问题。当对象被反序列化时，readResolve() 方法会被调用，确保返回的是同一个单例对象实例，而不是一个新的实例。
 */