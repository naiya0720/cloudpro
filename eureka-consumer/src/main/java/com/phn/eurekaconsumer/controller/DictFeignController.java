package com.phn.eurekaconsumer.controller;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.vo.DictVo;
import com.phn.eurekaconsumer.services.IDictFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-13 22:01:52
 */
@RestController
@RequestMapping("/consumer-dict")
@CrossOrigin(origins = "*" ,maxAge = 3600)
public class DictFeignController {

    @Autowired
    private IDictFeignService dictFeignService;

    @RequestMapping(value = "/addDict", produces = "application/json;charset=utf-8")
    public Map<String,Object> addDict(Dict dict){
        return dictFeignService.addDict(dict);
    }

    @RequestMapping(value = "/delDict", produces = "application/json;charset=utf-8")
    public Map<String,Object> delDict(String dictId){
        return dictFeignService.delDict(dictId);
    }

    @RequestMapping(value = "/editDict", produces = "application/json;charset=utf-8")
    public Map<String,Object> editDict(Dict dict){
        return dictFeignService.editDict(dict);
    }


    @RequestMapping(value = "/queryPager", produces = "application/json;charset=utf-8")
    public Map<String,Object> queryPager(DictVo dictVo){
        return dictFeignService.queryPager(dictVo);
    }


}
