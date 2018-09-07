package com.dyplayer.hip.rim.type.ets;

/**
 * 字典
 *
 * @author duyi
 */
public class Dict extends CD {

    private String dictType;

    private String dictName;

    private String dictRemark;

    private String dictVersion;

    private String relationDict;

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }
    
    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictRemark() {
        return dictRemark;
    }

    public void setDictRemark(String dictRemark) {
        this.dictRemark = dictRemark;
    }

    public String getDictVersion() {
        return dictVersion;
    }

    public void setDictVersion(String dictVersion) {
        this.dictVersion = dictVersion;
    }

    public String getRelationDict() {
        return relationDict;
    }

    public void setRelationDict(String relationDict) {
        this.relationDict = relationDict;
    }

}
