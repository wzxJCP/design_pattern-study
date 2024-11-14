package com.xing.pattern_23.structural_7.proxy_5.dynamicproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:11
 * @author：wzx
 */
public class OrderServiceImpl implements OrderService {
    // 定义一个OrderDao对象，用于与数据库进行交互
    private OrderDao orderDao;
    @Override
    public int saveOrder(Order order) {
        // 实例化OrderDao的实现类OrderDaoImpl
        orderDao = new OrderDaoImpl();
        // 打印一条消息，表示业务层正在调用持久层
        System.out.println("业务层调用持久层...");
        // 调用OrderDao的insertOrder方法，将订单信息插入到数据库中
        return orderDao.insertOrder(order);
    }
}
