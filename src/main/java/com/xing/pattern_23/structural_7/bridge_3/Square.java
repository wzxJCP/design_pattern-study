package com.xing.pattern_23.structural_7.bridge_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 17:25
 * @author：wzx
 */
// 方形
public class Square implements Shape {
    @Override
    public void draw(String tools) {
        System.out.println("使用工具："+tools+" 画方形。");
    }
}
