package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 10:28
 * @author：wzx
 */
/**
 * SelectFoodService 类表示选择菜品的服务。
 * 它包含一个方法 `selectFood`，用于选择菜品并打印选择的信息。
 */
public class SelectFoodService {

    /**
     * 选择菜品的方法。
     * 此方法接收一个菜品名称作为参数，并打印一条消息表示选择了该菜品。
     *
     * @param name 菜品的名称。
     */
    public void selectFood(String name) {
        System.out.println("选择菜品：" + name);
    }
}