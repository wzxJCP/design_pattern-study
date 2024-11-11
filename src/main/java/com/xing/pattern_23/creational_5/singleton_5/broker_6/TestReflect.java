package com.xing.pattern_23.creational_5.singleton_5.broker_6;

import com.xing.pattern_23.creational_5.singleton_5.doublechecked_2.DoubleCheckSingleton;
import com.xing.pattern_23.creational_5.singleton_5.enumsingleton_5.EnumSingleton;
import com.xing.pattern_23.creational_5.singleton_5.hungry_4.HungrySingleton;
import com.xing.pattern_23.creational_5.singleton_5.lazy_1.LazySingleton;
import com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3.StaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @project：design_pattern-study
 * @since：2024/11/11 10:11
 * @author：wzx
 */
// 方法二：通过反射的方式破坏单例模式
public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1懒汉式 2双重检查 3静态内部类 4饿汉式 5枚举
        // 创建字节码对象,以懒加载的单例模式为例
       Class clz = LazySingleton.class;
       // Class clz1 = DoubleCheckSingleton.class;
       // Class clz2 = StaticInnerClassSingleton.class;
       // Class clz3 = HungrySingleton.class;
       // Class clz4 = EnumSingleton.class;

        // 创建构造器对象
        Constructor constructor = clz.getDeclaredConstructor();

        // 枚举类型的单例模式,在创建构造方法时,需要给两个参数
        // 该参数是源码中体现的,一个是string,int
        // Cannot reflectively create enum objects 不能反射地创建枚举对象
        // 在使用枚举时,通过反射创建单例对象时,是不允许创建的,会抛出异常
        // 在其他的单例模式中也可以模拟这种实现方式
       // Constructor constructor = clz4.getDeclaredConstructor(String.class,int.class);

        // 赋予权限
        constructor.setAccessible(true);

        // 初始化,单例对象,注意私有构造的问题
       LazySingleton clzInstance = (LazySingleton) constructor.newInstance();
       // DoubleCheckSingleton clzInstance1 = (DoubleCheckSingleton) constructor.newInstance();
       // StaticInnerClassSingleton clzInstance2 = (StaticInnerClassSingleton) constructor.newInstance();
       // HungrySingleton clzInstance3 = (HungrySingleton) constructor.newInstance();
       // EnumSingleton clzInstance4 = (EnumSingleton) constructor.newInstance("fdgdfg",666);

       LazySingleton instance = LazySingleton.getInstance();
       // DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
       // StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
       // HungrySingleton instance3 = HungrySingleton.getInstance();
       // EnumSingleton instance4 = EnumSingleton.getInstance();

        System.out.println(instance);
        System.out.println(clzInstance);
        System.out.println(instance == clzInstance);

    }
}
