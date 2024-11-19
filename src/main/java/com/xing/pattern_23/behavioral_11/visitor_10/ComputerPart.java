package com.xing.pattern_23.behavioral_11.visitor_10;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 8:53
 * @author：wzx
 */
/**
 * 定义一个计算机部件接口，所有具体的计算机部件类都需要实现此接口。
 * 该接口包含一个接受访问者的方法，用于允许访问者访问该部件。
 * 计算机部件
 */
public interface ComputerPart {
    /**
     * 接受访问者访问的方法。
     * @param computerPartVisitor 访问者对象
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}

