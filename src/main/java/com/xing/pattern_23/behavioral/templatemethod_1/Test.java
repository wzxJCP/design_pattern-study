package com.xing.pattern_23.behavioral.templatemethod_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 8:56
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("-------------");
        // 创建 DesignPatternClass 对象，并传递 true 参数，表示需要制作讲义
        AClass c = new DesignPatternClass(true);
        // 调用 makeClass() 方法，执行制作课程的流程
        c.makeClass();
        System.out.println("-------------");

        System.out.println("=============");
        // 创建 H5Class 对象
        AClass h = new H5Class();
        // 调用 makeClass() 方法，执行制作课程的流程
        h.makeClass();
        System.out.println("=============");

    }
}
