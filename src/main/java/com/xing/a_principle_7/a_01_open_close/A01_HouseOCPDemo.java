package com.xing.a_principle_7.a_01_open_close;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** （1）开闭原则（Open Close Principle）
 * 核心思路
 * 1. 抽象接口（契约）：HouseFunction 接口定义了房子可以具备 的“行为”（execute() 方法）；
 * 2. 对扩展开放：新增“电梯”行为时，只需新建 Elevator 类实现该接口；
 * 3. 对修改关闭：房子本体（House 类）和已有行为（如 Heating 供暖）的代码，一行都不需要修改。
 */

// ========== 1. 抽象接口：房子的“功能插槽” ==========
// 这就是房子的“设计蓝图”，定义了房子可以有什么功能
// 抽象功能接口
interface HouseFunction {
    // 执行功能
    void execute();
}

// ========== 2. 已有功能：对修改关闭 ==========
// 供暖系统 - 房子盖好时就有的功能
class Heating implements HouseFunction {
    @Override
    public void execute() {
        System.out.println("供暖系统启动！");
    }
}
// 供水系统 - 房子盖好时就有的功能
class WaterHeating implements HouseFunction {
    @Override
    public void execute() {
        System.out.println("供水系统启动！");
    }
}

// ========== 3. 新增功能：对扩展开放 ==========
// 加装电梯 - 这是后来新增的需求，但不需要修改房子结构！
class Elevator implements HouseFunction {
    @Override
    public void execute() {
        System.out.println("电梯已加装完成！");
    }
}
// 加装智能门锁 - 另一个新增功能
class SmartDoorLock implements HouseFunction {
    @Override
    public void execute() {
        System.out.println("智能门锁已加装完成！");
    }
}

// ========== 4. 房子本体：对修改关闭 ==========
// 房子类 - 它只依赖抽象的 HouseFunction 接口
// 无论加多少新功能，这个类都不需要修改
class House {
    // 房子地址
    private String address;
    // 业主
    private String owner;
    // 构造方法
    public House(String address, String owner) {
        this.address = address;
        this.owner = owner;
    }

    // 房子提供一个“安装功能”的方法，接受任何 HouseFunction
    // 这就是“对扩展开放”的入口
    public void installFunction(HouseFunction function) {
        System.out.println("["+ address + "]");
        function.execute();
    }
    public void showInfo() {
        System.out.println("房屋信息：");
        System.out.println("地址：["+ address + "]");
        System.out.println("业主：["+ owner + "]");
    }
}

// ========== 5. 客户端使用 ==========
public class A01_HouseOCPDemo {
    public static void main(String[] args) {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("【1、开闭原则（OCP）演示 - 房子加装功能】");
        System.out.println("当前时间：" + now.format(formatter)+ "\n");

        // 1.先盖一栋房子（基础系统）
        System.out.println("1.先盖一栋房子（基础系统）");
        House house = new House("深圳-南山-沙河", "张三");
        house.showInfo();
        System.out.println();

        // 2.安装基础功能（这些是房子盖好时就有的）
        System.out.println("2.安装基础功能");
        house.installFunction(new Heating());
        house.installFunction(new WaterHeating());
        System.out.println();

        // 3.新增功能：加装电梯（不拆承重墙！）
        // 再新增功能：加装智能门锁（还是不拆承重墙！）
        System.out.println("3.新增功能：加装电梯+加装智能门锁");
        house.installFunction(new Elevator());
        house.installFunction(new SmartDoorLock());
        System.out.println();

        // 4.总结
        System.out.println("4.【房子加装功能演示完毕】");
        System.out.println("✅ 开闭原则验证成功！");
        System.out.println("✅ 新增电梯和智能门锁时，没有修改任何已有代码！");
        System.out.println("✅ 承重墙（House类、Heating类、WaterSupply类）完好无损！");

    }
}
