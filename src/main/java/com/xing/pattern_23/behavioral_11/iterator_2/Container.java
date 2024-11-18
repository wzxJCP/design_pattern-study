package com.xing.pattern_23.behavioral_11.iterator_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 11:42
 * @author：wzx
 */
// 定义一个名为 Container 的接口
public interface Container {
    // 定义 getIterator 方法
    // 该方法用于返回一个实现了 Iterator 接口的对象
    public Iterator getIterator();
}
