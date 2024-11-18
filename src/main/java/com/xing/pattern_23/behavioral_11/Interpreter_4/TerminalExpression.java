package com.xing.pattern_23.behavioral_11.Interpreter_4;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 15:21
 * @author：wzx
 */
// 定义一个名为 终端表达式 的类，实现 表达式 接口
public class TerminalExpression implements Expression {
    // 定义一个字符串类型的成员变量，用于存储需要匹配的数据
    private String data;
    // 构造函数，传入需要匹配的数据
    public TerminalExpression(String data) {
        this.data = data;
    }
    // 实现 Expression 接口的 interpret 方法
    @Override
    public boolean interpret(String context) {
        // 检查上下文字符串中是否包含需要匹配的数据
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
