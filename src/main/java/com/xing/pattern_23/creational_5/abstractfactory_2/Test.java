package com.xing.pattern_23.creational_5.abstractfactory_2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.getCarBasePlate();
        car.getCarFrame();
        car.getCarDoor();
        car.make();
    }
}
