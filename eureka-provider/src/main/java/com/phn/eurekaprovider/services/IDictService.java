package com.phn.eurekaprovider.services;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.model.PageBean;

import java.util.List;

public interface IDictService {


    /**
     *   删除字典数据
     * @param dictId
     * @return
     */
    int deleteByPrimaryKey(String dictId);

    /**
     * 新增字典数据
     * @param record
     * @return
     */
    int insert(Dict record);

    /**
     *  修改数据字典
     * @param record
     * @return
     */
    int updateByPrimaryKey(Dict record);

    /**
     *  分页查询数据字典
     * @param dict
     * @return
     */
    List<Dict> queryDictPager(Dict dict, PageBean pageBean);

}