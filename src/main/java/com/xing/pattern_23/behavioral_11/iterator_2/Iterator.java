package com.xing.pattern_23.behavioral_11.iterator_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 11:39
 * @author：wzx
 */
// 定义一个名为 Iterator 的接口
public interface Iterator {
    // 定义 hasNext 方法
    // 该方法用于检查集合中是否还有下一个元素
    public boolean hasNext();

    // 定义 next 方法
    // 该方法用于返回集合中的下一个元素
    public Object next();
}
