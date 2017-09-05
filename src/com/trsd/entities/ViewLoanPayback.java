package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "v_loan_payback")
public class ViewLoanPayback {
    @Column(name = "loan_payback_id")
    private String loanPaybackId;

    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "repayment_interest")
    private BigDecimal repaymentInterest;

    @Column(name = "repayment_penalty")
    private BigDecimal repaymentPenalty;

    @Column(name = "repayment_principal")
    private BigDecimal repaymentPrincipal;

    @Column(name = "repayback_time")
    private Date repaybackTime;

    @Column(name = "payback_interest")
    private BigDecimal paybackInterest;

    @Column(name = "payback_penalty")
    private BigDecimal paybackPenalty;

    @Column(name = "payback_principal")
    private BigDecimal paybackPrincipal;

    @Column(name = "payback_time")
    private Date paybackTime;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return loan_payback_id
     */
    public String getLoanPaybackId() {
        return loanPaybackId;
    }

    /**
     * @param loanPaybackId
     */
    public void setLoanPaybackId(String loanPaybackId) {
        this.loanPaybackId = loanPaybackId == null ? null : loanPaybackId.trim();
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
     * @return repayback_time
     */
    public Date getRepaybackTime() {
        return repaybackTime;
    }

    /**
     * @param repaybackTime
     */
    public void setRepaybackTime(Date repaybackTime) {
        this.repaybackTime = repaybackTime;
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
}