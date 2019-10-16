package org.zephyr.rpc.dubboDemo.service.impl;

import org.zephyr.rpc.dubboDemo.service.DemoService;

/**
 * @author yu.zhang
 * @date 2019-10-14
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
