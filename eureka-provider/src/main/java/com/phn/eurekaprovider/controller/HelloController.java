package com.phn.eurekaprovider.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-11 18:22:26
 */

@RestController
public class HelloController {


    @RequestMapping(value = "/hello/{name}",produces = "application/json;charset=utf-8")
    public Map<String,Object> hello(@PathVariable("name") String name){
        Map<String,Object> json = new HashMap<>();
        json.put("data",name);
        json.put("msg","hello "+name+" Welcome to using SpringCloud Framework");
        return json;
    }



}
