package com.xing.pattern_23.creational_5.builder_3;

public class Car {

    private String basePlate;
    private String frame;
    private String door;

    @Override
    public String toString() {
        return "Car{" +
                "basePlate='" + basePlate + '\'' +
                ", frame='" + frame + '\'' +
                ", door='" + door + '\'' +
                '}';
    }

    public String getBasePlate() {
        return basePlate;
    }

    public void setBasePlate(String basePlate) {
        this.basePlate = basePlate;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
}
