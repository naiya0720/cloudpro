package com.phn.eurekaconsumer.services;

import com.phn.eurekaconsumer.services.impl.HelloFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-12 13:26:27
 */
@Service
@FeignClient(value = "eureka-provider",fallback = HelloFeignServiceImpl.class)
public interface HelloFeignService {

    @RequestMapping(value = "/hello/{name}")
    Map<String,Object> hello(@PathVariable("name") String name);


}
