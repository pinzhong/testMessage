package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_payback")
public class LendPayback {
    /**
     * 编号
     */
    @Id
    @Column(name = "payback_long_id")
    @GeneratedValue(generator = "JDBC")
    private Long paybackLongId;

    /**
     * 长贷借款编号
     */
    @Column(name = "lend_long_id")
    private Long lendLongId;

    /**
     * 待还本金
     */
    @Column(name = "repayment_principal")
    private BigDecimal repaymentPrincipal;

    /**
     * 待还利息
     */
    @Column(name = "repayment_interest")
    private BigDecimal repaymentInterest;

    /**
     * 待还违约金
     */
    @Column(name = "repayment_penalty")
    private BigDecimal repaymentPenalty;

    /**
     * 应还款时间
     */
    @Column(name = "repayment_time")
    private Date repaymentTime;

    /**
     * 已还本金
     */
    @Column(name = "payback_principal")
    private BigDecimal paybackPrincipal;

    /**
     * 已还利息
     */
    @Column(name = "payback_interest")
    private BigDecimal paybackInterest;

    /**
     * 已还违约金
     */
    @Column(name = "payback_penalty")
    private BigDecimal paybackPenalty;

    /**
     * 实际还款时间
     */
    @Column(name = "payback_time")
    private Date paybackTime;

    /**
     * 还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)
     */
    private Integer status;

    /**
     * 当前期数
     */
    @Column(name = "current_period")
    private Integer currentPeriod;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Long version;

    /**
     * 获取编号
     *
     * @return payback_long_id - 编号
     */
    public Long getPaybackLongId() {
        return paybackLongId;
    }

    /**
     * 设置编号
     *
     * @param paybackLongId 编号
     */
    public void setPaybackLongId(Long paybackLongId) {
        this.paybackLongId = paybackLongId;
    }

    /**
     * 获取长贷借款编号
     *
     * @return lend_long_id - 长贷借款编号
     */
    public Long getLendLongId() {
        return lendLongId;
    }

    /**
     * 设置长贷借款编号
     *
     * @param lendLongId 长贷借款编号
     */
    public void setLendLongId(Long lendLongId) {
        this.lendLongId = lendLongId;
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
     * 获取还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)
     *
     * @return status - 还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)
     *
     * @param status 还款状态(未还款，逾期未还款，提前还款，正常还款，逾期还款)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取当前期数
     *
     * @return current_period - 当前期数
     */
    public Integer getCurrentPeriod() {
        return currentPeriod;
    }

    /**
     * 设置当前期数
     *
     * @param currentPeriod 当前期数
     */
    public void setCurrentPeriod(Integer currentPeriod) {
        this.currentPeriod = currentPeriod;
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
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}