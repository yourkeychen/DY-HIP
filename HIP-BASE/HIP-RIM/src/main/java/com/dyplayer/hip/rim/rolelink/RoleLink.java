/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyplayer.hip.rim.rolelink;

import com.dyplayer.hip.rim.InfrastructureRoot;
import java.util.Date;

/**
 *
 * @author duyi
 */
public class RoleLink extends InfrastructureRoot {

    /**
     * 类型编码
     */
    private String typeCode;
    /**
     * 状态编码
     */
    private String statusCode;
    /**
     * 优先号
     */
    private Integer priorityNumber;
    /**
     * 有效开始时间
     */
    private Date effectiveTimeLow;
    /**
     * 有效结束时间
     */
    private Date effectiveTimeHigh;
}
