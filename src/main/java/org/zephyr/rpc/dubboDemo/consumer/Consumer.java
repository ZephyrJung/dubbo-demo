package org.zephyr.rpc.dubboDemo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zephyr.rpc.dubboDemo.service.DemoService;

/**
 * @author yu.zhang
 * @date 2019-10-14
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-dubbo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("zephyr"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}