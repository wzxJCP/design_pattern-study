package com.xing.pattern_23.behavioral_11.iterator_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 11:50
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个 Container 对象，具体实现为 NameContainer
        Container container = new NameContainer();

        // 获取容器的迭代器对象
        for (Iterator iterator = container.getIterator(); iterator.hasNext();) {
            // 获取下一个元素，并将其强制转换为 String 类型
            String name = (String) iterator.next();
            // 输出当前获取的姓名
            System.out.println("姓名：》》》" + name);
        }
    }
}
