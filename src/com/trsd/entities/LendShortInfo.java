package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class LendShortInfo {
    /** 编号  lend_short_id **/
    private Long lendShortId;

    /** 短贷借款编号  loan_short_id **/
    private Long loanShortId;

    /** 短贷投资计划编号  lend_short_scheme_id **/
    private Long lendShortSchemeId;

    /** 出借人编号  user_id **/
    private Long userId;

    /** 出借金额  lend_money **/
    private BigDecimal lendMoney;

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

    /** 类型(金主放款，企业放款)  lend_user_type **/
    private Integer lendUserType;

    /** 状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)  status **/
    private Integer status;

    /** 创建时间  create_time **/
    private Date createTime;

    /** 更新时间  update_time **/
    private Date updateTime;

    /**   version **/
    private Long version;

    /**   编号  lend_short_id   **/
    public Long getLendShortId() {
        return lendShortId;
    }

    /**   编号  lend_short_id   **/
    public void setLendShortId(Long lendShortId) {
        this.lendShortId = lendShortId;
    }

    /**   短贷借款编号  loan_short_id   **/
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**   短贷借款编号  loan_short_id   **/
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**   短贷投资计划编号  lend_short_scheme_id   **/
    public Long getLendShortSchemeId() {
        return lendShortSchemeId;
    }

    /**   短贷投资计划编号  lend_short_scheme_id   **/
    public void setLendShortSchemeId(Long lendShortSchemeId) {
        this.lendShortSchemeId = lendShortSchemeId;
    }

    /**   出借人编号  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   出借人编号  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   出借金额  lend_money   **/
    public BigDecimal getLendMoney() {
        return lendMoney;
    }

    /**   出借金额  lend_money   **/
    public void setLendMoney(BigDecimal lendMoney) {
        this.lendMoney = lendMoney;
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

    /**   类型(金主放款，企业放款)  lend_user_type   **/
    public Integer getLendUserType() {
        return lendUserType;
    }

    /**   类型(金主放款，企业放款)  lend_user_type   **/
    public void setLendUserType(Integer lendUserType) {
        this.lendUserType = lendUserType;
    }

    /**   状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   状态(未还款，逾期未还款，正常还款，提前还款，逾期还款)  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   创建时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   创建时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   更新时间  update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**   更新时间  update_time   **/
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