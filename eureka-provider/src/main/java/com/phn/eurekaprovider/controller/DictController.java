package com.phn.eurekaprovider.controller;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.model.PageBean;
import com.phn.commonvo.vo.DictVo;
import com.phn.eurekaprovider.services.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author PengHenan
 * @create  2020-03-13 21:32:57
 */
@RestController
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private IDictService dictService;


    @RequestMapping(value = "/addDict",produces = "application/json;charset=utf-8")
    public Map<String,Object> addDict(@RequestBody Dict dict){
        try {
            dictService.insert(dict);
            return initInfo(true,"新增成功",1);
        } catch (Exception e) {
            e.printStackTrace();
            return initInfo(false,e.getMessage(),-1);
        }
    }

    @RequestMapping(value = "/editDict",produces = "application/json;charset=utf-8")
    public Map<String,Object> editDict(@RequestBody Dict dict){
        try {
            dictService.updateByPrimaryKey(dict);
            return initInfo(true,"修改成功",1);
        } catch (Exception e) {
            e.printStackTrace();
            return initInfo(false,e.getMessage(),-1);
        }
    }


    @RequestMapping(value = "/delDict",produces = "application/json;charset=utf-8")
    public Map<String,Object> delDict(@RequestParam("dictId") String dictId){
        try {
            dictService.deleteByPrimaryKey(dictId);
            return initInfo(true,"删除成功",1);
        } catch (Exception e) {
            e.printStackTrace();
            return initInfo(false,e.getMessage(),-1);
        }
    }

    @RequestMapping(value = "/queryPager",produces = "application/json;charset=utf-8")
    public Map<String,Object> queryPager(@RequestBody DictVo dictVo){
        PageBean pageBean = dictVo.getPageBean();
        Map<String,Object> json = new HashMap<>();
        try {
            List<Dict> dicts = dictService.queryDictPager(dictVo, pageBean);
            json.put("success",true);
            json.put("code",1);
            json.put("data",dicts);
            json.put("total",pageBean.getTotal());
            return json;
        } catch (Exception e) {
            e.printStackTrace();
            json.put("success",false);
            json.put("code",-1);
            json.put("data",null);
            json.put("total",pageBean.getTotal());
            json.put("msg",e.getMessage());
            return json;
        }
    }


    private Map<String,Object> initInfo(Boolean success,String msg,Integer code){
        Map<String,Object> info = new HashMap<>();
        info.put("success",success);
        info.put("msg",msg);
        info.put("code",code);
        return info;
    }





}
