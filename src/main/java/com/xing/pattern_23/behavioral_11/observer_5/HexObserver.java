package com.xing.pattern_23.behavioral_11.observer_5;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 16:33
 * @author：wzx
 */
// 十六进制观察者
public class HexObserver extends Observer {
    // 构造函数，初始化观察者并将其绑定到主题对象
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.binding(this);
    }

    @Override
    public void update() {
        // 更新方法，当主题对象的状态发生变化时被调用
        // 将主题对象的状态转换为十六进制字符串并输出
        System.out.println(
                "Hex String : " + Integer.toHexString(subject.getState()).toUpperCase()
        );
    }
}

