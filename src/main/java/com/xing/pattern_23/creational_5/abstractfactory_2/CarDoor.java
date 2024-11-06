package com.xing.pattern_23.creational_5.abstractfactory_2;

public class CarDoor extends CarDoorFactory {
    @Override
    public void make() {
        System.out.println("制作汽车车门");
    }
}
