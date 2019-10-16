package org.zephyr.rpc.dubboDemo.main.spi;

import org.apache.dubbo.common.URL;
import org.zephyr.rpc.dubboDemo.service.WheelMaker;
import org.zephyr.rpc.dubboDemo.service.impl.AdaptiveWheelMaker;
import org.zephyr.rpc.dubboDemo.service.model.Wheel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yu.zhang
 * @date 2019-10-16
 */
public class AdaptiveSpiTest {
    public static void main(String[] args) {
        WheelMaker wheelMaker = new AdaptiveWheelMaker();
        Map<String, String> map = new HashMap<>();
        map.put("wheel.maker", "MichelinWheelMaker");
        Wheel wheel = wheelMaker.makeWheel(new URL("dubbo", "192.168.0.101", 20880, "XxxService", map));
        System.out.println(wheel);
        map.put("wheel.maker", "ZephyrWheelMaker");
        wheel = wheelMaker.makeWheel(new URL("dubbo", "192.168.0.101", 20880, "XxxService", map));
        System.out.println(wheel);
    }
}
