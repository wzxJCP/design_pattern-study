package com.xing.pattern_23.structural_7.proxy_5.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @project：design_pattern-study
 * @since：2024/11/14 11:15
 * @author：wzx
 */
public class OrderServiceImplStaticProxy implements InvocationHandler {
    // 被代理的对象
    private Object service;

    // 构造方法，传入被代理的对象
    public OrderServiceImplStaticProxy(Object service) {
        this.service = service;
    }

    // 创建并返回一个代理对象
    public Object bind() {
        /**
         * 使用 Proxy 类的 newProxyInstance 方法创建代理对象;
         * 参数1：类加载器，使用被代理对象的类加载器;
         * 参数2：接口数组，使用被代理对象实现的接口;
         * 参数3：InvocationHandler，即当前对象，处理代理对象上的方法调用。
         */
        return Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                this);
    }

    // 开启事务的业务逻辑。
    public void before() {
        System.out.println("代理对象...开启事务...");
    }
    // 提交事务的业务逻辑。
    public void after() {
        System.out.println("代理对象...提交事务...");
    }

    // 处理代理对象上的方法调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在方法调用前执行的逻辑，例如开启事务
        before();
        // 调用被代理对象的实际方法
        Object result = method.invoke(service, args);
        // 在方法调用后执行的逻辑，例如提交事务
        after();
        // 返回方法调用的结果
        return result;
    }
}



