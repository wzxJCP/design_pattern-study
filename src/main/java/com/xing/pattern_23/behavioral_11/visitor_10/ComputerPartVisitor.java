package com.xing.pattern_23.behavioral_11.visitor_10;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 8:54
 * @author：wzx
 */
// 计算机部件访问者
public interface ComputerPartVisitor {
    /**
     * 访问鼠标部件的方法。
     * @param mouse 被访问的鼠标对象
     */
    void visit(Mouse mouse);

    /**
     * 访问键盘部件的方法。
     * @param keyboard 被访问的键盘对象
     */
    void visit(Keyboard keyboard);

    /**
     * 访问显示器部件的方法。
     * @param monitor 被访问的显示器对象
     */
    void visit(Monitor monitor);

    /**
     * 访问计算机对象的方法。
     * @param computer 被访问的计算机对象
     */
    void visit(Computer computer);
}

