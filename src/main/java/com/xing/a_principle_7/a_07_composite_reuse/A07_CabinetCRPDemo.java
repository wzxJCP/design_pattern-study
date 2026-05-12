package com.xing.a_principle_7.a_07_composite_reuse;

/** （7）合成复用原则（Composite Reuse Principle）
 * 核心思路
 * 1. 合成复用：模块化装修——用组合柜（组合）代替整体浇筑的柜子（继承），想换风格随时拆装；
 * 2. 拒绝继承耦合：整体浇筑的柜子（继承）一旦建成，想改材质就得砸墙；
 * 3. 拥抱组合灵活：组合柜（组合）通过更换板材（对象），实现风格的自由切换。
 */

// ========== 1.基础材料：板材接口 ==========
// 这是装修的“原材料”，所有板材都要能展示颜色
interface Board {
    void showColor();
}

// ========== 2.具体材料：实木板 ==========
class WoodBoard implements Board {
    @Override
    public void showColor() {
        System.out.println("实木色（温暖自然）。");
    }
}

// ========== 3.具体材料：玻璃板 ==========
class GlassBoard implements Board {
    @Override
    public void showColor() {
        System.out.println("透明色（现代简约）。");
    }
}

// ========== 4.反面教材：整体浇筑的柜子（继承） ==========
// 这是一个典型的违反CRP的类，它继承了实木板的特性，被“焊死”了
class CastCabinet extends WoodBoard {
    public void assemble() {
        System.out.println("正在使用水泥整体浇筑柜子...");
        // 继承父类的颜色，无法改变
        super.showColor();
        System.out.println("柜子建成！但想换风格？对不起，得砸了重建！");
    }
}

// ========== 5.正面教材：模块化组合柜（组合） ==========
// 柜子不再继承任何板材，而是“拥有”一个板材
class ModularCabinet {
    // 组合：柜子由板材组成（Has-a 关系）
    private Board board;
    // 构造方法：安装板材
    public ModularCabinet(Board board) {
        this.board = board;
    }
    // 换板材：这是继承做不到的，组合可以随时更换
    public void changeStyle(Board newBoard) {
        System.out.println("正在拆除旧板材...");
        this.board = newBoard;
        System.out.println("风格切换成功！");
    }
    public void assemble() {
        System.out.println("正在组装模块化柜子...");
        // 委托：调用组合对象的业务方法
        board.showColor();
        System.out.println("柜子组装完成！");
    }
}

// ========== 6.客户端：装修工（调用者） ==========
public class A07_CabinetCRPDemo {
    public static void main(String[] args) {
        System.out.println("【7、合成复用原则（CRP）演示 - 模块化装修】");
        // ===== 第一部分：反面教材（违反CRP - 继承） =====
        System.out.println("❌ 违反CRP：整体浇筑（继承）");
        CastCabinet castCabinet = new CastCabinet();
        castCabinet.assemble();
        // 如果想换成玻璃风格？ 代码没法改，除非修改 CastCabinet 类的源码，这违反了开闭原则！

        // ===== 第二部分：正面教材（遵循CRP - 组合） =====
        System.out.println("\n✅ 遵循CRP：模块化组装（组合）");
        // 1.初始装修：安装实木风格
        ModularCabinet cabinet = new ModularCabinet(new WoodBoard());
        cabinet.assemble();
        // 2.风格变更：想换成现代简约风？
        System.out.println("业主需求变更：想要现代简约风（玻璃材质）");
        // 3.灵活切换：不需要砸柜子，只需要换板材
        cabinet.changeStyle(new GlassBoard());
        cabinet.assemble();

        // ===== 总结 =====
        System.out.println("\n📋 总结");
        System.out.println("违反CRP（继承）：柜子与实木板强绑定，想改风格得砸墙（修改代码）。");
        System.out.println("遵循CRP（组合）：柜子与板材松耦合，想改风格换板材（替换对象）。");
        System.out.println("合成复用原则：多用组合、少用继承，让代码像积木一样灵活！");
    }
}

/**
 * 合成复用原则（CRP）的核心一句话总结：
 * 优先使用组合或聚合（“拥有”关系）来复用代码，而不是继承（“是”关系），以保持系统的灵活性和低耦合。
 * 结合代码理解：
 * 就像装修代码一样，CastCabinet（继承）就像是整体浇筑的柜子，一旦建成，想换个材质就得把整个类“砸”了重写（修改代码）；
 * 而ModularCabinet（组合）就像是组装柜，通过持有Board对象，想换风格只需要调用changeStyle换个对象即可，
 * 柜子本身的代码一行都不用改。这就是用“搭积木”（组合）代替了“刻雕像”（继承），实现了真正的灵活复用。
 */