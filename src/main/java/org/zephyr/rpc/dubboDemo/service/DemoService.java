package org.zephyr.rpc.dubboDemo.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author yu.zhang
 * @date 2019-10-14
 */
@SPI
public interface DemoService {
    String sayHello(String name);
}
