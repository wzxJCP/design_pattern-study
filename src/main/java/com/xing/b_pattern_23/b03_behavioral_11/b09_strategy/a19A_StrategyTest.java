package com.xing.b_pattern_23.b03_behavioral_11.b09_strategy;

interface BrakeBehavior {
    public void stop();
}

class LongWheelBrake implements BrakeBehavior {
    @Override
    public void stop() {
        System.out.println("模拟长轮胎刹车痕迹！");
    }
}
class ShortWheelBrake implements BrakeBehavior {
    @Override
    public void stop() {
        System.out.println("模拟短轮胎刹车痕迹");
    }
}

abstract class Car {
    protected BrakeBehavior wheel;
    public void brake() {
        wheel.stop();
    }
}

class ShortWheelCar extends Car {
    public ShortWheelCar(BrakeBehavior behavior) {
        wheel = behavior;
    }
}

public class a19A_StrategyTest {
    public static void main(String[] args) {
        ShortWheelBrake brake = new ShortWheelBrake();
        ShortWheelCar car = new ShortWheelCar(brake);
        car.brake();
    }
}

/**
 * 1、void stop()
 * 2、BrakeBehavior
 * 3、wheel.stop();
 * 4、wheel = behavior;
 * 5、brake();
 */