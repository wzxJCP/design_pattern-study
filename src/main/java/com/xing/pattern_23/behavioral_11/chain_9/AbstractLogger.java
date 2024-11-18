package com.xing.pattern_23.behavioral_11.chain_9;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:40
 * @author：wzx
 */
// 抽象日志类
public abstract class AbstractLogger {
    // 日志级别：信息
    public static int INFO = 1;
    // 日志级别：调试
    public static int DEBUG = 2;
    // 日志级别：错误
    public static int ERROR = 3;
    // 当前日志记录器的级别
    protected int level;
    // 下一个日志记录器
    private AbstractLogger nextLogger;
    /**
     * 设置下一个日志记录器
     * @param nextLogger 下一个日志记录器
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    /**
     * 记录日志消息
     * @param level 日志级别
     * @param message 日志消息
     */
    public void logMessage(int level, String message) {
        // 如果当前日志记录器的级别小于或等于传入的级别，则记录日志
        if (this.level <= level) {
            write(message);
        }
        // 如果存在下一个日志记录器，则将消息传递给下一个日志记录器
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    /**
     * 写入日志消息，具体实现由子类提供
     * @param message 日志消息
     */
    abstract protected void write(String message);
}

