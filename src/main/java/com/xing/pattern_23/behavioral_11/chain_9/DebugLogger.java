package com.xing.pattern_23.behavioral_11.chain_9;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:46
 * @author：wzx
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger( int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug Logger: " + message);
    }
}
