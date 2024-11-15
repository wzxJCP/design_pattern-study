package com.xing.pattern_23.structural_7.flyweight_7;

import java.util.HashMap;
import java.util.Map;

/**
 * @project：design_pattern-study
 * @since：2024/11/15 8:54
 * @author：wzx
 */
public class ManagementFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();
    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理:"+department);
            String noteContent = department+"部门来此汇报工作,内容是...";
            manager.setNoteContent(noteContent);
            // System.out.println(department+"部门,汇报工作完成...");
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }
}
