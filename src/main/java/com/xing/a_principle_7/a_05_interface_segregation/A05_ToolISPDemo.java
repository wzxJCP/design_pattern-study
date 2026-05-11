package com.xing.a_principle_7.a_05_interface_segregation;

/** （5）接口隔离原则（Interface Segregation Principle）
 * 核心思路
 * 1. 接口隔离：拒绝“万能工具”，提倡“专用工具”；
 * 2. 拆分接口：螺丝刀只负责拧螺丝，锤子只负责敲钉子；
 * 3. 按需依赖：工人只拿自己需要的工具，不被强迫依赖不用的功能。
 */
// ========== 1. 反面教材：万能工具（臃肿接口） ==========
// 这是一个典型的违反ISP的接口，把不该有的功能都塞进来了
interface SuperTool {
    // 拧螺丝、敲钉子、锯木头
    void screw();
    void hammer();
    void saw();
}
// 只有锯子的工人——被迫实现不需要的拧螺丝和敲钉子方法
class SawWorker implements SuperTool {
    @Override
    public void screw() {
        System.out.println("锯子工人被迫实现拧螺丝。×");
    }
    @Override
    public void hammer() {
        System.out.println("锯子工人被迫实现敲钉子。×");

    }

    @Override
    public void saw() {
        System.out.println("锯子工人正常在做锯木头的工作！√");
    }
}

// ========== 2. 正面教材：专用工具（隔离后的接口） ==========
// 螺丝刀接口——只负责拧螺丝
interface ScrewDriver {
    void screw();
}
// 锤子接口——只负责敲钉子
interface Hammer {
    void hammer();
}
// 锯子接口——只负责锯木头
interface Saw {
    void saw();
}
// 专业钳工——只需要螺丝刀
class Fitter implements ScrewDriver {
    @Override
    public void screw() {
        System.out.println("钳工拿着螺丝刀，专注拧螺丝！√");
    }
}
// 专业木工——只需要锯子
class Carpenter implements Saw {
    @Override
    public void saw() {
        System.out.println("木工拿着锯子，专注锯木头！√");
    }
}
// 综合维修工——需要螺丝刀和锤子（按需组合）
class Repairman implements ScrewDriver, Hammer {
    @Override
    public void screw() {
        System.out.println("维修工拧螺丝。√");
    }

    @Override
    public void hammer() {
        System.out.println("维修工敲钉子。√");
    }
}

// ========== 3. 客户端演示 ==========
public class A05_ToolISPDemo {
    public static void main(String[] args) {
        System.out.println("【5、接口隔离原则（ISP）演示 - 专用工具】");
        // ===== 第一部分：反面教材（违反ISP） =====
        System.out.println("❌ 违反ISP：万能工具（臃肿接口） =====");
        System.out.println("场景：招聘一个只会用锯子的工人（SawWorker）");
        SuperTool worker = new SawWorker();
        // 客户端被迫看到不需要的功能，或者工人被迫实现空方法
        worker.saw();    // 真正想做的
        worker.screw();  // 被迫实现的“累赘”
        worker.hammer(); // 被迫实现的“累赘”

        // ===== 第二部分：正面教材（遵循ISP） =====
        System.out.println("\n✅ 遵循ISP：专用工具（隔离接口） =====");
        // 1. 木工只需要锯子
        System.out.println("1.木工（Carpenter）——只依赖Saw接口");
        Saw carpenter = new Carpenter();
        carpenter.saw();
        // carpenter.screw(); // 编译报错！想调都没法调，保证了安全
        // 2. 钳工只需要螺丝刀
        System.out.println("2.钳工（Fitter）——只依赖ScrewDriver接口");
        ScrewDriver fitter = new Fitter();
        fitter.screw();
        // 3. 维修工需要多种工具（按需组合）
        System.out.println("3.维修工（Repairman）——按需组合ScrewDriver和Hammer");
        Repairman repairman = new Repairman();
        repairman.screw();
        repairman.hammer();

        // ===== 总结 =====
        System.out.println("\n📋 总结 =====");
        System.out.println("违反ISP：工人被迫实现不会用的工具（代码冗余/抛异常）");
        System.out.println("遵循ISP：木工只拿锯子，钳工只拿螺丝刀（职责单一）");
        System.out.println("接口隔离原则：建立专用工具，不搞万能工具！");
    }
}

/**
 * 各个人只负责自己的工作，不搞万能工具！
 */