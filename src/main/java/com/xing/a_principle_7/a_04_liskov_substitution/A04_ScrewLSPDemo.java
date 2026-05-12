package com.xing.a_principle_7.a_04_liskov_substitution;

/** （4）里氏替换原则（Liskov Substitution Principle、LSP）
 * 核心思路
 * 1.里氏替换：子类必须能替换父类，就像任何品牌的螺丝钉都能拧进标准螺孔；
 * 2.质量检验：如果拧进去会滑丝、拧不紧，说明违反了LSP；
 * 3.行为一致：子类不能改变父类的行为契约，否则就是"不合格产品"。
 */

// ========== 1.抽象基类：标准螺丝钉 ==========
// 所有螺丝钉都必须能拧紧，这是基本契约
abstract class Screw {
    // 品牌、直径
    protected String brand;
    protected double diameter;
    public Screw(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }
    // 螺丝钉的核心行为：拧紧
    // 这是所有子类必须遵守的契约
    public abstract void tighten();
    public String getBrand() {
        return brand;
    }
    public double getDiameter() {
        return diameter;
    }
}

// ========== 2.合格产品：能替换父类的子类 ==========
// 品牌A的螺丝钉——完全遵守契约
class BrandAScrew extends Screw {
    public BrandAScrew(double diameter) {
        super("品牌A",diameter);
    }
    @Override
    public void tighten() {
        System.out.println(brand + "螺丝钉（" + diameter + "mm）已拧紧，扭矩达标A！" );

    }
}
// 品牌B的螺丝钉——也完全遵守契约
class BrandBScrew extends Screw {
    public BrandBScrew(double diameter) {
        super("品牌B", diameter);
    }
    @Override
    public void tighten() {
        System.out.println(brand + "螺丝钉（" + diameter + "mm）已拧紧，扭矩达标B！");

    }
}
// 品牌C的螺丝钉——也完全遵守契约
class BrandCScrew extends Screw {
    public BrandCScrew(double diameter) {
        super("品牌C", diameter);
    }
    @Override
    public void tighten() {
        System.out.println(brand + "螺丝钉（" + diameter + "mm）已拧紧，扭矩达标C！");

    }
}

// ========== 3. 不合格产品：违反LSP的子类 ==========
// 劣质螺丝钉——拧进去会滑丝！
class InferiorScrew extends Screw {
    public InferiorScrew(double diameter) {
        super("劣质品牌", diameter);
    }
    @Override
    public void tighten() {
        // 违反了父类的契约：螺丝钉应该能拧紧
        System.out.println(brand + "螺丝钉（" + diameter + "mm）拧进去就滑丝了！");
        // 甚至可能抛出异常
        // throw new RuntimeException("螺丝钉滑丝，无法拧紧！");
    }
}
// 特殊材质螺丝钉——拧不紧！
class PlasticScrew extends Screw {
    public PlasticScrew(double diameter) {
        super("塑料材质", diameter);
    }

    @Override
    public void tighten() {
        // 违反了父类的契约：螺丝钉应该能拧紧
        System.out.println(brand + "螺丝钉（" + diameter + "mm）太软了，根本拧不紧！");
    }
}

// ========== 4.使用场景：组装家具 ==========
// 这个类只关心螺丝钉能拧紧，不关心具体品牌
class Furniture {
    private String name;
    public Furniture(String name) {
        this.name = name;
    }
    // 组装家具：接受任何符合标准的螺丝钉
    // 这就是LSP的核心：父类出现的地方，子类都能替换
    public void assemble(Screw screw) {
        System.out.println("正在组装【" + name + "】，使用 " + screw.getBrand() + " 螺丝钉...");
        // 期望螺丝钉能正常拧紧
        screw.tighten();
        System.out.println("组装完成！");
    }
}

public class A04_ScrewLSPDemo {
    // ========== 5. 客户端演示 ==========
    public static void main(String[] args) {
        System.out.println("【4、里氏替换原则（LSP）演示 - 螺丝钉质量检验】");
        // ===== 第一部分：合格的螺丝钉（遵循LSP） =====
        System.out.println("✅ 质量检验：合格产品（遵循LSP）");
        Furniture desk = new Furniture("办公桌");
        // 品牌A的螺丝钉——能替换父类
        System.out.println("1.使用品牌A螺丝钉");
        desk.assemble(new BrandAScrew(5.0));
        // 品牌B的螺丝钉——能替换父类
        System.out.println("2.使用品牌B螺丝钉");
        desk.assemble(new BrandBScrew(5.0));
        // 品牌C的螺丝钉——能替换父类
        System.out.println("3.使用品牌C螺丝钉");
        desk.assemble(new BrandCScrew(5.0));
        System.out.println();

        // ===== 第二部分：不合格的螺丝钉（违反LSP） =====
        System.out.println("❌ 质量检验：不合格产品（违反LSP）");
        // 劣质螺丝钉——拧进去就滑丝！
        System.out.println("1.使用劣质品牌螺丝钉");
        desk.assemble(new InferiorScrew(5.0));
        // 塑料螺丝钉——根本拧不紧！
        System.out.println("2.使用塑料材质螺丝钉");
        desk.assemble(new PlasticScrew(5.0));
        System.out.println();

        // ===== 第三部分：LSP的本质 =====
        System.out.println("📋 LSP的本质");
        System.out.println("✅ 父类（Screw）定义的行为契约：必须能拧紧");
        System.out.println("✅ 合格的子类（BrandA/B/C）：遵守契约，能正常替换");
        System.out.println("✅ 不合格的子类（Inferior/Plastic）：违反契约，替换后出问题");
        System.out.println("✅ 里氏替换原则：子类必须能无副作用地替换父类！");

        // ===== 第四部分：经典反例（正方形和矩形） =====
        System.out.println("\n🚫 经典反例：正方形不是矩形");
        System.out.println("虽然数学上正方形是矩形，但在程序中：");
        System.out.println("矩形：宽和高可以独立设置");
        System.out.println("正方形：宽和高必须相等");
        System.out.println("如果用正方形替换矩形，设置宽度时会改变高度，违反LSP！");
    }
}

/**
 * 里氏替换原则（LSP）的核心一句话总结：
 * 子类必须能够替换父类，且替换后程序的行为逻辑依然正确，不会破坏父类定义的行为契约。
 * 结合代码理解：
 * 就像螺丝钉代码一样，Furniture 类（客户端）期望任何 Screw（父类）都能被拧紧。
 * BrandAScrew（子类）遵守了这个契约，所以替换成功；而 InferiorScrew（劣质子类）虽然语法上继承了父类，
 * 但行为上破坏了“能拧紧”这个契约（导致滑丝），这就是违反了 LSP。
 * 简单来说，继承不仅要“长得像”（属性），更要“做得对”（行为）。
 *
 * “正方形不是矩形” 告诉我们：
 * 在代码世界里，行为的兼容性比数学的分类学更重要。如果子类无法在不破坏逻辑的前提下替换父类，
 * 那么哪怕数学关系再完美，也不要强行继承。
 */