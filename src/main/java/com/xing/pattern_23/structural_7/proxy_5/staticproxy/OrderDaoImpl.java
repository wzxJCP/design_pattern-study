package com.xing.pattern_23.structural_7.proxy_5.staticproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:10
 * @author：wzx
 */
public class OrderDaoImpl implements OrderDao{
    @Override
    public int insertOrder(Order order) {
        // 打印插入成功的消息和订单信息
        System.out.println("插入订单成功。"+order);
        // 返回1表示插入成功
        return 1;
    }
}
