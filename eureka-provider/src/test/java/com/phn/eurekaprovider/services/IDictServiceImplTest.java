package com.phn.eurekaprovider.services;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.model.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @author PengHenan
 * @create  2020-03-13 20:26:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IDictServiceImplTest {

    private Dict dict = null;

    @Autowired
    private IDictService dictService;


    @Before
    public void setUp() throws Exception {
        dict = new Dict();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        String dictId = UUID.randomUUID().toString().replace("-","");
        dict.setDictId(dictId);
        dict.setDictName("中国联通");
        dict.setDictValue("06");
        dict.setDictType("COMPANY");
        dict.setDictRemark("运行商");
        dictService.insert(dict);
    }

    @Test
    public void updateByPrimaryKey() {
        dict.setDictId("2864762eba9542dc921daceec903846a");
        dict.setDictName("C++");
        dict.setDictValue("01");
        dict.setDictType("BOOKTYPE");
        dict.setDictRemark("书本类型");
        dictService.updateByPrimaryKey(dict);
    }

    @Test
    public void queryDictPager() {
        PageBean pageBean = new PageBean();
        pageBean.setPage(1);
        pageBean.setRows(4);
        List<Dict> dicts = dictService.queryDictPager(dict, pageBean);
        dicts.forEach(x-> System.out.println(x));

    }
}