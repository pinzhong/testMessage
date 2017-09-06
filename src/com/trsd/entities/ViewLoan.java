package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "v_loan")
public class ViewLoan {
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "loan_key")
    private String loanKey;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "apply_money")
    private BigDecimal applyMoney;

    @Column(name = "borrowed_money")
    private BigDecimal borrowedMoney;

    @Column(name = "loan_money")
    private BigDecimal loanMoney;

    private Integer status;

    @Column(name = "loan_status")
    private Integer loanStatus;

    @Column(name = "limit_time")
    private Date limitTime;

    private Integer periods;

    private String memo;

    private BigDecimal rate;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String type;

    /**
     * @return loan_id
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * @param loanId
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * @return loan_key
     */
    public String getLoanKey() {
        return loanKey;
    }

    /**
     * @param loanKey
     */
    public void setLoanKey(String loanKey) {
        this.loanKey = loanKey == null ? null : loanKey.trim();
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return apply_money
     */
    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    /**
     * @param applyMoney
     */
    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    /**
     * @return borrowed_money
     */
    public BigDecimal getBorrowedMoney() {
        return borrowedMoney;
    }

    /**
     * @param borrowedMoney
     */
    public void setBorrowedMoney(BigDecimal borrowedMoney) {
        this.borrowedMoney = borrowedMoney;
    }

    /**
     * @return loan_money
     */
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**
     * @param loanMoney
     */
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return loan_status
     */
    public Integer getLoanStatus() {
        return loanStatus;
    }

    /**
     * @param loanStatus
     */
    public void setLoanStatus(Integer loanStatus) {
        this.loanStatus = loanStatus;
    }

    /**
     * @return limit_time
     */
    public Date getLimitTime() {
        return limitTime;
    }

    /**
     * @param limitTime
     */
    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * @return periods
     */
    public Integer getPeriods() {
        return periods;
    }

    /**
     * @param periods
     */
    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * @param rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}