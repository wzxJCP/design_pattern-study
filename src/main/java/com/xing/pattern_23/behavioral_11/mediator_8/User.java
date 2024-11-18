package com.xing.pattern_23.behavioral_11.mediator_8;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:03
 * @author：wzx
 */
// 用户类
public class User {
    // 用户姓名
    private String name;

    /**
     * 获取用户姓名
     * @return 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 构造器，初始化用户姓名
     * @param name 用户姓名
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * 发送消息方法，调用角色的工作方法
     * @param message 消息内容
     */
    public void sendMessage(String message) {
        Role.work(this, message);
    }
}

