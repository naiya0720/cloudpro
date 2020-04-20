package com.phn.eurekaconsumer.controller;

import com.phn.eurekaconsumer.services.HelloFeignService;
import com.phn.eurekaconsumer.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-12 13:28:04
 */
@RestController
@RequestMapping("consumer-test")
public class TestController {

    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping(value = "/test",produces = "application/json;charset=utf-8")
    public Map<String,Object> test(String name){
        return helloFeignService.hello(name);
    }

}
