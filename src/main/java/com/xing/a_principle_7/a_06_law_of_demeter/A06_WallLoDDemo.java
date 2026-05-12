package com.xing.a_principle_7.a_06_law_of_demeter;

/** （6）迪米特原则（Law of Demeter Principle）
 * 核心思路
 * 1.迪米特法则：施工规范——水电工只和墙里的管道打交道，不和木工的工具箱直接接触；
 * 2.拒绝链式调用：禁止出现 worker.getToolBox().getHammer().hit() 这种“火车残骸”代码；
 * 3.封装交互：墙体（Wall）负责协调内部组件，外部人员只需对接墙体接口。
 */
// ========== 1.底层组件：木工的工具箱-（陌生人） ==========
// 这是木工的私有财产，水电工不应该知道它的存在
class ToolBox {
    public void repair(){
        System.out.println("工具箱正在被使用...");
    }
}

// ========== 2.直接朋友：木工（中间层）-（朋友关系） ==========
// 木工拥有工具箱，但只对外提供“修缮”服务，不暴露工具箱本身
class Carpenter {
    private ToolBox toolBox = new ToolBox();
    //✅ 正确做法：提供高层方法，隐藏内部细节
    public void doMaintenance() {
        System.out.println("木工收到指令。");
        toolBox.repair();
    }
    //❌ 错误做法（违反LoD）：暴露内部私有对象
    // public ToolBox getToolBox() { return toolBox; }
}

// ========== 3.施工场景：墙体（封装者） ==========
// 墙体负责协调内部的木工和水管，外部只需要找墙体
class Wall {
    private Carpenter carpenter = new Carpenter();
    private String waterPipe = "PPR水管";
    //✅ 正确做法：封装所有内部交互逻辑
    public void performRenovation() {
        System.out.println("墙体开始施工协调...");
        // 内部逻辑：墙体指挥木工干活
        carpenter.doMaintenance();
        // 内部逻辑：墙体处理水管
        System.out.println("墙体正在处理" + waterPipe);
    }
}

// ========== 4.客户端：水电工（调用者） ==========
// 水电工只负责装修墙体，不应该直接接触木工的工具箱
public class A06_WallLoDDemo {
    public static void main(String[] args) {
        System.out.println("【6、迪米特法则（LoD）演示 - 施工规范】");
        // ===== 第一部分：反面教材（违反LoD） =====
        // 假设我们错误地暴露了 Carpenter
        System.out.println("❌ 违反LoD：水电工越界操作");
        System.out.println("场景：水电工试图直接去拿木工的工具箱...");

        // ===== 第二部分：正面教材（遵循LoD） =====
        System.out.println("\n✅ 遵循LoD：严守施工规范");
        // 1.水电工只和“墙体”打交道
        Wall wall = new Wall();
        // 2.水电工调用墙体的统一接口
        System.out.println("1.水电工呼叫墙体进行装修...");
        wall.performRenovation();
        // 3.结果
        System.out.println("\n结果：装修完成！");
        System.out.println("水电工全程没碰木工的工具箱，也没问木工是谁。");

        // ===== 总结 =====
        System.out.println("\n📋 总结");
        System.out.println("违反LoD：水电工 -> 墙体 -> 木工 -> 工具箱（耦合度极高，牵一发而动全身）");
        System.out.println("遵循LoD：水电工 -> 墙体（墙体内部自己协调，外部无感知）");
        System.out.println("迪米特法则：只和直接朋友说话，别碰陌生人的东西！");
    }
}

/**
 * 迪米特原则（LoD）的核心一句话总结：
 * 一个对象应该对其他对象有最少的了解，只和“直接朋友”通信，不要和“陌生人”说话。
 * 结合代码理解：
 * 就像装修代码一样，水电工（客户端）只认识墙体（直接朋友），至于墙里面藏着木工（朋友的朋友）和工具箱（陌生人），
 * 水电工完全不需要知道，也不应该去直接调用它们的方法。这就是通过封装交互细节，实现了类之间的松耦合。
 */