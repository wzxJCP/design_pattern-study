package com.xing.pattern_23.behavioral_11.chain_9;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:38
 * @author：wzx
 */
public class Test {
    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        return infoLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "这是一个Info级别的日志记录");
        loggerChain.logMessage(AbstractLogger.DEBUG, "这是一个Debug级别的日志记录");
        loggerChain.logMessage(AbstractLogger.ERROR, "这是一个Error级别的日志记录");
    }
}

/**
 * Info Logger: 这是一个Info级别的日志记录
 * Info Logger: 这是一个Debug级别的日志记录
 * Debug Logger: 这是一个Debug级别的日志记录
 * Info Logger: 这是一个Error级别的日志记录
 * Debug Logger: 这是一个Error级别的日志记录
 * Error Logger: 这是一个Error级别的日志记录
 */
/**
 * 2.3.9 责任链模式（Chain of Responsibility Pattern）
 */