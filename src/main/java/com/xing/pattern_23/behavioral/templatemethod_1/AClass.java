package com.xing.pattern_23.behavioral.templatemethod_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/15 9:15
 * @author：wzx
 */
// 课程抽象类
public abstract class AClass {
     // 模板方法，定义了制作课程的基本流程
    protected  final void makeClass() {
        this.makePPT();
        // 根据条件决定是否制作讲义
        if (flag()) {
            this.makeNote();
             // 执行讲义制作后的一些操作
            this.isMakeNote();
        }
        this.makeVideo();
    }

    // 制作课程的PPT
    public static void makePPT() {
        System.out.println("制作课程的PPT。");
    }
    // 制作课程的讲义
    public static void makeNote() {
        System.out.println("制作课程的讲义。");
    }
    // 制作课程的视频
    public static void makeVideo() {
        System.out.println("制作课程的视频。");
    }
    // 返回一个布尔值，用于决定是否需要制作讲义
    protected boolean flag() {
        // 默认情况下总是制作讲义
        return true;
    }
    // 抽象方法，由子类实现，用于执行讲义制作后的一些特定操作
    public abstract void isMakeNote();
}
