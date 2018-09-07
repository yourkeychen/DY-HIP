package com.dyplayer.hip.rim.type.ets;

/**
 * 字典项
 *
 * @author duyi
 */
public class DictElement extends CD {

    private String elementName;

    private String elementRemark;

    private String relationElementCode;

    private String inputPy;

    private String mnemonicCode;

    private Short isDefault;

    private String elementNo;

    private CD dict;

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getElementRemark() {
        return elementRemark;
    }

    public void setElementRemark(String elementRemark) {
        this.elementRemark = elementRemark;
    }

    public String getRelationElementCode() {
        return relationElementCode;
    }

    public void setRelationElementCode(String relationElementCode) {
        this.relationElementCode = relationElementCode;
    }

    public String getInputPy() {
        return inputPy;
    }

    public void setInputPy(String inputPy) {
        this.inputPy = inputPy;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public Short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Short isDefault) {
        this.isDefault = isDefault;
    }

    public String getElementNo() {
        return elementNo;
    }

    public void setElementNo(String elementNo) {
        this.elementNo = elementNo;
    }

    public CD getDict() {
        return dict;
    }

    public void setDict(CD dict) {
        this.dict = dict;
    }

}
