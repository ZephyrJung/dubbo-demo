package org.zephyr.rpc.dubboDemo.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;
import org.zephyr.rpc.dubboDemo.service.model.Wheel;

/**
 * @author yu.zhang
 * @date 2019-10-16
 */
@SPI
public interface WheelMaker {
    Wheel makeWheel(URL url);
}
