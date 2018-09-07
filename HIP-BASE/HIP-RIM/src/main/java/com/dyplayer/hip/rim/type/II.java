/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.type;

import com.dyplayer.hip.rim.type.ets.CD;

/**
 * 业务主键类型
 *
 * @author duyi
 */
public class II {

    private CD type;

    private String value;

    public CD getType() {
        return type;
    }

    public void setType(CD type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
