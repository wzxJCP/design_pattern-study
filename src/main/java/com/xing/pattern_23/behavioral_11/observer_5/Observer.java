package com.xing.pattern_23.behavioral_11.observer_5;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 16:07
 * @author：wzx
 */
public abstract class Observer {
    // 保护成员变量，表示观察者所观察的主题对象
    protected Subject subject;

    /**
     * 抽象方法，用于更新观察者的状态。
     * 当主题对象的状态发生变化时，会调用观察者的 update 方法。
     * 子类需要实现该方法以定义具体的更新逻辑。
     */
    public abstract void update();
}

