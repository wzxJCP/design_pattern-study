package com.xing.pattern_23.structural_7.proxy_5.dynamicproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 15:51
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        OrderService proxy = (OrderService) new OrderServiceImplStaticProxy(new OrderServiceImpl()).bind();
        Order order = new Order();
        order.setInfo("购买华为 Mate100");
        order.setUserId("1");
        proxy.saveOrder(order);
    }
}
/**
 * 代理对象...开启事务...
 * 业务层调用持久层...
 *
 * 插入订单成功。Order{info='购买华为 Mate100', userId='1'}
 *
 * 代理对象...提交事务...
 */
