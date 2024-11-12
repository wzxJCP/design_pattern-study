package com.xing.pattern_23.structural_7.faced_1;

/**
 * @project：design_pattern-study
 * @since：2024/11/12 10:29
 * @author：wzx
 */
/**
 * PayService 类表示支付服务。
 * 它包含两个方法：`checkBalance` 用于检查余额，`pay` 用于执行支付操作。
 */
public class PayService {

    /**
     * 检查余额的方法。
     * 此方法会打印一条消息，表示正在检查余额的过程，并返回一个布尔值表示检查结果。
     * @return 如果余额充足，返回 true；否则返回 false。
     */
    public boolean checkBalance() {
        System.out.println("正在检查余额......");
        // 假设余额总是充足，实际应用中应根据实际情况返回
        return true;
    }

    /**
     * 执行支付的方法。
     * 此方法会打印一条消息，表示正在执行支付的过程。
     */
    public void pay() {
        System.out.println("正在支付......");
    }
}