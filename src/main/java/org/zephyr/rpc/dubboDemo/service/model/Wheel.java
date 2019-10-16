package org.zephyr.rpc.dubboDemo.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yu.zhang
 * @date 2019-10-16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wheel {
    private String name;
    private int inch;
}
