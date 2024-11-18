package com.xing.pattern_23.behavioral_11.Interpreter_4;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 15:16
 * @author：wzx
 */
// 定义一个名为 添加表达式 的类，实现 表达式 接口
public class AndExpression implements Expression {
    // 定义两个 Expression 类型的成员变量，用于存储两个子表达式
    private Expression expression1;
    private Expression expression2;
    // 构造函数，传入两个子表达式
    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    // 实现 Expression 接口的 interpret 方法
    @Override
    public boolean interpret(String context) {
        // 返回两个子表达式的解释结果的逻辑与（AND）运算结果
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
