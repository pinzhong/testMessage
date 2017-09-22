package com.trsd.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LendShort {

    /** 出借金额 */
    private BigDecimal lendMoney;

    /** 待还本金 */
    private BigDecimal repaymentPrincipal;

    /** 待还利息 */
    private BigDecimal repaymentInterest;

    /** 待还违约金 */
    private BigDecimal repaymentPenalty;

    /** 应还款时间 */
    private Date repaymentTime;

    /** 已还本金 */
    private BigDecimal paybackPrincipal;

    /** 已还利息 */
    private BigDecimal paybackInterest;

    /** 已还违约金 */
    private BigDecimal paybackPenalty;

    /** 实际还款时间 */
    private Date paybackTime;

    /** 状态(未还款，逾期未还款，正常还款，提前还款，逾期还款) */
    private Integer status;

    /** 违约天数 */
    private Integer expriedDays;

    /**
     * 获取违约天数
     * @return expried_days 违约天数
     */
    public Integer getExpriedDays() {
		return expriedDays;
	}

    /**
     * 设置违约天数
     * @param expried_days 违约天数
     */
	public void setExpriedDays(Integer expriedDays) {
		this.expriedDays = expriedDays;
	}

    /**
     * 获取出借金额
     *
     * @return lend_money - 出借金额
     */
    public BigDecimal getLendMoney() {
        return lendMoney;
    }

    /**
     * 设置出借金额
     *
     * @param lendMoney 出借金额
     */
    public void setLendMoney(BigDecimal lendMoney) {
        this.lendMoney = lendMoney;
    }

    /**
     * 获取待还本金
     *
     * @return repayment_principal - 待还本金
     */
    public BigDecimal getRepaymentPrincipal() {
        return repaymentPrincipal;
    }

    /**
     * 设置待还本金
     *
     * @param repaymentPrincipal 待还本金
     */
    public void setRepaymentPrincipal(BigDecimal repaymentPrincipal) {
        this.repaymentPrincipal = repaymentPrincipal;
    }

    /**
     * 获取待还利息
     *
     * @return repayment_interest - 待还利息
     */
    public BigDecimal getRepaymentInterest() {
        return repaymentInterest;
    }

    /**
     * 设置待还利息
     *
     * @param repaymentInterest 待还利息
     */
    public void setRepaymentInterest(BigDecimal repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    /**
     * 获取待还违约金
     *
     * @return repayment_penalty - 待还违约金
     */
    public BigDecimal getRepaymentPenalty() {
        return repaymentPenalty;
    }

    /**
     * 设置待还违约金
     *
     * @param repaymentPenalty 待还违约金
     */
    public void setRepaymentPenalty(BigDecimal repaymentPenalty) {
        this.repaymentPenalty = repaymentPenalty;
    }

    /**
     * 获取应还款时间
     *
     * @return repayment_time - 应还款时间
     */
    public Date getRepaymentTime() {
        return repaymentTime;
    }

    /**
     * 设置应还款时间
     *
     * @param repaymentTime 应还款时间
     */
    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    /**
     * 获取已还本金
     *
     * @return payback_principal - 已还本金
     */
    public BigDecimal getPaybackPrincipal() {
        return paybackPrincipal;
    }

    /**
     * 设置已还本金
     *
     * @param paybackPrincipal 已还本金
     */
    public void setPaybackPrincipal(BigDecimal paybackPrincipal) {
        this.paybackPrincipal = paybackPrincipal;
    }

    /**
     * 获取已还利息
     *
     * @return payback_interest - 已还利息
     */
    public BigDecimal getPaybackInterest() {
        return paybackInterest;
    }

    /**
     * 设置已还利息
     *
     * @param paybackInterest 已还利息
     */
    public void setPaybackInterest(BigDecimal paybackInterest) {
        this.paybackInterest = paybackInterest;
    }

    /**
     * 获取已还违约金
     *
     * @return payback_penalty - 已还违约金
     */
    public BigDecimal getPaybackPenalty() {
        return paybackPenalty;
    }

    /**
     * 设置已还违约金
     *
     * @param paybackPenalty 已还违约金
     */
    public void setPaybackPenalty(BigDecimal paybackPenalty) {
        this.paybackPenalty = paybackPenalty;
    }

    /**
     * 获取实际还款时间
     *
     * @return payback_time - 实际还款时间
     */
    public Date getPaybackTime() {
        return paybackTime;
    }

    /**
     * 设置实际还款时间
     *
     * @param paybackTime 实际还款时间
     */
    public void setPaybackTime(Date paybackTime) {
        this.paybackTime = paybackTime;
    }

    /**
     * 获取状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)
     *
     * @return status - 状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)
     *
     * @param status 状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}