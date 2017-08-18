package com.trsd.entities;

import java.io.Serializable;
import java.util.Date;

public class UserFlagInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 编号  user_flag_id **/
    private Long userFlagId;

    /** 主键ID  user_id **/
    private Long userId;

    /** 标记类型  flag_type **/
    private Integer flagType;

    /** 标记时间  create_time **/
    private Date createTime;

    /** 标记状态  status **/
    private Integer status;

    /** 标记原因  flag_reason **/
    private String flagReason;

    /**   编号  user_flag_id   **/
    public Long getUserFlagId() {
        return userFlagId;
    }

    /**   编号  user_flag_id   **/
    public void setUserFlagId(Long userFlagId) {
        this.userFlagId = userFlagId;
    }

    /**   主键ID  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   主键ID  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   标记类型  flag_type   **/
    public Integer getFlagType() {
        return flagType;
    }

    /**   标记类型  flag_type   **/
    public void setFlagType(Integer flagType) {
        this.flagType = flagType;
    }

    /**   标记时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   标记时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   标记状态  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   标记状态  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   标记原因  flag_reason   **/
    public String getFlagReason() {
        return flagReason;
    }

    /**   标记原因  flag_reason   **/
    public void setFlagReason(String flagReason) {
        this.flagReason = flagReason == null ? null : flagReason.trim();
    }
}