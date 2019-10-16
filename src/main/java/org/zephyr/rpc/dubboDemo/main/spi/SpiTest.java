package org.zephyr.rpc.dubboDemo.main.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.zephyr.rpc.dubboDemo.service.DemoService;

/**
 * @author yu.zhang
 * @date 2019-10-14
 */
public class SpiTest {
    public static void main(String[] args) {
        ExtensionLoader<DemoService> extensionLoader = ExtensionLoader.getExtensionLoader(DemoService.class);
        DemoService demo1 = extensionLoader.getExtension("demo1");
        System.out.println(demo1.sayHello("Zephyr"));
        DemoService demo2 = extensionLoader.getExtension("demo2");
        System.out.println(demo2.sayHello("Zephyr"));
    }
}
