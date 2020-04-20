package com.phn.commonvo.vo;

import com.phn.commonvo.model.Dict;
import com.phn.commonvo.model.PageBean;
import lombok.Getter;
import lombok.Setter;

/**
 * @author PengHenan
 * @create  2020-03-13 19:05:29
 */
@Getter
@Setter
public class DictVo extends Dict {
    private PageBean pageBean;

}
