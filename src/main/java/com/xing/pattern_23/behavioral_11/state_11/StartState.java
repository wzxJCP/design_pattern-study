package com.xing.pattern_23.behavioral_11.state_11;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 11:22
 * @author：wzx
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        // 打印当前操作已开始的信息
        System.out.println("当前操作,已开始...");
        // 将上下文的状态设置为开始状态
        context.setState(this);
    }

    // 返回状态的字符串表示
    public String toString(){
        return "正在进行中...";
    }
}
