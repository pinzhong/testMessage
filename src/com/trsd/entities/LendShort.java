package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_short")
public class LendShort {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_short_id")
    private Long lendShortId;

    @Column(name = "lend_short_key")
    private String lendShortKey;

    /**
     * 短贷借款编号
     */
    @Column(name = "loan_short_id")
    private Long loanShortId;

    /**
     * 短贷投资计划编号
     */
    @Column(name = "lend_short_scheme_id")
    private Long lendShortSchemeId;

    /**
     * 出借人编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 出借金额
     */
    @Column(name = "lend_money")
    private BigDecimal lendMoney;

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
     * 类型(金主放款，企业放款)
     */
    @Column(name = "lend_user_type")
    private Integer lendUserType;

    /**
     * 状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)
     */
    private Integer status;

    /**
     * 创建时间
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
     * 获取编号
     *
     * @return lend_short_id - 编号
     */
    public Long getLendShortId() {
        return lendShortId;
    }

    /**
     * 设置编号
     *
     * @param lendShortId 编号
     */
    public void setLendShortId(Long lendShortId) {
        this.lendShortId = lendShortId;
    }

    /**
     * @return lend_short_key
     */
    public String getLendShortKey() {
        return lendShortKey;
    }

    /**
     * @param lendShortKey
     */
    public void setLendShortKey(String lendShortKey) {
        this.lendShortKey = lendShortKey == null ? null : lendShortKey.trim();
    }

    /**
     * 获取短贷借款编号
     *
     * @return loan_short_id - 短贷借款编号
     */
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**
     * 设置短贷借款编号
     *
     * @param loanShortId 短贷借款编号
     */
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**
     * 获取短贷投资计划编号
     *
     * @return lend_short_scheme_id - 短贷投资计划编号
     */
    public Long getLendShortSchemeId() {
        return lendShortSchemeId;
    }

    /**
     * 设置短贷投资计划编号
     *
     * @param lendShortSchemeId 短贷投资计划编号
     */
    public void setLendShortSchemeId(Long lendShortSchemeId) {
        this.lendShortSchemeId = lendShortSchemeId;
    }

    /**
     * 获取出借人编号
     *
     * @return user_id - 出借人编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置出借人编号
     *
     * @param userId 出借人编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 获取类型(金主放款，企业放款)
     *
     * @return lend_user_type - 类型(金主放款，企业放款)
     */
    public Integer getLendUserType() {
        return lendUserType;
    }

    /**
     * 设置类型(金主放款，企业放款)
     *
     * @param lendUserType 类型(金主放款，企业放款)
     */
    public void setLendUserType(Integer lendUserType) {
        this.lendUserType = lendUserType;
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

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
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
}