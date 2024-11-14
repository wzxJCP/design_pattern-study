package com.xing.pattern_23.structural_7.proxy_5.staticproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:09
 * @author：wzx
 */
/**
 * 保存一个新的订单记录。
 * @param order 要保存的订单对象
 * @return 保存成功返回1，失败返回0
 */
public interface OrderService {
    int saveOrder(Order order);
}
