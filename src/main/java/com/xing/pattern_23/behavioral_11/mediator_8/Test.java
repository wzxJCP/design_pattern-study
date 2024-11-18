package com.xing.pattern_23.behavioral_11.mediator_8;

/**
 * @project：design_pattern-study
 * @since：2024/11/19 2:07
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 创建用户 Tom
        User tom = new User("tom");
        // 创建用户 Jack
        User jack = new User("jack");

        // Tom 向 Jack 发送消息，请求帮忙订外卖
        tom.sendMessage("jack 帮我定一个外卖...");
        // Jack 回复 Tom，确认会帮忙订外卖
        jack.sendMessage("收到~好的,一会儿就订好...");
    }
}

/**
 * 姓名：tom  任务：jack 帮我定一个外卖...
 * 姓名：jack  任务：收到~好的,一会儿就订好...
 */
/**
 * 2.3.8 中介者模式（Mediator Pattern）
 */
