package com.xing.pattern_23.structural_7.bridge_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 17:37
 * @author：wzx
 */
// 铅笔
public class Pencil extends Tools {
    private Shape shape;

    public Pencil(Shape shape) {
        super(shape);
        this.shape = shape;
    }
    @Override
    public void use() {
        shape.draw("铅笔");
    }
}
