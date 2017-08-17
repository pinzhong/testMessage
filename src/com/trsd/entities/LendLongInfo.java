package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class LendLongInfo {
    /** 编号  lend_long_id **/
    private Long lendLongId;

    /** 长贷借款编号  loan_long_id **/
    private Long loanLongId;

    /** 长贷投资计划编号  lend_long_scheme_id **/
    private Long lendLongSchemeId;

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

    /** 已还本金  payback_principal **/
    private BigDecimal paybackPrincipal;

    /** 已还利息  paybackt_interest **/
    private BigDecimal paybacktInterest;

    /** 已还违约金  payback_penalty **/
    private BigDecimal paybackPenalty;

    /** 类型(金主放款，企业放款)  lend_user_type **/
    private Integer lendUserType;

    /** 状态  status **/
    private Integer status;

    /** 期数  periods **/
    private Integer periods;

    /** 创建时间  create_time **/
    private Date createTime;

    /** 更新时间  update_time **/
    private Date updateTime;

    /**   version **/
    private Long version;

    /**   编号  lend_long_id   **/
    public Long getLendLongId() {
        return lendLongId;
    }

    /**   编号  lend_long_id   **/
    public void setLendLongId(Long lendLongId) {
        this.lendLongId = lendLongId;
    }

    /**   长贷借款编号  loan_long_id   **/
    public Long getLoanLongId() {
        return loanLongId;
    }

    /**   长贷借款编号  loan_long_id   **/
    public void setLoanLongId(Long loanLongId) {
        this.loanLongId = loanLongId;
    }

    /**   长贷投资计划编号  lend_long_scheme_id   **/
    public Long getLendLongSchemeId() {
        return lendLongSchemeId;
    }

    /**   长贷投资计划编号  lend_long_scheme_id   **/
    public void setLendLongSchemeId(Long lendLongSchemeId) {
        this.lendLongSchemeId = lendLongSchemeId;
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

    /**   已还本金  payback_principal   **/
    public BigDecimal getPaybackPrincipal() {
        return paybackPrincipal;
    }

    /**   已还本金  payback_principal   **/
    public void setPaybackPrincipal(BigDecimal paybackPrincipal) {
        this.paybackPrincipal = paybackPrincipal;
    }

    /**   已还利息  paybackt_interest   **/
    public BigDecimal getPaybacktInterest() {
        return paybacktInterest;
    }

    /**   已还利息  paybackt_interest   **/
    public void setPaybacktInterest(BigDecimal paybacktInterest) {
        this.paybacktInterest = paybacktInterest;
    }

    /**   已还违约金  payback_penalty   **/
    public BigDecimal getPaybackPenalty() {
        return paybackPenalty;
    }

    /**   已还违约金  payback_penalty   **/
    public void setPaybackPenalty(BigDecimal paybackPenalty) {
        this.paybackPenalty = paybackPenalty;
    }

    /**   类型(金主放款，企业放款)  lend_user_type   **/
    public Integer getLendUserType() {
        return lendUserType;
    }

    /**   类型(金主放款，企业放款)  lend_user_type   **/
    public void setLendUserType(Integer lendUserType) {
        this.lendUserType = lendUserType;
    }

    /**   状态  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   状态  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   期数  periods   **/
    public Integer getPeriods() {
        return periods;
    }

    /**   期数  periods   **/
    public void setPeriods(Integer periods) {
        this.periods = periods;
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