package com.xing.pattern_23.behavioral_11.command_7;

import java.util.ArrayList;
import java.util.List;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 1:29
 * @author：wzx
 */
// 股票经纪人 类
public class Broker {
    // 订单列表，用于存储多个订单
    List<Order> orderList = new ArrayList<>();
    /**
     * 接收订单并添加到订单列表中
     * @param order 需要接收的订单
     */
    public void takeOrder(Order order) {
        orderList.add(order);
    }
    /**
     * 执行所有订单，并清空订单列表
     */
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}

