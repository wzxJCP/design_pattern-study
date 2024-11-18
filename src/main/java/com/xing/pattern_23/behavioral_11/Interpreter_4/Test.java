package com.xing.pattern_23.behavioral_11.Interpreter_4;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 15:23
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个 TerminalExpression 对象，用于检查上下文中是否包含 "张三"
        Expression zhangsan = new TerminalExpression("zhangsan");
        // 创建一个 TerminalExpression 对象，用于检查上下文中是否包含 "李四"
        Expression lisi = new TerminalExpression("lisi");

        // 创建一个 OrExpression 对象，组合两个子表达式 zhangsan 和 lisi
        OrExpression orExpression = new OrExpression(zhangsan, lisi);

        // 执行解释操作，检查上下文 "张三" 中是否包含 "张三" 或 "李四"
        System.out.println("张三是一个男人吗?》》》：" + orExpression.interpret("zhangsan"));

        // 创建一个 TerminalExpression 对象，用于检查上下文中是否包含 "wangwu"
        Expression wangwu = new TerminalExpression("wangwu");
        // 创建一个 TerminalExpression 对象，用于检查上下文中是否包含 "结婚"
        Expression zhaoliu = new TerminalExpression("married");

        // 创建一个 AndExpression 对象，组合两个子表达式 王五 和 赵六
        AndExpression andExpression = new AndExpression(wangwu, zhaoliu);

        // 执行解释操作，检查上下文 "wangwu married" 中是否同时包含 "wangwu" 和 "married"；假如只有其一，那结果应该为 false
        System.out.println("王五是否已婚?》》》》》：" + andExpression.interpret("wangwu married"));
    }
}
