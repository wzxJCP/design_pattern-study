package com.xing.pattern_23.behavioral_11.memento_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 17:30
 * @author：wzx
 */
// 容器 冰箱
public class Container {
    // 存储订单的列表
    private List<Order> orderList = new ArrayList<>();

    /**
     * 向订单列表中添加一个新的订单。
     * @param order 要添加的订单对象
     */
    public void add(Order order) {
        orderList.add(order);
    }

    /**
     * 根据索引获取订单列表中的订单。
     * @param index 要获取的订单的索引
     * @return 指定索引处的订单对象
     */
    public Order get(int index) {
        return orderList.get(index);
    }
}

