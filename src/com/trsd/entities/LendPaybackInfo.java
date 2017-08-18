package com.trsd.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LendPaybackInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 编号  payback_long_id **/
    private Long paybackLongId;

    /** 长贷借款编号  lend_long_id **/
    private Long lendLongId;

    /** 待还本金  repayment_principal **/
    private BigDecimal repaymentPrincipal;

    /** 待还利息  repayment_interest **/
    private BigDecimal repaymentInterest;

    /** 待还违约金  repayment_penalty **/
    private BigDecimal repaymentPenalty;

    /** 应还款时间  repayment_time **/
    private Date repaymentTime;

    /** 已还本金  payback_principal **/
    private BigDecimal paybackPrincipal;

    /** 已还利息  payback_interest **/
    private BigDecimal paybackInterest;

    /** 已还违约金  payback_penalty **/
    private BigDecimal paybackPenalty;

    /** 实际还款时间  payback_time **/
    private Date paybackTime;

    /** 还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)  status **/
    private Integer status;

    /** 当前期数  current_period **/
    private Integer currentPeriod;

    /**   create_time **/
    private Date createTime;

    /**   update_time **/
    private Date updateTime;

    /**   version **/
    private Long version;

    /**   编号  payback_long_id   **/
    public Long getPaybackLongId() {
        return paybackLongId;
    }

    /**   编号  payback_long_id   **/
    public void setPaybackLongId(Long paybackLongId) {
        this.paybackLongId = paybackLongId;
    }

    /**   长贷借款编号  lend_long_id   **/
    public Long getLendLongId() {
        return lendLongId;
    }

    /**   长贷借款编号  lend_long_id   **/
    public void setLendLongId(Long lendLongId) {
        this.lendLongId = lendLongId;
    }

    /**   待还本金  repayment_principal   **/
    public BigDecimal getRepaymentPrincipal() {
        return repaymentPrincipal;
    }

    /**   待还本金  repayment_principal   **/
    public void setRepaymentPrincipal(BigDecimal repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }

    /**   待还利息  repayment_interest   **/
    public BigDecimal getRepaymentInterest() {
        return repaymentInterest;
    }

    /**   待还利息  repayment_interest   **/
    public void setRepaymentInterest(BigDecimal repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    /**   待还违约金  repayment_penalty   **/
    public BigDecimal getRepaymentPenalty() {
        return repaymentPenalty;
    }

    /**   待还违约金  repayment_penalty   **/
    public void setRepaymentPenalty(BigDecimal repaymentPenalty) {
        this.repaymentPenalty = repaymentPenalty;
    }

    /**   应还款时间  repayment_time   **/
    public Date getRepaymentTime() {
        return repaymentTime;
    }

    /**   应还款时间  repayment_time   **/
    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    /**   已还本金  payback_principal   **/
    public BigDecimal getPaybackPrincipal() {
        return paybackPrincipal;
    }

    /**   已还本金  payback_principal   **/
    public void setPaybackPrincipal(BigDecimal paybackPrincipal) {
        this.paybackPrincipal = paybackPrincipal;
    }

    /**   已还利息  payback_interest   **/
    public BigDecimal getPaybackInterest() {
        return paybackInterest;
    }

    /**   已还利息  payback_interest   **/
    public void setPaybackInterest(BigDecimal paybackInterest) {
        this.paybackInterest = paybackInterest;
    }

    /**   已还违约金  payback_penalty   **/
    public BigDecimal getPaybackPenalty() {
        return paybackPenalty;
    }

    /**   已还违约金  payback_penalty   **/
    public void setPaybackPenalty(BigDecimal paybackPenalty) {
        this.paybackPenalty = paybackPenalty;
    }

    /**   实际还款时间  payback_time   **/
    public Date getPaybackTime() {
        return paybackTime;
    }

    /**   实际还款时间  payback_time   **/
    public void setPaybackTime(Date paybackTime) {
        this.paybackTime = paybackTime;
    }

    /**   还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   当前期数  current_period   **/
    public Integer getCurrentPeriod() {
        return currentPeriod;
    }

    /**   当前期数  current_period   **/
    public void setCurrentPeriod(Integer currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    /**     create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**     create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**     update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**     update_time   **/
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