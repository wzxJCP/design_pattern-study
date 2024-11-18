package com.xing.pattern_23.behavioral_11.templatemethod_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 8:54
 * @author：wzx
 */
public class DesignPatternClass extends AClass {
    private boolean flag;
    // 构造函数，接收一个布尔值参数，用于初始化成员变量 flag
    public DesignPatternClass(boolean flag) {
        // 初始化 flag 变量
        this.flag = flag;
    }

    // 覆盖父类的 flag() 方法，返回成员变量 flag 的值
    @Override
    protected boolean flag() {
        // 返回 flag 变量的值，用于决定是否制作讲义
        return this.flag;
    }

    // 覆盖父类的 isMakeNote() 方法，提供具体实现
    @Override
    public void isMakeNote() {
        // 输出特定的消息，表示提供设计模式课程的源代码
        System.out.println("提供设计模式课程源代码。");
    }
}
