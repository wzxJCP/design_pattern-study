package com.xing.b_pattern_23.b03_behavioral_11.b09_strategy;

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
