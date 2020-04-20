package com.phn.eurekaconsumer.services.impl;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.vo.DictVo;
import com.phn.eurekaconsumer.services.IDictFeignService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-13 21:57:20
 */
@Component
public class DictFeignServiceImpl implements IDictFeignService {
    @Override
    public Map<String, Object> addDict(Dict dict) {
        return initInfo();
    }

    @Override
    public Map<String, Object> editDict(Dict dict) {
        return initInfo();
    }

    @Override
    public Map<String, Object> delDict(String dictId) {
        return initInfo();
    }

    @Override
    public Map<String, Object> queryPager(DictVo dictVo) {
        return initInfo();
    }

    private Map<String,Object> initInfo(){
        Map<String,Object> info = new HashMap<>();
        info.put("success",false);
        info.put("msg","服务器正在跟妖怪战斗，请去联系后援，亲~~~ ^_^ ");
        info.put("code",-1);
        return info;
    }
}
