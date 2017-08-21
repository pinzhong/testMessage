package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class LoanShortInfo {
    /** ����id  loan_short_id **/
    private Long loanShortId;

    /** �û����  user_id **/
    private Long userId;

    /** ��������  apply_money **/
    private BigDecimal applyMoney;

    /** �ѽ赽���  borrowed_money **/
    private BigDecimal borrowedMoney;

    /** ������  loan_money **/
    private BigDecimal loanMoney;

    /** ״̬(0��������1���ѻ���3�����ڣ���  status **/
    private Integer status;

    /** ������Чʱ��  limit_time **/
    private Date limitTime;

    /** ����ʱ��  payback_time **/
    private Date paybackTime;

    /** �½�ʱ��  create_time **/
    private Date createTime;

    /** ����ʱ��  update_time **/
    private Date updateTime;

    /**   version **/
    private Long version;

    /** �����;  memo **/
    private String memo;

    /** �������  rate **/
    private BigDecimal rate;

    /**   ����id  loan_short_id   **/
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**   ����id  loan_short_id   **/
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**   �û����  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   �û����  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   ��������  apply_money   **/
    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    /**   ��������  apply_money   **/
    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    /**   �ѽ赽���  borrowed_money   **/
    public BigDecimal getBorrowedMoney() {
        return borrowedMoney;
    }

    /**   �ѽ赽���  borrowed_money   **/
    public void setBorrowedMoney(BigDecimal borrowedMoney) {
        this.borrowedMoney = borrowedMoney;
    }

    /**   ������  loan_money   **/
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**   ������  loan_money   **/
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**   ״̬(0��������1���ѻ���3�����ڣ���  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   ״̬(0��������1���ѻ���3�����ڣ���  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   ������Чʱ��  limit_time   **/
    public Date getLimitTime() {
        return limitTime;
    }

    /**   ������Чʱ��  limit_time   **/
    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    /**   ����ʱ��  payback_time   **/
    public Date getPaybackTime() {
        return paybackTime;
    }

    /**   ����ʱ��  payback_time   **/
    public void setPaybackTime(Date paybackTime) {
        this.paybackTime = paybackTime;
    }

    /**   �½�ʱ��  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   �½�ʱ��  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   ����ʱ��  update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**   ����ʱ��  update_time   **/
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

    /**   �����;  memo   **/
    public String getMemo() {
        return memo;
    }

    /**   �����;  memo   **/
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**   �������  rate   **/
    public BigDecimal getRate() {
        return rate;
    }

    /**   �������  rate   **/
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}