package com.xing.pattern_23.creational_5.builder_3;

public abstract class Builder {
    public abstract void buildBasePlate(String basePlate);
    public abstract void buildFrame(String frame);
    public abstract void buildDoor(String door);
    public abstract Car makeCar();
}
