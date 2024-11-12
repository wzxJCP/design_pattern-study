package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 10:37
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        Food food = new Food();
        food.setName("西红柿鸡蛋面");

        TackingSystem tackingSystem = new TackingSystem();
        tackingSystem.orderTaking(food);
    }
}
