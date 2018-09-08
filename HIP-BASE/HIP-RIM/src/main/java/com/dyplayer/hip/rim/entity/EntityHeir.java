/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.entity;

import com.dyplayer.hip.rim.InfrastructureRoot;

/**
 *
 * @author duyi
 */
public class EntityHeir extends InfrastructureRoot {

    /**
     * 数据类型
     */
    private String classCode;
    /**
     * 机构（管理组织不同）
     */
    private String institutionCode;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

}
