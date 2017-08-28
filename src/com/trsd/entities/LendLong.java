package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_long")
public class LendLong {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_long_id")
    @GeneratedValue(generator = "JDBC")
    private Long lendLongId;

    /**
     * 长贷借款编号
     */
    @Column(name = "loan_long_id")
    private Long loanLongId;

    /**
     * 长贷投资计划编号
     */
    @Column(name = "lend_long_scheme_id")
    private Long lendLongSchemeId;

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
     * 已还本金
     */
    @Column(name = "payback_principal")
    private BigDecimal paybackPrincipal;

    /**
     * 已还利息
     */
    @Column(name = "paybackt_interest")
    private BigDecimal paybacktInterest;

    /**
     * 已还违约金
     */
    @Column(name = "payback_penalty")
    private BigDecimal paybackPenalty;

    /**
     * 类型(金主放款，企业放款)
     */
    @Column(name = "lend_user_type")
    private Integer lendUserType;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 期数
     */
    private Integer periods;

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
     * @return lend_long_id - 编号
     */
    public Long getLendLongId() {
        return lendLongId;
    }

    /**
     * 设置编号
     *
     * @param lendLongId 编号
     */
    public void setLendLongId(Long lendLongId) {
        this.lendLongId = lendLongId;
    }

    /**
     * 获取长贷借款编号
     *
     * @return loan_long_id - 长贷借款编号
     */
    public Long getLoanLongId() {
        return loanLongId;
    }

    /**
     * 设置长贷借款编号
     *
     * @param loanLongId 长贷借款编号
     */
    public void setLoanLongId(Long loanLongId) {
        this.loanLongId = loanLongId;
    }

    /**
     * 获取长贷投资计划编号
     *
     * @return lend_long_scheme_id - 长贷投资计划编号
     */
    public Long getLendLongSchemeId() {
        return lendLongSchemeId;
    }

    /**
     * 设置长贷投资计划编号
     *
     * @param lendLongSchemeId 长贷投资计划编号
     */
    public void setLendLongSchemeId(Long lendLongSchemeId) {
        this.lendLongSchemeId = lendLongSchemeId;
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
     * @return paybackt_interest - 已还利息
     */
    public BigDecimal getPaybacktInterest() {
        return paybacktInterest;
    }

    /**
     * 设置已还利息
     *
     * @param paybacktInterest 已还利息
     */
    public void setPaybacktInterest(BigDecimal paybacktInterest) {
        this.paybacktInterest = paybacktInterest;
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