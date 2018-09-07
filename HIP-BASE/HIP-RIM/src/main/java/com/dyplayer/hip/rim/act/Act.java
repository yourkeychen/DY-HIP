/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.act;

import com.dyplayer.hip.rim.type.II;
import java.util.Date;
import java.util.List;

/**
 *
 * @author duyi
 */
public class Act {

    /**
     * 业务ID（身份证号、员工号、申请单号、出库单号...）
     */
    private List<II> bId;
    /**
     * 业务编码
     */
    private String code;
    /**
     * 是否是逆操作（退费、退药）
     */
    private Boolean actionNegationind;
    /**
     * 是否可逆
     */
    private Boolean negationind;
    /**
     * 来源说明
     */
    private String derivationExpr;
    /**
     * 标题
     */
    private String title;
    /**
     * 文本内容
     */
    private String text;
    /**
     * 业务数据状态
     */
    private String statusCode;
    /**
     * 有效开始时间
     */
    private Date effectiveTimeLow;
    /**
     * 有效结束时间
     */
    private Date effectiveTimeHigh;
    /**
     * 活动开始时间
     */
    private Date activityTimeLow;
    /**
     * 活动结束时间
     */
    private Date activityTimeHigh;
    /**
     * 预计执行时间
     */
    private Date availabilityTime;
    /**
     * 优先级别
     */
    private String priorityCode;
    /**
     * 保密级别
     */
    private String confidentialityCode;
    /**
     * 重复次数（住院次数）
     */
    private Integer repeatNumber;
    /**
     * 是否中断
     */
    private Boolean interruptiblelnd;
    /**
     * 级别编码
     */
    private String levelCode;
    /**
     * 是否独立
     */
    private Boolean independentlnd;
    /**
     * 不确定码
     */
    private String uncertaintyCode;
    /**
     * 原因编码
     */
    private String reasonCode;

    public List<II> getbId() {
        return bId;
    }

    public void setbId(List<II> bId) {
        this.bId = bId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getActionNegationind() {
        return actionNegationind;
    }

    public void setActionNegationind(Boolean actionNegationind) {
        this.actionNegationind = actionNegationind;
    }

    public Boolean getNegationind() {
        return negationind;
    }

    public void setNegationind(Boolean negationind) {
        this.negationind = negationind;
    }

    public String getDerivationExpr() {
        return derivationExpr;
    }

    public void setDerivationExpr(String derivationExpr) {
        this.derivationExpr = derivationExpr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Date getEffectiveTimeLow() {
        return effectiveTimeLow;
    }

    public void setEffectiveTimeLow(Date effectiveTimeLow) {
        this.effectiveTimeLow = effectiveTimeLow;
    }

    public Date getEffectiveTimeHigh() {
        return effectiveTimeHigh;
    }

    public void setEffectiveTimeHigh(Date effectiveTimeHigh) {
        this.effectiveTimeHigh = effectiveTimeHigh;
    }

    public Date getActivityTimeLow() {
        return activityTimeLow;
    }

    public void setActivityTimeLow(Date activityTimeLow) {
        this.activityTimeLow = activityTimeLow;
    }

    public Date getActivityTimeHigh() {
        return activityTimeHigh;
    }

    public void setActivityTimeHigh(Date activityTimeHigh) {
        this.activityTimeHigh = activityTimeHigh;
    }

    public Date getAvailabilityTime() {
        return availabilityTime;
    }

    public void setAvailabilityTime(Date availabilityTime) {
        this.availabilityTime = availabilityTime;
    }

    public String getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public String getConfidentialityCode() {
        return confidentialityCode;
    }

    public void setConfidentialityCode(String confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

    public Integer getRepeatNumber() {
        return repeatNumber;
    }

    public void setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public Boolean getInterruptiblelnd() {
        return interruptiblelnd;
    }

    public void setInterruptiblelnd(Boolean interruptiblelnd) {
        this.interruptiblelnd = interruptiblelnd;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public Boolean getIndependentlnd() {
        return independentlnd;
    }

    public void setIndependentlnd(Boolean independentlnd) {
        this.independentlnd = independentlnd;
    }

    public String getUncertaintyCode() {
        return uncertaintyCode;
    }

    public void setUncertaintyCode(String uncertaintyCode) {
        this.uncertaintyCode = uncertaintyCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    
}
