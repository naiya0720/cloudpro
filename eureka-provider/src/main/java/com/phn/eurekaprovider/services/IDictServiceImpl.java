package com.phn.eurekaprovider.services;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.model.PageBean;
import com.phn.eurekaprovider.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author PengHenan
 * @create  2020-03-13 20:24:13
 */
@Service
public class IDictServiceImpl implements IDictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public int deleteByPrimaryKey(String dictId) {
        return dictMapper.deleteByPrimaryKey(dictId);
    }

    @Override
    public int insert(Dict record) {
        return dictMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Dict record) {
        return dictMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Dict> queryDictPager(Dict dict, PageBean pageBean) {
        return dictMapper.queryDictPager(dict);
    }
}
