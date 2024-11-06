package com.xing.pattern_23.creational_5.abstractfactory_2;

public class Car implements CarFactory {

    private CarDoor carDoor = null;
    private CarFrame carFrame = null;
    private CarBasePlate carBasePlate = null;

    @Override
    public CarDoor getCarDoor() {
        carDoor = new CarDoor();
        return carDoor;
    }

    @Override
    public CarFrame getCarFrame() {
        carFrame = new CarFrame();
        return carFrame;
    }

    @Override
    public CarBasePlate getCarBasePlate() {
        carBasePlate = new CarBasePlate();
        return carBasePlate;
    }

    @Override
    public void make() {
        carDoor.make();
        carFrame.make();
        carBasePlate.make();
        System.out.println("小汽车组装完成。");
    }
}
