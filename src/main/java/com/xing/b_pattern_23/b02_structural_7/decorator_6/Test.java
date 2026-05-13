package com.xing.b_pattern_23.b02_structural_7.decorator_6;

public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getInfo() + "\n总价格为：>>>" + aBatterCake.cost());
    }
}
