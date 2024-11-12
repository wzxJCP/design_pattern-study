package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 10:26
 * @author：wzx
 */
/**
 * TakeService 类表示外卖制作服务。
 * 它包含一个方法 `taking`，用于表示外卖正在制作中的状态。
 */
public class TakeService {
    /**
     * 表示外卖正在制作中的方法。
     * 此方法会打印一条消息，表示外卖正在制作中。
     */
    public void taking() {
        System.out.println("外卖正在制作中......");
    }
}