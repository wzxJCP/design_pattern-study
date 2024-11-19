package com.xing.pattern_23.behavioral_11.state_11;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 11:43
 * @author：wzx
 */
public class EndState implements State {
    @Override
    public void doAction(Context context) {
        // 打印当前操作已结束的信息
        System.out.println("当前操作,已结束...");
        // 将上下文的状态设置为结束状态
        context.setState(this);
    }
    // 返回状态的字符串表示
    public String toString(){
        return "到此结束!";
    }
}
