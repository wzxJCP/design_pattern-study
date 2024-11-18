package com.xing.pattern_23.behavioral_11.chain_9;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:39
 * @author：wzx
 */
// 输出INFO级别的日志
public class InfoLogger extends AbstractLogger {
    /**
     * 构造器，设置日志级别
     * @param level 日志级别
     */
    public InfoLogger(int level) {
        this.level = level;
    }

    /**
     * 写入日志消息，具体实现
     * @param message 日志消息
     */
    @Override
    protected void write(String message) {
        System.out.println("Info Logger: " + message);
    }
}

