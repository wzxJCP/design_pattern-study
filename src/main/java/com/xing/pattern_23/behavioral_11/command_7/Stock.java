package com.xing.pattern_23.behavioral_11.command_7;

/**
 * @project：design_pattern-study
 * @since：2024/11/18 18:05
 * @author：wzx
 */
// 股票类
public class Stock {
    // 股票名称
    private String name = "ABC";
    // 股票数量
    private int count = 100;

    /**
     * 购买股票方法
     */
    public void buy() {
        System.out.println("购入[股票 : "+name+"] , 数量 : "+count+" 股");
    }

    /**
     * 卖出股票方法
     */
    public void sell() {
        System.out.println("卖出[股票 : "+name+"] , 数量 : "+count+" 股");
    }
}

