package com.xing.pattern_23.behavioral_11.chain_9;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:48
 * @author：wzx
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}
