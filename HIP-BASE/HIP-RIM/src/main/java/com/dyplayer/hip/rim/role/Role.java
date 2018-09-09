/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.role;

import java.util.Date;

/**
 *
 * @author duyi
 */
public class Role extends RoleHeir {

    /**
     * 否定
     */
    private String negationlnd;
    /**
     * 名称
     */
    private String name;
    /**
     * 有效开始时间
     */
    private Date effectiveTimeLow;
    /**
     * 有效结束时间
     */
    private Date effectiveTimeHigh;
    /**
     * 证书
     */
    private String certificateText;
    /**
     * 机密
     */
    private Long confidentialityCode;
    /**
     * 数量
     */
    private Double quantity;
    /**
     * 优先号
     */
    private Integer priorityNumber;
    /**
     * 位置号
     */
    private Integer positionNumber;
}
