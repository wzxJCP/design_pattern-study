package com.xing.pattern_23.behavioral_11.strategy_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 14:41
 * @author：wzx
 */
// 定义一个名为 Strategy 的接口
public interface Strategy {
    // 定义 doOperation 方法
    // 该方法用于执行某个操作，传入两个整数参数 num1 和 num2，并返回一个整数结果
    public int doOperation(int num1, int num2);
}
