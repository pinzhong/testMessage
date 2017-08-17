package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class LoanShortInfo {
    /** 主键id  loan_short_id **/
    private Long loanShortId;

    /** 用户编号  user_id **/
    private Long userId;

    /** 申请借款金额  apply_money **/
    private BigDecimal applyMoney;

    /** 已借到金额  borrowed_money **/
    private BigDecimal borrowedMoney;

    /** 待借金额  loan_money **/
    private BigDecimal loanMoney;

    /** 状态(0：待还；1：已还；3：逾期；）  status **/
    private Integer status;

    /** 限制有效时间  limit_time **/
    private Date limitTime;

    /** 还款时间  payback_time **/
    private Date paybackTime;

    /** 新建时间  create_time **/
    private Date createTime;

    /** 更新时间  update_time **/
    private Date updateTime;

    /**   version **/
    private Long version;

    /**   主键id  loan_short_id   **/
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**   主键id  loan_short_id   **/
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**   用户编号  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   用户编号  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   申请借款金额  apply_money   **/
    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    /**   申请借款金额  apply_money   **/
    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    /**   已借到金额  borrowed_money   **/
    public BigDecimal getBorrowedMoney() {
        return borrowedMoney;
    }

    /**   已借到金额  borrowed_money   **/
    public void setBorrowedMoney(BigDecimal borrowedMoney) {
        this.borrowedMoney = borrowedMoney;
    }

    /**   待借金额  loan_money   **/
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**   待借金额  loan_money   **/
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**   状态(0：待还；1：已还；3：逾期；）  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   状态(0：待还；1：已还；3：逾期；）  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   限制有效时间  limit_time   **/
    public Date getLimitTime() {
        return limitTime;
    }

    /**   限制有效时间  limit_time   **/
    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    /**   还款时间  payback_time   **/
    public Date getPaybackTime() {
        return paybackTime;
    }

    /**   还款时间  payback_time   **/
    public void setPaybackTime(Date paybackTime) {
        this.paybackTime = paybackTime;
    }

    /**   新建时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   新建时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   更新时间  update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**   更新时间  update_time   **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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