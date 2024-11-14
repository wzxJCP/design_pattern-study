package com.xing.pattern_23.structural_7.decorator_6.example;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 17:23
 * @author：wzx
 */
// 早餐组合适配器类
public class BreakfastCombinationAdapter implements BreakfastCombination {
    private Food pancake;
    private Food egg;
    private Food sausage1;
    private Food sausage2;

    public BreakfastCombinationAdapter(Food pancake, Food egg, Food sausage1, Food sausage2) {
        this.pancake = pancake;
        this.egg = egg;
        this.sausage1 = sausage1;
        this.sausage2 = sausage2;
    }

    @Override
    public void prepareBreakfast() {
        pancake.prepare();
        egg.prepare();
        sausage1.prepare();
        sausage2.prepare();
    }

    @Override
    public int getTotalPrice() {
        return pancake.getPrice() + egg.getPrice() + sausage1.getPrice() + sausage2.getPrice();
    }
}