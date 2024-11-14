package com.xing.pattern_23.structural_7.decorator_6.example;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 17:20
 * @author：wzx
 */
// 煎饼类
public class Pancake implements Food {
    @Override
    public void prepare() {
        System.out.println("准备煎饼");
    }

    @Override
    public int getPrice() {
        return 6;
    }
}
