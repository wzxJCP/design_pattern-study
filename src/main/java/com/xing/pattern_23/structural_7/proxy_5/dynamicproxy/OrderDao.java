package com.xing.pattern_23.structural_7.proxy_5.dynamicproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:08
 * @author：wzx
 */

/**
 * 插入一个新的订单记录到数据库中。
 * @param order 要插入的订单对象
 * @return 插入成功返回1，失败返回0
 */
public interface OrderDao {
    int insertOrder(Order order);
}
