package com.xing.pattern_23.structural_7.decorator_6.example;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 17:23
 * @author：wzx
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体的煎饼、鸡蛋和香肠对象
        Food pancake = new Pancake();
        Food egg = new Egg();
        Food sausage1 = new Sausage();
        Food sausage2 = new Sausage();

        // 创建早餐组合适配器对象
        BreakfastCombination breakfastCombination = new BreakfastCombinationAdapter(pancake, egg, sausage1, sausage2);

        // 准备早餐
        breakfastCombination.prepareBreakfast();

        // 计算并打印总价
        int totalPrice = breakfastCombination.getTotalPrice();
        System.out.println("早餐总价: " + totalPrice + "元");
    }
}
/**
 * 准备煎饼
 * 准备鸡蛋
 * 准备香肠
 * 准备香肠
 * 早餐总价: 14.0元
 */
/**
 * 1. 定义食物接口
 * 首先，我们定义一个通用的食物接口，包括准备方法和获取价格的方法。
 * 2. 定义具体的食物类
 * 接下来，我们定义具体的（煎饼、鸡蛋、香肠）类，并实现食物接口。
 * 3. 定义早餐组合接口
 * 定义一个早餐组合接口，表示一个完整的早餐组合，并包括计算总价的方法。
 * 4. 定义适配器类
 * 适配器类将具体的煎饼、鸡蛋和香肠组合在一起，实现早餐组合接口，并计算总价。
 * 5. 测试客户端代码
 * 最后，我们编写一个客户端代码来测试适配器模式的实现。
 */