package com.xing.b_pattern_23.b01_creational_5.builder_3;

public class CarBuilder extends Builder {

    private Car car = new Car();
    @Override
    public void buildBasePlate(String basePlate) {
        car.setBasePlate(basePlate);
    }

    @Override
    public void buildFrame(String frame) {
        car.setFrame(frame);
    }

    @Override
    public void buildDoor(String door) {
        car.setDoor(door);
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
