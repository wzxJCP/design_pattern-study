package com.xing.pattern_23.behavioral_11.memento_6;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 17:33
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
         // 创建一个备忘录对象
        Memento memento = new Memento();
        // 创建一个容器对象，用于存储订单
        Container container = new Container();
        // 设置备忘录的初始状态并保存到容器中
        memento.setState("1 打开冰箱；");
        container.add(memento.saveStateToOrder());
        // 设置备忘录的第二个状态并保存到容器中
        memento.setState("2 把大象放进去；");
        container.add(memento.saveStateToOrder());
        // 设置备忘录的第三个状态并保存到容器中
        memento.setState("3 再关闭冰箱。");
        container.add(memento.saveStateToOrder());

        // 输出当前状态
        System.out.println("现在状态：" + memento.getState());

        // 从容器中回退到第一个状态
        memento.getStateFromOrder(container.get(0));
        System.out.println("回退到状态：" + memento.getState());
        // 从容器中回退到第二个状态
        memento.getStateFromOrder(container.get(1));
        System.out.println("回退到状态：" + memento.getState());
        // 从容器中回退到第三个状态
        memento.getStateFromOrder(container.get(2));
        System.out.println("回退到状态：" + memento.getState());
    }
}
/**
 * 现在状态：3 再关闭冰箱。
 * 回退到状态：1 打开冰箱；
 * 回退到状态：2 把大象放进去；
 * 回退到状态：3 再关闭冰箱。
 */
/**
 * 2.3.6 备忘录模式
 */