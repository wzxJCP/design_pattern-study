package com.xing.pattern_23.behavioral_11.command_7;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 17:56
 * @author：wzx
 */
// 订单接口
public interface Order {
    /**
     * 执行 命令的方法。
     * 这个方法定义了命令的具体执行逻辑。
     * 具体实现类需要实现这个方法来完成特定的操作。
     */
    public void execute();
}
