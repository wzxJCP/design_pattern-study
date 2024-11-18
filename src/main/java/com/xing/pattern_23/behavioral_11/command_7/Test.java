package com.xing.pattern_23.behavioral_11.command_7;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 1:30
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建股票对象
        Stock abcStock = new Stock();
        // 创建购买股票命令对象
        BuyStock buyStock = new BuyStock(abcStock);
        // 创建卖出股票命令对象
        SellStock sellStock = new SellStock(abcStock);
        // 创建经纪人对象
        Broker broker = new Broker();

        // 将购买股票命令交给经纪人
        broker.takeOrder(buyStock);
        // 将卖出股票命令交给经纪人
        broker.takeOrder(sellStock);
        // 经纪人执行所有命令
        broker.placeOrders();
    }
}

/**
 * 购入[股票 : ABC] , 数量 : 100 股
 * 卖出[股票 : ABC] , 数量 : 100 股
 */

/**
 * 2.3.7 命令模式（Command Pattern）
 */