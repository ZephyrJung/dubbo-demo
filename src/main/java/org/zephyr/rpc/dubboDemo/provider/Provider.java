package org.zephyr.rpc.dubboDemo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yu.zhang
 * @date 2019-10-14
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-dubbo-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
