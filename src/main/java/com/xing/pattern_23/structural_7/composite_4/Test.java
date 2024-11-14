package com.xing.pattern_23.structural_7.composite_4;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 9:24
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建CEO对象，指定其姓名、部门编号和薪资
        Employee ceo = new Employee("张三", "1", 20000L);

        // 创建部门经理对象，指定其姓名、部门编号和薪资
        Employee management = new Employee("李四", "2", 10000L);

        // 创建两个销售员对象，指定其姓名、部门编号和薪资
        Employee saller1 = new Employee("王五", "3", 5000L);
        Employee saller2 = new Employee("田七", "3", 5000L);
        // 创建仓库管理员对象，指定其姓名、部门编号和薪资
        Employee store = new Employee("赵六", "4", 3000L);

        // 建立组织结构，CEO管理部门经理
        ceo.addEmployee(management);

        // 部门经理管理两个销售员和一个仓库管理员
        management.addEmployee(saller1);
        management.addEmployee(saller2);
        management.addEmployee(store);

        // 打印CEO的信息
        System.out.println(ceo);

        // 遍历CEO管理的所有员工，并打印每个员工的信息
        for (Employee employee : ceo.getEmployeeList()) {
            System.out.println("部门编号: " + employee.getDept() + " 姓名: " + employee.getName() + " 薪资: " + employee.getSalary());

            // 如果当前员工也有管理其他员工，则遍历并打印这些员工的信息
            for (Employee e : employee.getEmployeeList()) {
                System.out.println("部门编号1: " + e.getDept() + " 姓名: " + e.getName() + " 薪资: " + e.getSalary());
            }
        }
    }
}
/**
 * 姓名='张三', 部门编号='1', 薪资=20000
 * 部门编号: 2 姓名: 李四 薪资: 10000
 * 部门编号: 3 姓名: 王五 薪资: 5000
 * 部门编号: 3 姓名: 田七 薪资: 5000
 * 部门编号: 4 姓名: 赵六 薪资: 3000
 */
/**
 * 代码说明：
 * 创建员工对象：
 * 使用 Employee 类创建了 CEO、部门经理、销售员和仓库管理员的对象，每个对象都指定了姓名、部门编号和薪资。
 * 建立组织结构：
 * 使用 addEmployee 方法建立了员工之间的层级关系。CEO 管理部门经理，而部门经理又管理销售员和仓库管理员。
 * 打印信息：
 * 首先打印 CEO 的基本信息。
 * 然后遍历 CEO 管理的所有员工，并打印每个员工的信息。
 * 如果某个员工（例如部门经理）也管理其他员工，会继续遍历并打印这些员工的信息。
 * 通过这种方式，你可以清晰地看到组织结构中的层级关系以及每个员工的详细信息。
 */