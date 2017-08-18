package com.trsd.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FreeTicketInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 编号  free_ticket_id **/
    private Long freeTicketId;

    /** 使用金额  freet_amount **/
    private BigDecimal freetAmount;

    /** 状态（未使用，已使用，已过期）  status **/
    private Integer status;

    /** 使用时间  free_time **/
    private Date freeTime;

    /** 对应的长、短贷投资id  pay_back_id **/
    private Long payBackId;

    /** 免息券类型  free_type **/
    private Integer freeType;

    /** 过期时间  limit_time **/
    private Date limitTime;

    /** 使用人  user_id **/
    private Long userId;

    /**   create_time **/
    private Date createTime;

    /**   version **/
    private Long version;

    /**   编号  free_ticket_id   **/
    public Long getFreeTicketId() {
        return freeTicketId;
    }

    /**   编号  free_ticket_id   **/
    public void setFreeTicketId(Long freeTicketId) {
        this.freeTicketId = freeTicketId;
    }

    /**   使用金额  freet_amount   **/
    public BigDecimal getFreetAmount() {
        return freetAmount;
    }

    /**   使用金额  freet_amount   **/
    public void setFreetAmount(BigDecimal freetAmount) {
        this.freetAmount = freetAmount;
    }

    /**   状态（未使用，已使用，已过期）  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   状态（未使用，已使用，已过期）  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   使用时间  free_time   **/
    public Date getFreeTime() {
        return freeTime;
    }

    /**   使用时间  free_time   **/
    public void setFreeTime(Date freeTime) {
        this.freeTime = freeTime;
    }

    /**   对应的长、短贷投资id  pay_back_id   **/
    public Long getPayBackId() {
        return payBackId;
    }

    /**   对应的长、短贷投资id  pay_back_id   **/
    public void setPayBackId(Long payBackId) {
        this.payBackId = payBackId;
    }

    /**   免息券类型  free_type   **/
    public Integer getFreeType() {
        return freeType;
    }

    /**   免息券类型  free_type   **/
    public void setFreeType(Integer freeType) {
        this.freeType = freeType;
    }

    /**   过期时间  limit_time   **/
    public Date getLimitTime() {
        return limitTime;
    }

    /**   过期时间  limit_time   **/
    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    /**   使用人  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   使用人  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**     create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**     create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**     version   **/
    public Long getVersion() {
        return version;
    }

    /**     version   **/
    public void setVersion(Long version) {
        this.version = version;
    }
}