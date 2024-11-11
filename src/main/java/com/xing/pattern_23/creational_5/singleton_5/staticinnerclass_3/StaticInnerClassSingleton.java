package com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3;

import java.io.Serializable;

/**
 * @project：design_pattern-study
 * @since：2024/11/8 16:17
 * @author：wzx
 */
public class StaticInnerClassSingleton implements Serializable {
    // 内部静态类，用于懒加载单例对象
    private static class InnerClass {
        // 在内部静态类中声明并初始化单例对象
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    // 私有的构造函数，防止外部直接实例化
    private StaticInnerClassSingleton() {
        if(InnerClass.staticInnerClassSingleton == null){
            throw new RuntimeException("不允许通过反射,创建单例对象");
        }
    }

    // 公有的静态方法，用于获取单例对象实例
    public static StaticInnerClassSingleton getInstance() {
        // 返回内部静态类中的单例对象
        return InnerClass.staticInnerClassSingleton;
    }

    // 为了支持序列化和反序列化，防止反序列化时创建新的实例
    private Object readResolve() {
        // 返回内部静态类中的单例对象
        return InnerClass.staticInnerClassSingleton;
    }
}
