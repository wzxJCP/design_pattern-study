package com.xing.pattern_23.creational_5.singleton_5.lazy_1;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    // 防止反射调用
    private static LazySingleton instance = null;

    /**
     * 私有构造方法，防止外部直接实例化。
     * 通过检查 instance 是否为 null 来防止反射调用。
     */
    // private LazySingleton(){
    //     if(instance != null){
    //         throw new RuntimeException("单例构造器禁止反射调用");
    //     }
    // }

    /**
     * 获取单例实例的方法。
     * 使用 synchronized 关键字保证线程安全。
     * 只有当 instance 为 null 时才创建新的实例。
     * @return 单例实例
     * @author xing
     */

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 实现 Serializable 接口，并重写 readResolve 方法。
     * 这是为了防止反序列化时创建新的实例，确保单例的唯一性。
     * @return 单例实例
     */
    private Object readResolve(){
        return instance;
    }
}
