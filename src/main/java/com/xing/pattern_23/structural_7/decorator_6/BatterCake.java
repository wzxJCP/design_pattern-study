package com.xing.pattern_23.structural_7.decorator_6;

public class BatterCake extends ABatterCake {
    @Override
    protected String getInfo() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 6;
    }
}
