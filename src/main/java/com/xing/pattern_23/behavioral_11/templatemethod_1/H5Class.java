package com.xing.pattern_23.behavioral_11.templatemethod_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 8:58
 * @author：wzx
 */
public class H5Class extends AClass {
    // 覆盖父类的 flag() 方法，返回布尔值 true
    @Override
    protected boolean flag() {
         // 判断是否需要笔记，这里始终返回 true，表示总是需要制作讲义
        return true;
    }
    // 覆盖父类的 isMakeNote() 方法，提供具体实现
    @Override
    public void isMakeNote() {
        // 输出特定的消息，表示 H5 课程不需要笔记
        System.out.println("H5课程不需要笔记");
    }
}
