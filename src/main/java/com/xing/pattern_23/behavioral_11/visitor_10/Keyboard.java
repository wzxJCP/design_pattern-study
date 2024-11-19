package com.xing.pattern_23.behavioral_11.visitor_10;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 8:56
 * @author：wzx
 */
// 键盘 实现 计算机部件
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 调用访问者的 visit 方法，传入当前键盘对象
        computerPartVisitor.visit(this);
    }
}
