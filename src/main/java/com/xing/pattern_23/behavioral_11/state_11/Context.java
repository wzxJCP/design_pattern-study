package com.xing.pattern_23.behavioral_11.state_11;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 11:19
 * @author：wzx
 */
// 上下文 类
public class Context {
    // 当前状态
    private State state;

    // 构造方法，初始化状态为 null
    public Context() {
        state = null;
    }

    // 获取当前状态
    public State getState() {
        return state;
    }

    // 设置当前状态
    public void setState(State state) {
        this.state = state;
    }
}

