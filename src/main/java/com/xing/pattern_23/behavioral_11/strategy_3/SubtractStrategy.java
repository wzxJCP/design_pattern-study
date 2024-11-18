package com.xing.pattern_23.behavioral_11.strategy_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 14:44
 * @author：wzx
 */
// 定义一个名为 SubtractStrategy 的类，实现 Strategy 接口
public class SubtractStrategy implements Strategy {
    // 实现 Strategy 接口的 doOperation 方法
    @Override
    public int doOperation(int num1, int num2) {
        // 返回两个整数的差
        return num1 - num2;
    }
}
