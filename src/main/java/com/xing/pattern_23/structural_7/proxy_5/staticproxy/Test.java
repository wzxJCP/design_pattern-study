package com.xing.pattern_23.structural_7.proxy_5.staticproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:20
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setInfo("订单信息,购买手机100台");
        order.setUserId("1");
        OrderServiceImplStaticProxy proxy = new OrderServiceImplStaticProxy();
        proxy.saveOrder(order);
    }
}
/**
 * 代理对象...开启事务...
 * 代理对象...调用业务层等...
 * 业务层调用持久层...
 * 插入订单成功。Order{info='订单信息,购买手机100台', userId='1'}
 * 代理对象...提交事务...
 */

/**
 * OrderServiceImpl 是实际的业务逻辑实现类。
 * OrderServiceImplStaticProxy 是 OrderServiceImpl 的静态代理类，通过代理模式在调用 saveOrder 方法前后添加了事务管理的逻辑。
 *
 * 代理模式通过引入一个代理对象来间接访问目标对象，从而可以在不修改目标对象的情况下，
 * 增加额外的功能或控制访问权限。这种模式在许多框架和系统中都有广泛的应用，如Spring AOP、Hibernate等。
 */