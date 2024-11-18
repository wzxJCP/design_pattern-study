package com.xing.pattern_23.behavioral_11.strategy_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 14:46
 * @author：wzx
 */
public class Operation {
    private  Strategy strategy;

    public Operation(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
