package com.xing.pattern_23.structural_7.decorator_6;

public class SausageDecorator extends ADecorator {

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void someThing() {

    }

    @Override
    protected String getInfo() {
        return super.getInfo() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 3;
    }
}
