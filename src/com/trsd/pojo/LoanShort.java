package com.trsd.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LoanShort {

    /** 短贷申请业务编号 */
    private String loanShortKey;

    /** 用户编号 */
    private Long userId;

    /** 已借到金额 */
    private BigDecimal borrowedMoney;

    /** 新建时间 */
    private Date createTime;

    /** 借款利率 */
    private BigDecimal rate;

    /** 借款天数 */
    private Integer loanDays;

    /** 待还利息 */
    private BigDecimal repaymentInterest;

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
}