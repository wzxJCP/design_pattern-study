package com.xing.pattern_23.structural_7.flyweight_7;

/**
 * @project：design_pattern-study
 * @since：2024/11/15 9:04
 * @author：wzx
 */
public class Test {
    private static final String departments[] = {"市场部","营销部","广告部","业务服务部"};

    public static void main(String[] args) {
        for (String department : departments) {
            Employee manager = ManagementFactory.getManager(department);
            manager.report();
        }
    }
}
/**
 * 创建部门经理:市场部
 * 市场部部门来此汇报工作,内容是...
 * 创建部门经理:营销部
 * 营销部部门来此汇报工作,内容是...
 * 创建部门经理:广告部
 * 广告部部门来此汇报工作,内容是...
 * 创建部门经理:业务服务部
 * 业务服务部部门来此汇报工作,内容是...
 */