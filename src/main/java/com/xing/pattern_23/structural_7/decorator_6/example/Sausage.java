package com.xing.pattern_23.structural_7.decorator_6.example;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 17:22
 * @author：wzx
 */
// 香肠类
public class Sausage implements Food {
    @Override
    public void prepare() {
        System.out.println("准备香肠");
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
