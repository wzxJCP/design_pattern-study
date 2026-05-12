package com.xing.a_principle_7.a_03_dependency_inversion;

/** （3）依赖倒置原则（Dependence Inversion Principle）
 * 核心思路
 * 1. 依赖倒置：高层模块（房子）不依赖低层模块（具体品牌），两者都依赖抽象（标准接口）；
 * 2. 标准接口：就像门窗、水管都有统一标准尺寸，任何品牌只要符合标准就能即插即用；
 * 3. 方便替换：想换门、换窗、换水管，只需换一个实现类，房子本身不用改。
 * 依赖方向（无DIP）：房子（高层） → 品牌A的门（低层）
 * 依赖方向（有DIP）：房子（高层） → Door接口（抽象） ←品牌A的门（低层）、←品牌B的门（低层）
 * 区别：没有DIP：高层 → 低层 | 有DIP：房子（高层） → Door/Window/Pipe（抽象接口） ←品牌A的Door/Window/Pipe、←品牌B的Door/Window/Pipe
 */

// ========== 1.抽象接口：标准规范 ==========
// 门的标准接口——任何门都必须能打开和关闭
interface Door {
    void open();
    void close();
}
// 窗的标准接口——任何窗都必须能打开和关闭
interface Window {
    void open();
    void close();
}
// 水管的标准接口——任何水管都必须能通水
interface Pipe {
    void flowWater();
}

// ========== 2.具体实现：符合标准的品牌产品 ==========
// 品牌A的门——符合标准接口
class BrandADoor implements Door {
    @Override
    public void open() {
        System.out.println("品牌A的门已打开（静音设计）");
    }
    @Override
    public void close() {
        System.out.println("品牌A的门已关闭（自动上锁）");
    }
}
// 品牌B的门——也符合标准接口
class BrandBDoor implements Door {
    @Override
    public void open() {
        System.out.println("品牌B的门已打开（按指纹）");
    }
    @Override
    public void close() {
        System.out.println("品牌B的门已关闭（防夹手）");
    }
}
// 品牌A的窗——符合标准接口
class BrandAWindow implements Window {
    @Override
    public void open() {
        System.out.println("品牌A的窗已打开（上悬式）");
    }
    @Override
    public void close() {
        System.out.println("品牌A的窗已关闭（密封条）");
    }
}
// 品牌B的窗——也符合标准接口
class BrandBWindow implements Window {
    @Override
    public void open() {
        System.out.println("品牌B的窗已打开（平开式）");
    }
    @Override
    public void close() {
        System.out.println("品牌B的窗已关闭（防盗锁）");
    }
}
// 品牌A的水管——符合标准接口
class BrandAPipe implements Pipe {
    @Override
    public void flowWater() {
        System.out.println("品牌A的水管通水（PPR材质）");
    }
}
// 品牌B的水管——也符合标准接口
class BrandBPipe implements Pipe {
    @Override
    public void flowWater() {
        System.out.println("品牌B的水管通水（不锈钢材质）");
    }
}

// ========== 3. 高层模块：房子 ==========
// 房子不依赖具体品牌，只依赖抽象接口
// 任何符合标准的门窗水管都能装进来
class House {
    // 地址、业主
    private String address;
    private String owner;
    public House(String address, String owner) {
        this.address = address;
        this.owner = owner;
    }
    // 安装门——依赖抽象 Door 接口
    public void installDoor(Door door) {
        System.out.print("[" + address + "] ");
        door.open();
        System.out.print("[" + address + "] ");
        door.close();
    }
    // 安装窗——依赖抽象 Window 接口
    public void installWindow(Window window) {
        System.out.print("[" + address + "] ");
        window.open();
        System.out.print("[" + address + "] ");
        window.close();
    }
    // 安装水管——依赖抽象 Pipe 接口
    public void installPipe(Pipe pipe) {
        System.out.print("[" + address + "] ");
        pipe.flowWater();
    }
    public void showInfo() {
        System.out.println("房屋信息：");
        System.out.println("地址：" + address);
        System.out.println("业主：" + owner);
    }
}

// ========== 4. 客户端演示 ==========
public class A03_HouseDIPDemo {
    public static void main(String[] args) {
        System.out.println("【3、依赖倒置原则（DIP）演示 - 标准接口规范】");
        // ===== 第一部分：第一次装修（品牌A） =====
        System.out.println("第一次装修：选择品牌A");
        House house = new House("昆明-五华-翠湖", "李四");
        house.showInfo();
        System.out.println("1.安装门（品牌A）");
        house.installDoor(new BrandADoor());
        System.out.println("2.安装窗（品牌A）");
        house.installWindow(new BrandAWindow());
        System.out.println("3.安装水管（品牌A）");
        house.installPipe(new BrandAPipe());

        // ===== 第二部分：换品牌（品牌B） =====
        System.out.println("\n换品牌：选择品牌B");
        System.out.println("（房子代码一行不改，只需传入不同的实现类）");
        System.out.println("1. 换门（品牌B）");
        house.installDoor(new BrandBDoor());
        System.out.println("2. 换窗（品牌B）");
        house.installWindow(new BrandBWindow());
        System.out.println("3. 换水管（品牌B）");
        house.installPipe(new BrandBPipe());

        // ===== 第三部分：混搭 =====
        System.out.println("\n混搭风格");
        System.out.println("（门用品牌A，窗用品牌B，水管用品牌A）");
        house.installDoor(new BrandADoor());
        house.installWindow(new BrandBWindow());
        house.installPipe(new BrandAPipe());

        // ===== 总结 =====
        System.out.println("\n总结");
        System.out.println("✅ 房子（高层模块）依赖的是 Door/Window/Pipe 接口（抽象）");
        System.out.println("✅ 品牌A、品牌B（低层模块）也依赖这些接口（抽象）");
        System.out.println("✅ 换品牌时，房子代码一行都不需要修改");
        System.out.println("✅ 这就是依赖倒置原则——所有组件都依赖标准接口规范！");
    }
}

/**
 * 依赖倒置原则（DIP）的核心一句话总结：
 * 高层模块不应依赖低层模块，二者都应依赖抽象；抽象不应依赖细节，细节应依赖抽象。
 * 结合代码理解：
 * 就像房子装修代码一样，House（高层模块）不直接依赖 BrandADoor（低层模块），
 * 而是依赖 Door 接口（抽象）；而 BrandADoor 和 BrandBDoor（细节）也都去实现这个 Door 接口。
 * 这样一来，当你想换品牌时，不需要修改 House 的代码，只需要传入不同的实现类即可。
 * 这就是面向接口编程，实现了控制权的倒置和模块间的解耦。
 */