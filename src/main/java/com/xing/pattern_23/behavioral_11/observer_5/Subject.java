package com.xing.pattern_23.behavioral_11.observer_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 16:06
 * @author：wzx
 */
// 主题类
public class Subject {
    // 观察者列表，存储所有注册的观察者对象
    private List<Observer> observerList = new ArrayList<>();
    // 主题对象的状态
    private int state;
    /**
     * 获取当前状态。
     * @return 当前状态值
     */
    public int getState() {
        return state;
    }
    /**
     * 设置新的状态值。
     * 当状态值改变时，通知所有注册的观察者。
     * @param state 新的状态值
     */
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    /**
     * 将观察者对象绑定到主题对象。
     * @param observer 要绑定的观察者对象
     */
    public void binding(Observer observer) {
        observerList.add(observer);
    }
    /**
     * 通知所有注册的观察者。
     * 遍历观察者列表，调用每个观察者的 update 方法。
     */
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

