package com.xing.pattern_23.behavioral_11.strategy_3;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 14:45
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个 Operation 对象，并传入一个 AddStrategy 对象
        Operation operation = new Operation(new AddStrategy());
        // 执行加法操作，并输出结果
        System.out.println("10 + 5 = " + operation.execute(10, 5));
        // 创建一个 Operation 对象，并传入一个 SubtractStrategy 对象
        Operation operation1 = new Operation(new SubtractStrategy());
        // 执行减法操作，并输出结果
        System.out.println("10 - 5 = " + operation1.execute(10, 5));
        // 创建一个 Operation 对象，并传入一个 MultiplyStrategy 对象
        Operation operation2 = new Operation(new MultiplyStrategy());
        // 执行乘法操作，并输出结果
        System.out.println("10 * 5 = " + operation2.execute(10, 5));
    }
}

/**
 * 10 + 5 = 15
 * 10 - 5 = 5
 * 10 * 5 = 50
 */
