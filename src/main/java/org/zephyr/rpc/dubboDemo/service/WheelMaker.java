package org.zephyr.rpc.dubboDemo.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;
import org.zephyr.rpc.dubboDemo.service.model.Wheel;

/**
 * @author yu.zhang
 * @date 2019-10-16
 */
@SPI
public interface WheelMaker {
    @Adaptive("wheel.maker")
    Wheel makeWheel(URL url);

    @Adaptive("wheel.name")
    String getWheelName(URL url);
}
