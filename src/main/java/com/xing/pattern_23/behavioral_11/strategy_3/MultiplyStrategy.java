package com.xing.pattern_23.behavioral_11.strategy_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 14:45
 * @author：wzx
 */
public class MultiplyStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
