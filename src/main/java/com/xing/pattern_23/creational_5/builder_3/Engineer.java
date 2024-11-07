package com.xing.pattern_23.creational_5.builder_3;

public class Engineer {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car makeCar(String basePlate, String frame,String door) {
        carBuilder.buildBasePlate(basePlate);
        carBuilder.buildFrame(frame);
        carBuilder.buildDoor(door);
        return carBuilder.makeCar();
    }
}

/**
 * Car{basePlate='制作汽车底盘', frame='制作汽车车架', door='制作汽车车门'}
 */
/**
 * 2.1.3 建造者(生成器)模式
 */