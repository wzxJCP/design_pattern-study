package com.xing.pattern_23.creational_5.builder_3;

public class Test {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Engineer engineer = new Engineer();
        engineer.setCarBuilder(carBuilder);
        Car car = engineer.makeCar("制作汽车底盘", "制作汽车车架", "制作汽车车门");
        System.out.println(car);
    }
}

/**
 * Car{basePlate='制作汽车底盘', frame='制作汽车车架', door='制作汽车车门'}
 */
/**
 * 2.1.3 建造者(生成器)模式
 */