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

    private String version;

    private String relationDictCode;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRelationDictCode() {
        return relationDictCode;
    }

    public void setRelationDictCode(String relationDictCode) {
        this.relationDictCode = relationDictCode;
    }

}
