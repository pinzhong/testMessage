package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "v_lend_payback")
public class ViewLendPayback {
    @Column(name = "lend_payback_id")
    private String lendPaybackId;

    @Column(name = "lend_id")
    private Long lendId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "repayment_interest")
    private BigDecimal repaymentInterest;

    @Column(name = "repayment_penalty")
    private BigDecimal repaymentPenalty;

    @Column(name = "repayment_principal")
    private BigDecimal repaymentPrincipal;

    @Column(name = "repayment_time")
    private Date repaymentTime;

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
     * @return lend_payback_id
     */
    public String getLendPaybackId() {
        return lendPaybackId;
    }

    /**
     * @param lendPaybackId
     */
    public void setLendPaybackId(String lendPaybackId) {
        this.lendPaybackId = lendPaybackId == null ? null : lendPaybackId.trim();
    }

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
     * @return repayment_time
     */
    public Date getRepaymentTime() {
        return repaymentTime;
    }

    /**
     * @param repaymentTime
     */
    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
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