package com.xing.a_principle_7.a_01_openclose;

/**
 * 设计模式-7大原则
 * 开闭原则（Open Close Principle）
 */

// 1. 抽象接口 - 对扩展开放
interface DiscountStrategy {
    double calculateDiscount(double price);
}

// 2. 具体实现类 - 每个策略独立
class VIPDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.8;  // VIP用户8折
    }
}

class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.9;  // 普通用户9折
    }
}

// 3. 新增学生用户折扣 - 只需新增类，无需修改现有代码！
class StudentDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.85;  // 学生用户85折
    }
}

// 4. 折扣计算器 - 对修改关闭
class DiscountCalculator {
    private DiscountStrategy strategy;

    // 通过构造器注入策略
    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double price) {
        return strategy.calculateDiscount(price);
    }
}

// 5. 客户端使用
public class GoodExample {
    public static void main(String[] args) {
        System.out.println("=== 开闭原则演示 ===");
        // 客户端根据需要选择策略
        DiscountCalculator vipCalc = new DiscountCalculator(new VIPDiscount());
        DiscountCalculator regularCalc = new DiscountCalculator(new RegularDiscount());
        DiscountCalculator studentCalc = new DiscountCalculator(new StudentDiscount());
        double price = 100.0;
        System.out.println("原价: " + price + "元");
        System.out.println("VIP用户实付: " + vipCalc.calculate(price) + "元");
        System.out.println("普通用户实付: " + regularCalc.calculate(price) + "元");
        System.out.println("学生用户实付: " + studentCalc.calculate(price) + "元");
        // 如果要新增"企业用户"打75折，只需新增类，无需修改现有代码！
        // class EnterpriseDiscount implements DiscountStrategy { ... }
    }
}

