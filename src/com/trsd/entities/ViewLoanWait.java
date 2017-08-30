package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "v_loan_wait")
public class ViewLoanWait {
    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "apply_money")
    private BigDecimal applyMoney;

    @Column(name = "loan_money")
    private BigDecimal loanMoney;

    @Column(name = "create_time")
    private Date createTime;

    private String memo;

    private BigDecimal rate;

    @Column(name = "loan_days")
    private Integer loanDays;

    private String type;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "fans_count")
    private Integer fansCount;

    @Column(name = "user_level")
    private Integer userLevel;

    private String credit;

    /**
     * @return loan_id
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * @param loanId
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return apply_money
     */
    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    /**
     * @param applyMoney
     */
    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    /**
     * @return loan_money
     */
    public BigDecimal getLoanMoney() {
        return loanMoney;
    }

    /**
     * @param loanMoney
     */
    public void setLoanMoney(BigDecimal loanMoney) {
        this.loanMoney = loanMoney;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * @param rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * @return loan_days
     */
    public Integer getLoanDays() {
        return loanDays;
    }

    /**
     * @param loanDays
     */
    public void setLoanDays(Integer loanDays) {
        this.loanDays = loanDays;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return fans_count
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * @param fansCount
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * @return user_level
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * @param userLevel
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * @return credit
     */
    public String getCredit() {
        return credit;
    }

    /**
     * @param credit
     */
    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }
}