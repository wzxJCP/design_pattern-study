package com.xing.pattern_23.structural_7.bridge_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 17:24
 * @author：wzx
 */
// 圆形
public class Circle implements Shape {

    @Override
    public void draw(String tools) {
        System.out.println("使用工具："+tools+" 画圆形。");
    }
}
