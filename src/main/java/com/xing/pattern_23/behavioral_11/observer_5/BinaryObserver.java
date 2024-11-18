package com.xing.pattern_23.behavioral_11.observer_5;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 16:34
 * @author：wzx
 */
// 二进制观察者
public class BinaryObserver extends Observer {
    // 构造函数，初始化观察者并将其绑定到主题对象
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.binding(this);
    }

    @Override
    public void update() {
        // 更新方法，当主题对象的状态发生变化时被调用
        // 将主题对象的状态转换为二进制字符串并输出
        System.out.println(
                "Binary String : " + Integer.toBinaryString(subject.getState())
        );
    }
}



