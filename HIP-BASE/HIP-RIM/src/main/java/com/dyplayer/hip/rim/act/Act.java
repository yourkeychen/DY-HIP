/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.act;

import java.util.Date;

/**
 *
 * @author duyi
 */
public class Act extends ActHeir {

    /**
     * 是否是逆操作（退费、退药）
     */
    private String actionNegationlnd;
    /**
     * 是否可逆
     */
    private String negationlnd;
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
    private Long priorityCode;
    /**
     * 保密级别
     */
    private Long confidentialityCode;
    /**
     * 重复次数（住院次数）
     */
    private Integer repeatNumber;
    /**
     * 是否中断
     */
    private String interruptiblelnd;
    /**
     * 级别编码
     */
    private Long levelCode;
    /**
     * 是否独立
     */
    private String independentlnd;
    /**
     * 不确定码
     */
    private Long uncertaintyCode;
    /**
     * 原因编码
     */
    private Long reasonCode;

    public String getActionNegationlnd() {
        return actionNegationlnd;
    }

    public void setActionNegationlnd(String actionNegationlnd) {
        this.actionNegationlnd = actionNegationlnd;
    }

    public String getNegationlnd() {
        return negationlnd;
    }

    public void setNegationlnd(String negationlnd) {
        this.negationlnd = negationlnd;
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

    public Long getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(Long priorityCode) {
        this.priorityCode = priorityCode;
    }

    public Long getConfidentialityCode() {
        return confidentialityCode;
    }

    public void setConfidentialityCode(Long confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

    public Integer getRepeatNumber() {
        return repeatNumber;
    }

    public void setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public String getInterruptiblelnd() {
        return interruptiblelnd;
    }

    public void setInterruptiblelnd(String interruptiblelnd) {
        this.interruptiblelnd = interruptiblelnd;
    }

    public Long getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(Long levelCode) {
        this.levelCode = levelCode;
    }

    public String getIndependentlnd() {
        return independentlnd;
    }

    public void setIndependentlnd(String independentlnd) {
        this.independentlnd = independentlnd;
    }

    public Long getUncertaintyCode() {
        return uncertaintyCode;
    }

    public void setUncertaintyCode(Long uncertaintyCode) {
        this.uncertaintyCode = uncertaintyCode;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long reasonCode) {
        this.reasonCode = reasonCode;
    }

}
