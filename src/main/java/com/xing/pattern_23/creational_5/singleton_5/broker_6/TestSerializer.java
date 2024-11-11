package com.xing.pattern_23.creational_5.singleton_5.broker_6;

import com.xing.pattern_23.creational_5.singleton_5.doublechecked_2.DoubleCheckSingleton;
import com.xing.pattern_23.creational_5.singleton_5.enumsingleton_5.EnumSingleton;
import com.xing.pattern_23.creational_5.singleton_5.hungry_4.HungrySingleton;
import com.xing.pattern_23.creational_5.singleton_5.lazy_1.LazySingleton;
import com.xing.pattern_23.creational_5.singleton_5.staticinnerclass_3.StaticInnerClassSingleton;

import java.io.*;

/**
 * @project：design_pattern-study
 * @since：2024/11/11 8:57
 * @author：wzx
 */
public class TestSerializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 使用懒汉式获取单例对象实例
        // LazySingleton instance = LazySingleton.getInstance();
        // 使用双重检查获取单例对象实例
        // DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        // 使用静态内部类获取单例对象实例
        // StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        // 使用饿汉式获取单例对象实例
        HungrySingleton instance3 = HungrySingleton.getInstance();
        // 使用枚举获取单例对象实例
        // EnumSingleton instance4 = EnumSingleton.getInstance();

        // 创建一个对象输出流，用于将对象写入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        // 将单例对象写入到文件中
        oos.writeObject(instance3);
        // 创建一个对象输入流，用于从文件中读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton")));

        // 懒汉式
        // LazySingleton objInstance = (LazySingleton) ois.readObject();
        // 双重检查
        // DoubleCheckSingleton objInstance1 = (DoubleCheckSingleton) ois.readObject();
        // 静态内部类
        // StaticInnerClassSingleton objInstance2 = (StaticInnerClassSingleton) ois.readObject();
        // 饿汉式获
        HungrySingleton objInstance3 = (HungrySingleton) ois.readObject();
        // 枚举
        // EnumSingleton objInstance4 = (EnumSingleton) ois.readObject();

        // 打印原始的单例对象实例
        System.out.println(instance3);
        // 打印通过反序列化得到的新对象实例
        System.out.println(objInstance3);
        // 比较两个对象是否相等，即是否是同一个对象
        System.out.println(objInstance3 == instance3);
    }
}
/**
 * com.xing.pattern_23.creational_5.singleton_5.lazy_1.LazySingleton@1c655221
 * com.xing.pattern_23.creational_5.singleton_5.lazy_1.LazySingleton@2401f4c3
 * false
 * 为了支持序列化和反序列化，防止反序列化时创建新的实例；使用 readResolve 方法确保反序列化时返回的是同一个实例
 * com.xing.pattern_23.creational_5.singleton_5.lazy_1.LazySingleton@1c655221
 * com.xing.pattern_23.creational_5.singleton_5.lazy_1.LazySingleton@1c655221
 * true
 */
