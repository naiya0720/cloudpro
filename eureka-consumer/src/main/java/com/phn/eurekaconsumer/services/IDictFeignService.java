package com.phn.eurekaconsumer.services;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.vo.DictVo;
import com.phn.eurekaconsumer.services.impl.DictFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-13 21:53:17
 */
@Service
@FeignClient(value = "eureka-provider",fallback = DictFeignServiceImpl.class)
public interface IDictFeignService {

    @RequestMapping(value = "/dict/addDict",produces = "application/json;charset=utf-8")
    Map<String,Object> addDict(Dict dict);

    @RequestMapping(value = "/dict/editDict",produces = "application/json;charset=utf-8")
    Map<String,Object> editDict(Dict dict);

    @RequestMapping(value = "/dict/delDict",produces = "application/json;charset=utf-8")
    Map<String,Object> delDict(@RequestParam("dictId") String dictId);

    @RequestMapping(value = "/dict/queryPager",produces = "application/json;charset=utf-8")
    Map<String,Object> queryPager(DictVo dictVo);


}
