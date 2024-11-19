package com.xing.pattern_23.behavioral_11.state_11;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 11:44
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建上下文对象
        Context context = new Context();

        // 创建开始状态对象
        StartState startState = new StartState();
        // 执行开始状态的操作，并将上下文的状态设置为开始状态
        startState.doAction(context);
        // 打印当前状态的字符串表示
        System.out.println(context.getState().toString());

        // 创建结束状态对象
        EndState endState = new EndState();
        // 执行结束状态的操作，并将上下文的状态设置为结束状态
        endState.doAction(context);
        // 打印当前状态的字符串表示
        System.out.println(context.getState().toString());
    }
}
/**
 * 当前操作,已开始...
 * 正在进行中...
 * 当前操作,已结束...
 * 到此结束!
 */
/**
 * 2.3.11 状态模式（State Pattern）
 */