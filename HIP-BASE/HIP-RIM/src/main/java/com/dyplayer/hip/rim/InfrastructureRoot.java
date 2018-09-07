/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim;

import java.util.Date;

/**
 * 所有RIM实体的父
 *
 * @author duyi
 */
public class InfrastructureRoot {

    /**
     * 数据id
     */
    private Long id;
    /**
     * 写入时间
     */
    private Date writeTime;
    /**
     * 最后修改时间
     */
    private Date lastUpdate;
    /**
     * 是否有效
     */
    private Boolean valid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

}