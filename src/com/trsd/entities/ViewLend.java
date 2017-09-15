package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "v_lend")
public class ViewLend {
    @Column(name = "lend_id")
    private Long lendId;

    @Column(name = "lend_key")
    private String lendKey;

    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "lend_money")
    private BigDecimal lendMoney;

    @Column(name = "repayment_interest")
    private BigDecimal repaymentInterest;

    @Column(name = "repayment_penalty")
    private BigDecimal repaymentPenalty;

    @Column(name = "repayment_principal")
    private BigDecimal repaymentPrincipal;

    @Column(name = "payback_interest")
    private BigDecimal paybackInterest;

    @Column(name = "payback_penalty")
    private BigDecimal paybackPenalty;

    @Column(name = "payback_principal")
    private BigDecimal paybackPrincipal;

    @Column(name = "lend_user_type")
    private Integer lendUserType;

    private Long status;

    private Long periods;

    private String type;

    @Column(name = "payback_time")
    private Date paybackTime;

    @Column(name = "breakDays")
    private Long breakdays;

    /**
     * @return lend_id
     */
    public Long getLendId() {
        return lendId;
    }

    /**
     * @param lendId
     */
    public void setLendId(Long lendId) {
        this.lendId = lendId;
    }

    /**
     * @return lend_key
     */
    public String getLendKey() {
        return lendKey;
    }

    /**
     * @param lendKey
     */
    public void setLendKey(String lendKey) {
        this.lendKey = lendKey == null ? null : lendKey.trim();
    }

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
     * @return lend_money
     */
    public BigDecimal getLendMoney() {
        return lendMoney;
    }

    /**
     * @param lendMoney
     */
    public void setLendMoney(BigDecimal lendMoney) {
        this.lendMoney = lendMoney;
    }

    /**
     * @return repayment_interest
     */
    public BigDecimal getRepaymentInterest() {
        return repaymentInterest;
    }

    /**
     * @param repaymentInterest
     */
    public void setRepaymentInterest(BigDecimal repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    /**
     * @return repayment_penalty
     */
    public BigDecimal getRepaymentPenalty() {
        return repaymentPenalty;
    }

    /**
     * @param repaymentPenalty
     */
    public void setRepaymentPenalty(BigDecimal repaymentPenalty) {
        this.repaymentPenalty = repaymentPenalty;
    }

    /**
     * @return repayment_principal
     */
    public BigDecimal getRepaymentPrincipal() {
        return repaymentPrincipal;
    }

    /**
     * @param repaymentPrincipal
     */
    public void setRepaymentPrincipal(BigDecimal repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }

    /**
     * @return payback_interest
     */
    public BigDecimal getPaybackInterest() {
        return paybackInterest;
    }

    /**
     * @param paybackInterest
     */
    public void setPaybackInterest(BigDecimal paybackInterest) {
        this.paybackInterest = paybackInterest;
    }

    /**
     * @return payback_penalty
     */
    public BigDecimal getPaybackPenalty() {
        return paybackPenalty;
    }

    /**
     * @param paybackPenalty
     */
    public void setPaybackPenalty(BigDecimal paybackPenalty) {
        this.paybackPenalty = paybackPenalty;
    }

    /**
     * @return payback_principal
     */
    public BigDecimal getPaybackPrincipal() {
        return paybackPrincipal;
    }

    /**
     * @param paybackPrincipal
     */
    public void setPaybackPrincipal(BigDecimal paybackPrincipal) {
        this.paybackPrincipal = paybackPrincipal;
    }

    /**
     * @return lend_user_type
     */
    public Integer getLendUserType() {
        return lendUserType;
    }

    /**
     * @param lendUserType
     */
    public void setLendUserType(Integer lendUserType) {
        this.lendUserType = lendUserType;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * @return periods
     */
    public Long getPeriods() {
        return periods;
    }

    /**
     * @param periods
     */
    public void setPeriods(Long periods) {
        this.periods = periods;
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

    /**
     * @return payback_time
     */
    public Date getPaybackTime() {
        return paybackTime;
    }

    /**
     * @param paybackTime
     */
    public void setPaybackTime(Date paybackTime) {
        this.paybackTime = paybackTime;
    }

    /**
     * @return breakDays
     */
    public Long getBreakdays() {
        return breakdays;
    }

    /**
     * @param breakdays
     */
    public void setBreakdays(Long breakdays) {
        this.breakdays = breakdays;
    }
}