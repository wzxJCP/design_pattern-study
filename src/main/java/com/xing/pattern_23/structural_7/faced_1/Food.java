package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 9:59
 * @author：wzx
 */
/**
 * Food 类表示一种食物。
 * 它包含一个私有的字符串字段 `name`，用于存储食物的名称，
 * 并提供了获取和设置该字段的方法。
 */
public class Food {

    /**
     * 私有字段 `name`，用于存储食物的名称。
     * 私有字段可以防止外部直接访问和修改，确保数据的安全性。
     */
    private String name;

    /**
     * 获取食物的名称。
     * @return 返回食物的名称。
     */
    public String getName() {
        return name;
    }

    /**
     * 设置食物的名称。
     * @param name 要设置的食物名称。
     */
    public void setName(String name) {
        this.name = name;
    }
}
