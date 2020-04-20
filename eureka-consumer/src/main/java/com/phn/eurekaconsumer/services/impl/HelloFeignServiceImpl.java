package com.phn.eurekaconsumer.services.impl;

import com.phn.eurekaconsumer.services.HelloFeignService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-12 13:39:03
 */
@Component
public class HelloFeignServiceImpl implements HelloFeignService {
    @Override
    public Map<String, Object> hello(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg","你好"+name+"系统繁忙");
        return map;
    }
}
