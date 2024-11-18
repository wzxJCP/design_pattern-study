package com.xing.pattern_23.behavioral_11.memento_6;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 17:26
 * @author：wzx
 */
// 备忘录 类
public class Memento {
    // 备忘录的状态
    private String state;

    /**
     * 获取备忘录的当前状态。
     * @return 当前状态值
     */
    public String getState() {
        return state;
    }

    /**
     * 设置备忘录的新状态。
     * @param state 新的状态值
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 将当前备忘录的状态保存到一个新的订单对象中。
     * @return 包含当前状态的新订单对象
     */
    public Order saveStateToOrder() {
        return new Order(state);
    }

    /**
     * 从订单对象中恢复备忘录的状态。
     * @param order 包含状态的订单对象
     */
    public void getStateFromOrder(Order order) {
        state = order.getState();
    }
}

