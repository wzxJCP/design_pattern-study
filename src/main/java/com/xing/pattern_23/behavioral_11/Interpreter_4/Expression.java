package com.xing.pattern_23.behavioral_11.Interpreter_4;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 15:14
 * @author：wzx
 */
// 定义一个名为 表达式 的接口
public interface Expression {
    // 定义 interpret 方法
    // 该方法用于解释给定的上下文字符串，并返回一个布尔值结果
    public boolean interpret(String context);
}
