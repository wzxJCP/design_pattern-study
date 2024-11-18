package com.xing.pattern_23.behavioral_11.memento_6;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 17:21
 * @author：wzx
 */
public class Order {
    // 订单的状态
    private String state;

    /**
     * 获取订单的当前状态。
     * @return 当前状态值
     */
    public String getState() {
        return state;
    }
    /**
     * 设置订单的新状态。
     * @param state 新的状态值
     */
    public Order(String state) {
        this.state = state;
    }
}
