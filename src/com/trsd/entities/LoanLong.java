package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_long")
public class LoanLong {
    /**
     * 主键id
     */
    @Id
    @Column(name = "loan_long_id")
    private Long loanLongId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 申请借款金额
     */
    @Column(name = "apply_money")
    private BigDecimal applyMoney;

    /**
     * 已借到金额
     */
    @Column(name = "borrowed_money")
    private BigDecimal borrowedMoney;

    /**
     * 待借金额
     */
    @Column(name = "loan_money")
    private BigDecimal loanMoney;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 限制有效时间
     */
    @Column(name = "limit_time")
    private Date limitTime;

    /**
     * 期数
     */
    private Integer periods;

    /**
     * 借款年利率
     */
    private BigDecimal rate;

    /**
     * 新建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private Long version;

    /**
     * 借款用途
     */
    private String memo;

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
     * 获取主键id
     *
     * @return loan_long_id - 主键id
     */
    public Long getLoanLongId() {
        return loanLongId;
    }

    /**
     * 设置主键id
     *
     * @param loanLongId 主键id
     */
    public void setLoanLongId(Long loanLongId) {
        this.loanLongId = loanLongId;
    }

    /**
     * 获取主键ID
     *
     * @return user_id - 主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键ID
     *
     * @param userId 主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取申请借款金额
     *
     * @return apply_money - 申请借款金额
     */
    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    /**
     * 设置申请借款金额
     *
     * @param applyMoney 申请借款金额
     */
    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    /**
     * 获取已借到金额
     *
     * @return borrowed_money - 已借到金额
     */
    public BigDecimal getBorrowedMoney() {
        return borrowedMoney;
    }

    /**
     * 设置已借到金额
     *
     * @param borrowedMoney 已借到金额
     */
    public void setBorrowedMoney(BigDecimal borrowedMoney) {
        this.borrowedMoney = borrowedMoney;
    }

    /**
     * 获取待借金额
     *
     * @return loan_money - 待借金额
     */
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**
     * 设置待借金额
     *
     * @param loanMoney 待借金额
     */
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取限制有效时间
     *
     * @return limit_time - 限制有效时间
     */
    public Date getLimitTime() {
        return limitTime;
    }

    /**
     * 设置限制有效时间
     *
     * @param limitTime 限制有效时间
     */
    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * 获取期数
     *
     * @return periods - 期数
     */
    public Integer getPeriods() {
        return periods;
    }

    /**
     * 设置期数
     *
     * @param periods 期数
     */
    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    /**
     * 获取借款年利率
     *
     * @return rate - 借款年利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置借款年利率
     *
     * @param rate 借款年利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取新建时间
     *
     * @return create_time - 新建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置新建时间
     *
     * @param createTime 新建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
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

    /**
     * 获取借款用途
     *
     * @return memo - 借款用途
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置借款用途
     *
     * @param memo 借款用途
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
}