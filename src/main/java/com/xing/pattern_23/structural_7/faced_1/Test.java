package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 10:37
 * @author：wzx
 */
public class Test {
    /**
     * 主方法，程序的入口点。
     * 在此方法中，创建一个菜品对象，设置菜品名称，并调用订单处理系统的 `orderTaking` 方法。
     * @param args 命令行参数（本示例中未使用）。
     */
    public static void main(String[] args) {
        // 创建一个 Food 对象
        Food food = new Food();
        // 设置菜品名称
        food.setName("西红柿鸡蛋面");
        // 创建一个 TackingSystem 对象
        TackingSystem tackingSystem = new TackingSystem();
        // 调用 TackingSystem 的 orderTaking 方法处理订单
        tackingSystem.orderTaking(food);
    }
}