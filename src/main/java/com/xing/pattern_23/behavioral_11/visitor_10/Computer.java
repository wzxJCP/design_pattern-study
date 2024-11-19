package com.xing.pattern_23.behavioral_11.visitor_10;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 8:55
 * @author：wzx
 */
// 电脑类，实现了 ComputerPart 接口，表示一个完整的计算机
public class Computer implements ComputerPart {
    // 定义一个数组，包含计算机的所有部件
    ComputerPart[] parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 遍历所有部件，并调用每个部件的 accept 方法，让访问者访问每个部件
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        // 访问者访问当前计算机对象
        computerPartVisitor.visit(this);
    }
}

