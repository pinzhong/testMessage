package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_short")
public class LoanShort {
    /**
     * 主键id
     */
    @Id
    @Column(name = "loan_short_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanShortId;

    /**
     * 短贷申请业务编号
     */
    @Column(name = "loan_short_key")
    private String loanShortKey;

    /**
     * 用户编号
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
     * 状态(0：待还；1：已还；3：逾期；）
     */
    private Integer status;

    /**
     * 限制有效时间
     */
    @Column(name = "limit_time")
    private Date limitTime;

    /**
     * 还款时间
     */
    @Column(name = "repayback_time")
    private Date repaybackTime;

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
     * 借款利率
     */
    private BigDecimal rate;

    /**
     * 借款天数
     */
    @Column(name = "loan_days")
    private Integer loanDays;

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
     * 待还本金
     */
    @Column(name = "payback_principal")
    private BigDecimal paybackPrincipal;

    /**
     * 待还利息
     */
    @Column(name = "payback_interest")
    private BigDecimal paybackInterest;

    /**
     * 待还违约金
     */
    @Column(name = "payback_penalty")
    private BigDecimal paybackPenalty;

    @Column(name = "payback_time")
    private Date paybackTime;

    /**
     * 满标状态
     */
    @Column(name = "loan_status")
    private Integer loanStatus;

    /**
     * 获取主键id
     *
     * @return loan_short_id - 主键id
     */
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**
     * 设置主键id
     *
     * @param loanShortId 主键id
     */
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**
     * 获取短贷申请业务编号
     *
     * @return loan_short_key - 短贷申请业务编号
     */
    public String getLoanShortKey() {
        return loanShortKey;
    }

    /**
     * 设置短贷申请业务编号
     *
     * @param loanShortKey 短贷申请业务编号
     */
    public void setLoanShortKey(String loanShortKey) {
        this.loanShortKey = loanShortKey == null ? null : loanShortKey.trim();
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
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
     * 获取状态(0：待还；1：已还；3：逾期；）
     *
     * @return status - 状态(0：待还；1：已还；3：逾期；）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(0：待还；1：已还；3：逾期；）
     *
     * @param status 状态(0：待还；1：已还；3：逾期；）
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
     * 获取还款时间
     *
     * @return repayback_time - 还款时间
     */
    public Date getRepaybackTime() {
        return repaybackTime;
    }

    /**
     * 设置还款时间
     *
     * @param repaybackTime 还款时间
     */
    public void setRepaybackTime(Date repaybackTime) {
        this.repaybackTime = repaybackTime;
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
     * 获取借款利率
     *
     * @return rate - 借款利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置借款利率
     *
     * @param rate 借款利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取借款天数
     *
     * @return loan_days - 借款天数
     */
    public Integer getLoanDays() {
        return loanDays;
    }

    /**
     * 设置借款天数
     *
     * @param loanDays 借款天数
     */
    public void setLoanDays(Integer loanDays) {
        this.loanDays = loanDays;
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
     * 获取待还本金
     *
     * @return payback_principal - 待还本金
     */
    public BigDecimal getPaybackPrincipal() {
        return paybackPrincipal;
    }

    /**
     * 设置待还本金
     *
     * @param paybackPrincipal 待还本金
     */
    public void setPaybackPrincipal(BigDecimal paybackPrincipal) {
        this.paybackPrincipal = paybackPrincipal;
    }

    /**
     * 获取待还利息
     *
     * @return payback_interest - 待还利息
     */
    public BigDecimal getPaybackInterest() {
        return paybackInterest;
    }

    /**
     * 设置待还利息
     *
     * @param paybackInterest 待还利息
     */
    public void setPaybackInterest(BigDecimal paybackInterest) {
        this.paybackInterest = paybackInterest;
    }

    /**
     * 获取待还违约金
     *
     * @return payback_penalty - 待还违约金
     */
    public BigDecimal getPaybackPenalty() {
        return paybackPenalty;
    }

    /**
     * 设置待还违约金
     *
     * @param paybackPenalty 待还违约金
     */
    public void setPaybackPenalty(BigDecimal paybackPenalty) {
        this.paybackPenalty = paybackPenalty;
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
     * 获取满标状态
     *
     * @return loan_status - 满标状态
     */
    public Integer getLoanStatus() {
        return loanStatus;
    }

    /**
     * 设置满标状态
     *
     * @param loanStatus 满标状态
     */
    public void setLoanStatus(Integer loanStatus) {
        this.loanStatus = loanStatus;
    }
}