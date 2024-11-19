package com.xing.pattern_23.behavioral_11.visitor_10;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 9:02
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个计算机对象
        ComputerPart computer = new Computer();
        // 创建一个访问者对象，并让计算机对象接受该访问者
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
/**
 * 组装 鼠标   com.xing.pattern_23.behavioral_11.visitor_10.Mouse@21b8d17c
 * 组装 键盘   com.xing.pattern_23.behavioral_11.visitor_10.Keyboard@5910e440
 * 组装 显示器 com.xing.pattern_23.behavioral_11.visitor_10.Monitor@6267c3bb
 * 组装 电脑   com.xing.pattern_23.behavioral_11.visitor_10.Computer@533ddba
 */
/**
 * 2.3.10 访问者模式（Visitor Pattern）
 */