package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class InvestTicketInfo {
    /** 编号  invest_ticket_id **/
    private Long investTicketId;

    /** 使用金额  invest_amount **/
    private BigDecimal investAmount;

    /** 状态（未使用，已使用，已过期）  status **/
    private Integer status;

    /** 使用时间  invest_time **/
    private Date investTime;

    /** 对应的长、短贷投资id  lend_id **/
    private Long lendId;

    /** 投资券类型  invest_type **/
    private Integer investType;

    /** 过期时间  limit_time **/
    private Date limitTime;

    /** 使用人  user_id **/
    private Long userId;

    /**   create_time **/
    private Date createTime;

    /**   version **/
    private Long version;

    /**   编号  invest_ticket_id   **/
    public Long getInvestTicketId() {
        return investTicketId;
    }

    /**   编号  invest_ticket_id   **/
    public void setInvestTicketId(Long investTicketId) {
        this.investTicketId = investTicketId;
    }

    /**   使用金额  invest_amount   **/
    public BigDecimal getInvestAmount() {
        return investAmount;
    }

    /**   使用金额  invest_amount   **/
    public void setInvestAmount(BigDecimal investAmount) {
        this.investAmount = investAmount;
    }

    /**   状态（未使用，已使用，已过期）  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   状态（未使用，已使用，已过期）  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   使用时间  invest_time   **/
    public Date getInvestTime() {
        return investTime;
    }

    /**   使用时间  invest_time   **/
    public void setInvestTime(Date investTime) {
        this.investTime = investTime;
    }

    /**   对应的长、短贷投资id  lend_id   **/
    public Long getLendId() {
        return lendId;
    }

    /**   对应的长、短贷投资id  lend_id   **/
    public void setLendId(Long lendId) {
        this.lendId = lendId;
    }

    /**   投资券类型  invest_type   **/
    public Integer getInvestType() {
        return investType;
    }

    /**   投资券类型  invest_type   **/
    public void setInvestType(Integer investType) {
        this.investType = investType;
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