package com.xing.b_pattern_23.b01_creational_5.abstractfactory_2;

public class CarFrame extends CarFrameFactory {
    @Override
    public void make() {
        System.out.println("制作汽车车架");
    }
}
