package com.xing.pattern_23.structural_7.decorator_6.example;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 17:21
 * @author：wzx
 */
// 鸡蛋类
public class Egg implements Food {
    @Override
    public void prepare() {
        System.out.println("准备鸡蛋");
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
