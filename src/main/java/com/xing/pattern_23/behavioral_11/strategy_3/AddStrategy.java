package com.xing.pattern_23.behavioral_11.strategy_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 14:43
 * @author：wzx
 */
// 定义一个名为 AddStrategy 的类，实现 Strategy 接口
public class AddStrategy implements Strategy {
    // 实现 Strategy 接口的 doOperation 方法
    @Override
    public int doOperation(int num1, int num2) {
        // 返回两个整数的和
        return num1 + num2;
    }
}
