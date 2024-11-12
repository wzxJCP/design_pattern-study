package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 10:19
 * @author：wzx
 */
/** 外观类
 * TackingSystem 类表示订单处理系统。
 * 它整合了选择菜品、支付和生成订单的功能，通过组合 `SelectFoodService`、`PayService` 和 `OrderService` 类来实现。
 */
public class TackingSystem {
    // 选择菜品的服务
    private SelectFoodService selectFoodService;
    // 支付服务
    private PayService payService;
    // 订单服务
    private OrderService orderService;

    /**
     * 构造函数，用于初始化订单处理系统。
     * 初始化 `SelectFoodService`、`PayService` 和 `OrderService` 实例。
     */
    public TackingSystem() {
        selectFoodService = new SelectFoodService();
        payService = new PayService();
        orderService = new OrderService();
    }
    /**
     * 订单处理方法。
     * 该方法依次调用选择菜品、检查余额、支付和生成订单的功能。
     * @param food 要处理的菜品对象。
     */
    public void orderTaking(Food food) {
        // 选择菜品
        selectFoodService.selectFood(food.getName());
        // 检查余额
        boolean result = payService.checkBalance();
        if (result) {
            // 支付
            payService.pay();
            // 生成订单
            orderService.makeOrder();
        } else {
            System.out.println("余额不足，无法完成支付。");
        }
    }
}
