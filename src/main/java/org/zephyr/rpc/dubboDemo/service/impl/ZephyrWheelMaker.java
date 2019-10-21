package org.zephyr.rpc.dubboDemo.service.impl;

import org.apache.dubbo.common.URL;
import org.zephyr.rpc.dubboDemo.service.WheelMaker;
import org.zephyr.rpc.dubboDemo.service.model.Wheel;

/**
 * @author yu.zhang
 * @date 2019-10-16
 */
public class ZephyrWheelMaker implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        return new Wheel("Zephyr", 18);
    }

    @Override
    public String getWheelName(URL url) {
        return "Zephyr";
    }
}
