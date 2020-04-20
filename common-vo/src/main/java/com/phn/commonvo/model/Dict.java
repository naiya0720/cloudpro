package com.phn.commonvo.model;

import lombok.ToString;

@ToString
public class Dict {
    private String dictId;

    private String dictName;

    private String dictValue;

    private String dictType;

    private String dictRemark;

    public Dict(String dictId, String dictName, String dictValue, String dictType, String dictRemark) {
        this.dictId = dictId;
        this.dictName = dictName;
        this.dictValue = dictValue;
        this.dictType = dictType;
        this.dictRemark = dictRemark;
    }

    public Dict() {
        super();
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictRemark() {
        return dictRemark;
    }

    public void setDictRemark(String dictRemark) {
        this.dictRemark = dictRemark;
    }
}