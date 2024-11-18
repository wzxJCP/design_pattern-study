package com.xing.pattern_23.behavioral_11.iterator_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 11:44
 * @author：wzx
 */
// 定义一个名为 NameContainer 的类，实现 Container 接口
public class NameContainer implements Container {

    // 定义一个字符串数组，存储名字
    private String[] names = {"Tom", "Jerry", "Mike", "Lucy"};

    // 实现 Container 接口的 getIterator 方法
    @Override
    public Iterator getIterator() {
        // 返回一个新的 NameIterator 对象
        return new NameIterator();
    }

    // 定义一个内部类 NameIterator，实现 Iterator 接口
    private class NameIterator implements Iterator {

        // 定义一个索引变量，用于记录当前遍历的位置
        int index;

        // 实现 Iterator 接口的 hasNext 方法
        @Override
        public boolean hasNext() {
            // 检查索引是否小于数组的长度
            if (index < names.length) {
                return true;
            }
            return false;
        }

        // 实现 Iterator 接口的 next 方法
        @Override
        public Object next() {
            // 如果还有下一个元素
            if (this.hasNext()) {
                // 返回当前索引处的名字，并将索引递增
                return names[index++];
            }
            // 如果没有下一个元素，返回 null
            return null;
        }
    }
}
