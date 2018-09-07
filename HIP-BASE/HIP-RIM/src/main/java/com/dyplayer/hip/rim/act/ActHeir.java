/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.act;

import com.dyplayer.hip.rim.InfrastructureRoot;

/**
 * 所有行为父类
 *
 * @author duyi
 */
public class ActHeir extends InfrastructureRoot {

    /**
     * 数据类型
     */
    private String classCode;
    /**
     * 模型类型
     */
    private String moodCode;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getMoodCode() {
        return moodCode;
    }

    public void setMoodCode(String moodCode) {
        this.moodCode = moodCode;
    }

}
