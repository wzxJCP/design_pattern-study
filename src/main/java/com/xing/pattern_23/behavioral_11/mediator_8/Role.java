package com.xing.pattern_23.behavioral_11.mediator_8;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:03
 * @author：wzx
 */
// 角色
public class Role {
    /**
     * 角色工作方法
     * @param user 执行任务的用户
     * @param msg 任务内容
     */
    public static void work(User user, String msg) {
        System.out.println("姓名：" + user.getName() + "  任务：" + msg);
    }
}
