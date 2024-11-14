package com.xing.pattern_23.structural_7.decorator_6;

public abstract class ADecorator extends ABatterCake {

    private ABatterCake aBatterCake;

    public ADecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getInfo() {
        return this.aBatterCake.getInfo();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }

    protected abstract void someThing();

}
