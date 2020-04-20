package com.phn.eurekaconsumer.services;

/**
 * @author PengHenan
 * @create  2020-03-14 21:44:31
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Service
@FeignClient(value = "eureka-provider")
public interface TestService {
    @RequestMapping(value = "/hello/{name}")
    Map<String,Object> hellos(@PathVariable("name") String name);
}
