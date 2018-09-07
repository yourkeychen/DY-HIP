package com.dyplayer.hip.rim.type.ets;

/**
 * 字典项
 *
 * @author duyi
 */
public class DictElement extends CD {

    private String elementName;

    private String elementRemark;

    private String relationElement;

    private String inputPy;

    private String mnemonicCode;

    private String isDefault;

    private String elementNo;

    private Long dictId;

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

    public String getRelationElement() {
        return relationElement;
    }

    public void setRelationElement(String relationElement) {
        this.relationElement = relationElement;
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

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    
    public String getElementNo() {
        return elementNo;
    }

    public void setElementNo(String elementNo) {
        this.elementNo = elementNo;
    }

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

}
