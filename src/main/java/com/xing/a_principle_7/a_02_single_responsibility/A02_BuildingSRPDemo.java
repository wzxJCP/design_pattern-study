package com.xing.a_principle_7.a_02_single_responsibility;

/** （2）单一职责原则（Single Responsibility Principle，SRP）
 * 核心思路
 * 1.单一职责：每个类只负责一件事，就像砖块只负责承重，钢筋只负责抗拉；
 * 2.职责分离：把“砖块”、“钢筋”、“水泥”各自封装成独立类；
 * 3.高内聚低耦合：修改砖块的逻辑，不会影响钢筋和水泥。
 */

// ========== 1. 砖块：只负责承重 ==========
// 砖块的职责很纯粹——承受压力
class Brick {
    // 承重能力（单位：吨）
    private double loadCapacity;
    // 构造方法
    public Brick(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    // 砖块唯一的工作：承重
    public double bearLoad() {
        System.out.println("砖块承重：" + loadCapacity + "吨");
        return loadCapacity;
    }
    // 获取砖块的承重能力
    public double getLoadCapacity() {
        return loadCapacity;
    }
}

// ========== 2. 钢筋：只负责抗拉 ==========
// 钢筋的职责也很纯粹——抵抗拉力
class Rebar {
    // 抗拉能力（单位：吨）
    private double tensileStrength;
    // 构造方法
    public  Rebar(double tensileStrength) {
        this.tensileStrength = tensileStrength;
    }
    // 钢筋唯一工作：抗拉
    public double resistTension() {
        System.out.println("钢筋抗拉：" + tensileStrength + "吨");
        return tensileStrength;
    }
    // 获取钢筋的抗拉能力
    public double getTensileStrength() {
        return tensileStrength;
    }
}

// ========== 3. 水泥：只负责粘结 ==========
// 水泥的职责——把砖块和钢筋粘在一起
class Cement {
    // 水泥的粘合力（单位：kip）
    private double bondingStrength;
    // 构造方法
    public Cement(double bondingStrength) {
        this.bondingStrength = bondingStrength;
    }
    // 水泥唯一工作：粘合
    public void bond() {
        System.out.println("水泥粘结：强度 " + bondingStrength);
    }
}

// ========== 5. 客户端演示 ==========
public class A02_BuildingSRPDemo {
    public static void main(String[] args) {
        System.out.println("【2、单一职责原则（SRP）演示 - 建筑材料】");
        System.out.println("✅ 遵循SRP：职责清晰");

        // 1. 砖块只负责承重
        System.out.println("\n1.砖块（Brick）——只负责承重");
        Brick brick = new Brick(10.0);
        brick.bearLoad();

        // 2. 钢筋只负责抗拉
        System.out.println("\n2.钢筋（Rebar）——只负责抗拉");
        Rebar rebar = new Rebar(5.0);
        rebar.resistTension();

        // 3. 水泥只负责粘结
        System.out.println("\n3.水泥（Cement）——只负责粘结");
        Cement cement = new Cement(8.0);
        cement.bond();

        // 4. 组合使用：建一堵墙
        System.out.println("\n4. 组合使用：建一堵墙");
        System.out.println("砖块承重：" + brick.getLoadCapacity() + "吨 + 钢筋抗拉：" + rebar.getTensileStrength() + "吨 + 水泥粘结");
        System.out.println("✅ 各司其职，互不干扰！");
    }
}
