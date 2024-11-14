package com.xing.pattern_23.structural_7.proxy_5.dynamicproxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:04
 * @author：wzx
 */
public class Order {

    private String info;
    private String userId;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "info='" + info + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
