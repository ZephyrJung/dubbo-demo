package org.zephyr.rpc.dubboDemo.service.impl;

import org.apache.dubbo.common.URL;
import org.zephyr.rpc.dubboDemo.service.WheelMaker;
import org.zephyr.rpc.dubboDemo.service.model.Wheel;

/**
 * @author yu.zhang
 * @date 2019-10-16
 */
public class MichelinWheelMaker implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        return new Wheel("Michelin", 19);
    }

    @Override
    public Wheel makeWheel() {
        return null;
    }
}
