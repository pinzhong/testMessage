package com.trsd.entities;

import javax.persistence.*;

@Table(name = "t_user_count")
public class UserCount {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 总借款笔数
     */
    @Column(name = "short_all_loan_count")
    private Integer shortAllLoanCount;

    @Column(name = "long_all_loan_count")
    private Integer longAllLoanCount;

    /**
     * 正常还款笔数
     */
    @Column(name = "short_payback_count")
    private Integer shortPaybackCount;

    @Column(name = "long_payback_count")
    private Integer longPaybackCount;

    /**
     * 提前还款笔数
     */
    @Column(name = "short_advance_count")
    private Integer shortAdvanceCount;

    @Column(name = "long_advance_count")
    private Integer longAdvanceCount;

    /**
     * 逾期笔数
     */
    @Column(name = "short_break_count")
    private Integer shortBreakCount;

    @Column(name = "long_break_count")
    private Integer longBreakCount;

    /**
     * 最长逾期天数
     */
    @Column(name = "short_break_days")
    private Integer shortBreakDays;

    @Column(name = "long_break_days")
    private Integer longBreakDays;

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
     * 获取总借款笔数
     *
     * @return short_all_loan_count - 总借款笔数
     */
    public Integer getShortAllLoanCount() {
        return shortAllLoanCount;
    }

    /**
     * 设置总借款笔数
     *
     * @param shortAllLoanCount 总借款笔数
     */
    public void setShortAllLoanCount(Integer shortAllLoanCount) {
        this.shortAllLoanCount = shortAllLoanCount;
    }

    /**
     * @return long_all_loan_count
     */
    public Integer getLongAllLoanCount() {
        return longAllLoanCount;
    }

    /**
     * @param longAllLoanCount
     */
    public void setLongAllLoanCount(Integer longAllLoanCount) {
        this.longAllLoanCount = longAllLoanCount;
    }

    /**
     * 获取正常还款笔数
     *
     * @return short_payback_count - 正常还款笔数
     */
    public Integer getShortPaybackCount() {
        return shortPaybackCount;
    }

    /**
     * 设置正常还款笔数
     *
     * @param shortPaybackCount 正常还款笔数
     */
    public void setShortPaybackCount(Integer shortPaybackCount) {
        this.shortPaybackCount = shortPaybackCount;
    }

    /**
     * @return long_payback_count
     */
    public Integer getLongPaybackCount() {
        return longPaybackCount;
    }

    /**
     * @param longPaybackCount
     */
    public void setLongPaybackCount(Integer longPaybackCount) {
        this.longPaybackCount = longPaybackCount;
    }

    /**
     * 获取提前还款笔数
     *
     * @return short_advance_count - 提前还款笔数
     */
    public Integer getShortAdvanceCount() {
        return shortAdvanceCount;
    }

    /**
     * 设置提前还款笔数
     *
     * @param shortAdvanceCount 提前还款笔数
     */
    public void setShortAdvanceCount(Integer shortAdvanceCount) {
        this.shortAdvanceCount = shortAdvanceCount;
    }

    /**
     * @return long_advance_count
     */
    public Integer getLongAdvanceCount() {
        return longAdvanceCount;
    }

    /**
     * @param longAdvanceCount
     */
    public void setLongAdvanceCount(Integer longAdvanceCount) {
        this.longAdvanceCount = longAdvanceCount;
    }

    /**
     * 获取逾期笔数
     *
     * @return short_break_count - 逾期笔数
     */
    public Integer getShortBreakCount() {
        return shortBreakCount;
    }

    /**
     * 设置逾期笔数
     *
     * @param shortBreakCount 逾期笔数
     */
    public void setShortBreakCount(Integer shortBreakCount) {
        this.shortBreakCount = shortBreakCount;
    }

    /**
     * @return long_break_count
     */
    public Integer getLongBreakCount() {
        return longBreakCount;
    }

    /**
     * @param longBreakCount
     */
    public void setLongBreakCount(Integer longBreakCount) {
        this.longBreakCount = longBreakCount;
    }

    /**
     * 获取最长逾期天数
     *
     * @return short_break_days - 最长逾期天数
     */
    public Integer getShortBreakDays() {
        return shortBreakDays;
    }

    /**
     * 设置最长逾期天数
     *
     * @param shortBreakDays 最长逾期天数
     */
    public void setShortBreakDays(Integer shortBreakDays) {
        this.shortBreakDays = shortBreakDays;
    }

    /**
     * @return long_break_days
     */
    public Integer getLongBreakDays() {
        return longBreakDays;
    }

    /**
     * @param longBreakDays
     */
    public void setLongBreakDays(Integer longBreakDays) {
        this.longBreakDays = longBreakDays;
    }
}