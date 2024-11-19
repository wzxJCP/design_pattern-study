package com.xing.pattern_23.behavioral_11.visitor_10;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 8:57
 * @author：wzx
 */
// 电脑零件展示访客 实现 计算机部件访问者 接口
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        // 打印鼠标被组装的信息
        System.out.println("组装 鼠标   "+mouse);
    }

    @Override
    public void visit(Keyboard keyboard) {
        // 打印键盘被组装的信息
        System.out.println("组装 键盘   "+keyboard);
    }

    @Override
    public void visit(Monitor monitor) {
        // 打印显示器被组装的信息
        System.out.println("组装 显示器 "+monitor);
    }

    @Override
    public void visit(Computer computer) {
        // 打印电脑被组装的信息
        System.out.println("组装 电脑   "+computer);
    }

}
