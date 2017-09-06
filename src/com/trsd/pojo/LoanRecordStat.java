package com.trsd.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanRecordStat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Long loanId;
	/**
	 * 业务编号
	 */
	private String loanKey;

	/**
	 * 主键ID
	 */
	private Long userId;
	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 申请借款金额
	 */
	private BigDecimal applyMoney;

	/**
	 * 已借到金额
	 */
	private BigDecimal borrowedMoney;

	/**
	 * 待借金额
	 */
	private BigDecimal loanMoney;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 限制有效时间
	 */
	private Date limitTime;

	/**
	 * 应还款时间
	 */
	private Date repaybackTime;

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
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 版本号
	 */
	private Long version;

	/**
	 * 借款用途
	 */
	private String memo;

	/**
	 * 借款天数
	 */
	private int loanDays;

	/**
	 * 待还本金
	 */
	private BigDecimal repaymentPrincipal;

	/**
	 * 待还利息
	 */
	private BigDecimal repaymentInterest;

	/**
	 * 待还违约金
	 */
	private BigDecimal repaymentPenalty;

	/**
	 * 已还本金
	 */
	private BigDecimal paybackPrincipal;

	/**
	 * 已还利息
	 */
	private BigDecimal paybackInterest;

	/**
	 * 已还违约金
	 */
	private BigDecimal paybackPenalty;

	/**
	 * 还款时间
	 */
	private Date paybackTime;
	/**
	 * 贷款类型 0为短贷，1为长贷
	 */
	private int loantype;

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getLoanKey() {
		return loanKey;
	}

	public void setLoanKey(String loanKey) {
		this.loanKey = loanKey;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getApplyMoney() {
		return applyMoney;
	}

	public void setApplyMoney(BigDecimal applyMoney) {
		this.applyMoney = applyMoney;
	}

	public BigDecimal getBorrowedMoney() {
		return borrowedMoney;
	}

	public void setBorrowedMoney(BigDecimal borrowedMoney) {
		this.borrowedMoney = borrowedMoney;
	}

	public BigDecimal getLoanMoney() {
		return loanMoney;
	}

	public void setLoanMoney(BigDecimal loanMoney) {
		this.loanMoney = loanMoney;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLimitTime() {
		return limitTime;
	}

	public void setLimitTime(Date limitTime) {
		this.limitTime = limitTime;
	}

	public Integer getPeriods() {
		return periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getRepaymentPrincipal() {
		return repaymentPrincipal;
	}

	public void setRepaymentPrincipal(BigDecimal repaymentPrincipal) {
		this.repaymentPrincipal = repaymentPrincipal;
	}

	public BigDecimal getRepaymentInterest() {
		return repaymentInterest;
	}

	public void setRepaymentInterest(BigDecimal repaymentInterest) {
		this.repaymentInterest = repaymentInterest;
	}

	public BigDecimal getRepaymentPenalty() {
		return repaymentPenalty;
	}

	public void setRepaymentPenalty(BigDecimal repaymentPenalty) {
		this.repaymentPenalty = repaymentPenalty;
	}

	public BigDecimal getPaybackPrincipal() {
		return paybackPrincipal;
	}

	public void setPaybackPrincipal(BigDecimal paybackPrincipal) {
		this.paybackPrincipal = paybackPrincipal;
	}

	public BigDecimal getPaybackInterest() {
		return paybackInterest;
	}

	public void setPaybackInterest(BigDecimal paybackInterest) {
		this.paybackInterest = paybackInterest;
	}

	public BigDecimal getPaybackPenalty() {
		return paybackPenalty;
	}

	public void setPaybackPenalty(BigDecimal paybackPenalty) {
		this.paybackPenalty = paybackPenalty;
	}

	public Date getRepaybackTime() {
		return repaybackTime;
	}

	public void setRepaybackTime(Date repaybackTime) {
		this.repaybackTime = repaybackTime;
	}

	public int getLoanDays() {
		return loanDays;
	}

	public void setLoanDays(int loanDays) {
		this.loanDays = loanDays;
	}

	public Date getPaybackTime() {
		return paybackTime;
	}

	public void setPaybackTime(Date paybackTime) {
		this.paybackTime = paybackTime;
	}

	public int getLoantype() {
		return loantype;
	}

	public void setLoantype(int loantype) {
		this.loantype = loantype;
	}

}
