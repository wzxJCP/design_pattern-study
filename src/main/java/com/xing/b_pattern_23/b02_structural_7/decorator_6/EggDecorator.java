package com.xing.b_pattern_23.b02_structural_7.decorator_6;

public class EggDecorator extends ADecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void someThing() {

    }

    @Override
    protected String getInfo() {
        return super.getInfo() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
