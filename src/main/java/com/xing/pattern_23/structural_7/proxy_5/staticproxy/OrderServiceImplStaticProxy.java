package com.xing.pattern_23.structural_7.proxy_5.staticproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:15
 * @author：wzx
 */
public class OrderServiceImplStaticProxy {
    // 定义一个OrderService对象，用于调用实际的业务逻辑
    private OrderService orderService;
    /**
     * 保存订单的方法，使用静态代理模式增强业务逻辑。
     * @param order 要保存的订单对象
     * @return 保存成功返回1，失败返回0
     */
    public int saveOrder(Order order) {
        // 实例化OrderService的实际实现类
        orderService = new OrderServiceImpl();
        // 执行代理的业务逻辑，例如开启事务
        before();
        // 打印一条消息，表示代理对象正在调用业务层
        System.out.println("代理对象...调用业务层等...");
        // 调用实际的业务逻辑方法，保存订单
        int result = orderService.saveOrder(order);
        // 执行代理的业务逻辑，例如提交事务
        after();
        // 返回保存操作的结果
        return result;
    }

    // 开启事务的业务逻辑。
    public void before() {
        System.out.println("代理对象...开启事务...");
    }

    // 提交事务的业务逻辑。
    public void after() {
        System.out.println("代理对象...提交事务...");
    }
}

