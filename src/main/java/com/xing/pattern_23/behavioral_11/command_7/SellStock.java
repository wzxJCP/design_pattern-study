package com.xing.pattern_23.behavioral_11.command_7;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 1:28
 * @author：wzx
 */
// 卖出股票类
public class SellStock implements Order {
    // 持有的股票对象
    private Stock abcStock;
    /**
     * 构造器，传入具体的股票对象
     * @param abcStock 具体的股票对象
     */
    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    /**
     * 执行卖出股票的操作
     */
    @Override
    public void execute() {
        abcStock.sell();
    }
}

