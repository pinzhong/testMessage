package com.trsd.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LoanLong {

	/** 主键ID */
    private Long userId;

    /** 业务编号 */
    private String loanLongKey;

    /** 已借到金额 */
    private BigDecimal borrowedMoney;

    /** 期数 */
    private Integer periods;

    /** 借款年利率 */
    private BigDecimal rate;

    /** 新建时间 */
    private Date createTime;

    /** 待还利息 */
    private BigDecimal repaymentInterest;

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
     * 获取业务编号
     *
     * @return loan_long_key - 业务编号
     */
    public String getLoanLongKey() {
        return loanLongKey;
    }

    /**
     * 设置业务编号
     *
     * @param loanLongKey 业务编号
     */
    public void setLoanLongKey(String loanLongKey) {
        this.loanLongKey = loanLongKey == null ? null : loanLongKey.trim();
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