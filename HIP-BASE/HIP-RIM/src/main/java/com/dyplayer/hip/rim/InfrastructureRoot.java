/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim;

import java.util.Date;
import java.util.Objects;

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
     * 业务ID（身份证号、员工号、申请单号、出库单号...）
     */
    private String bId;
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
    private String valid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
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

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * 数据库比较是否相同（有相同的ID）
     *
     * @param obj
     * @return
     */
    public boolean dbEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InfrastructureRoot other = (InfrastructureRoot) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * 业务比较是否相同（有相同的业务ID）
     *
     * @param obj
     * @return
     */
    public boolean businessEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InfrastructureRoot other = (InfrastructureRoot) obj;
        return Objects.equals(this.bId, other.bId);
    }

}
