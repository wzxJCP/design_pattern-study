package com.xing.pattern_23.creational_5.singleton_5.hungry_4;

import java.io.Serializable;

/**
 * @project：design_pattern-study
 * @since：2024/11/8 16:35
 * @author：wzx
 */
public class HungrySingleton implements Serializable {

    // 饿汉式单例模式：在类加载时就初始化单例对象
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    // 私有的构造函数，防止外部直接实例化
    private HungrySingleton() {
        // 防止通过反射创建多个实例
        if(hungrySingleton == null){
            throw new RuntimeException("不允许通过反射,创建单例对象。");
        }
    }

    // 公有的静态方法，用于获取单例对象实例
    public static HungrySingleton getInstance() {
        // 返回已经初始化的单例对象
        return hungrySingleton;
    }

    // 为了支持序列化和反序列化，防止反序列化时创建新的实例
    private Object readResolve() {
        // 返回已经初始化的单例对象
        return hungrySingleton;
    }
}
