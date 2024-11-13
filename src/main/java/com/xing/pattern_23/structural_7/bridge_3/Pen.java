package com.xing.pattern_23.structural_7.bridge_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 17:38
 * @author：wzx
 */
// 钢笔
public class Pen extends Tools {
    private Shape shape;

    public Pen(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void use() {
        shape.draw("钢笔");
    }
}
