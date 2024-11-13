package com.xing.pattern_23.structural_7.bridge_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 17:32
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 使用工具去绘制图形
        Tools tools = new Pencil(new Circle());
        // 绘制圆形
        tools.use();

        Tools tools2 = new Pen(new Square());
        // 绘制方形
        tools2.use();
    }
}
/**
 * 使用工具：铅笔 画圆形。
 * 使用工具：钢笔 画方形。
 */
/**
 * Shape  形状
 * Circle 圆形
 * Square 方形
 * Tools  工具
 * Pencil 铅笔
 * Pen    钢笔
 */