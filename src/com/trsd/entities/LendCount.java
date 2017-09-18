package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_count")
public class LendCount {
    /**
     * 主键编号
     */
    @Id
    @Column(name = "lend_count_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendCountId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 手动投出借金额
     */
    @Column(name = "all_manual")
    private BigDecimal allManual;

    /**
     * 自动投出借金额
     */
    @Column(name = "all_auto")
    private BigDecimal allAuto;

    /**
     * 手动投待收回金额
     */
    @Column(name = "repayment_manual")
    private BigDecimal repaymentManual;

    /**
     * 自动投待收金额
     */
    @Column(name = "repayment_auto")
    private BigDecimal repaymentAuto;

    /**
     * 手动投15天至30天逾期金额
     */
    @Column(name = "break_manual")
    private BigDecimal breakManual;

    /**
     * 自动投15天至30天逾期金额
     */
    @Column(name = "break_auto")
    private BigDecimal breakAuto;

    /**
     * 手动投30天以上逾期金额
     */
    @Column(name = "black_manual")
    private BigDecimal blackManual;

    /**
     * 自动投30天以上逾期金额
     */
    @Column(name = "black_auto")
    private BigDecimal blackAuto;

    @Column(name = "profit_manual")
    private BigDecimal profitManual;

    @Column(name = "profit_auto")
    private BigDecimal profitAuto;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取主键编号
     *
     * @return lend_count_id - 主键编号
     */
    public Long getLendCountId() {
        return lendCountId;
    }

    /**
     * 设置主键编号
     *
     * @param lendCountId 主键编号
     */
    public void setLendCountId(Long lendCountId) {
        this.lendCountId = lendCountId;
    }

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
     * 获取手动投出借金额
     *
     * @return all_manual - 手动投出借金额
     */
    public BigDecimal getAllManual() {
        return allManual;
    }

    /**
     * 设置手动投出借金额
     *
     * @param allManual 手动投出借金额
     */
    public void setAllManual(BigDecimal allManual) {
        this.allManual = allManual;
    }

    /**
     * 获取自动投出借金额
     *
     * @return all_auto - 自动投出借金额
     */
    public BigDecimal getAllAuto() {
        return allAuto;
    }

    /**
     * 设置自动投出借金额
     *
     * @param allAuto 自动投出借金额
     */
    public void setAllAuto(BigDecimal allAuto) {
        this.allAuto = allAuto;
    }

    /**
     * 获取手动投待收回金额
     *
     * @return repayment_manual - 手动投待收回金额
     */
    public BigDecimal getRepaymentManual() {
        return repaymentManual;
    }

    /**
     * 设置手动投待收回金额
     *
     * @param repaymentManual 手动投待收回金额
     */
    public void setRepaymentManual(BigDecimal repaymentManual) {
        this.repaymentManual = repaymentManual;
    }

    /**
     * 获取自动投待收金额
     *
     * @return repayment_auto - 自动投待收金额
     */
    public BigDecimal getRepaymentAuto() {
        return repaymentAuto;
    }

    /**
     * 设置自动投待收金额
     *
     * @param repaymentAuto 自动投待收金额
     */
    public void setRepaymentAuto(BigDecimal repaymentAuto) {
        this.repaymentAuto = repaymentAuto;
    }

    /**
     * 获取手动投15天至30天逾期金额
     *
     * @return break_manual - 手动投15天至30天逾期金额
     */
    public BigDecimal getBreakManual() {
        return breakManual;
    }

    /**
     * 设置手动投15天至30天逾期金额
     *
     * @param breakManual 手动投15天至30天逾期金额
     */
    public void setBreakManual(BigDecimal breakManual) {
        this.breakManual = breakManual;
    }

    /**
     * 获取自动投15天至30天逾期金额
     *
     * @return break_auto - 自动投15天至30天逾期金额
     */
    public BigDecimal getBreakAuto() {
        return breakAuto;
    }

    /**
     * 设置自动投15天至30天逾期金额
     *
     * @param breakAuto 自动投15天至30天逾期金额
     */
    public void setBreakAuto(BigDecimal breakAuto) {
        this.breakAuto = breakAuto;
    }

    /**
     * 获取手动投30天以上逾期金额
     *
     * @return black_manual - 手动投30天以上逾期金额
     */
    public BigDecimal getBlackManual() {
        return blackManual;
    }

    /**
     * 设置手动投30天以上逾期金额
     *
     * @param blackManual 手动投30天以上逾期金额
     */
    public void setBlackManual(BigDecimal blackManual) {
        this.blackManual = blackManual;
    }

    /**
     * 获取自动投30天以上逾期金额
     *
     * @return black_auto - 自动投30天以上逾期金额
     */
    public BigDecimal getBlackAuto() {
        return blackAuto;
    }

    /**
     * 设置自动投30天以上逾期金额
     *
     * @param blackAuto 自动投30天以上逾期金额
     */
    public void setBlackAuto(BigDecimal blackAuto) {
        this.blackAuto = blackAuto;
    }

    /**
     * @return profit_manual
     */
    public BigDecimal getProfitManual() {
        return profitManual;
    }

    /**
     * @param profitManual
     */
    public void setProfitManual(BigDecimal profitManual) {
        this.profitManual = profitManual;
    }

    /**
     * @return profit_auto
     */
    public BigDecimal getProfitAuto() {
        return profitAuto;
    }

    /**
     * @param profitAuto
     */
    public void setProfitAuto(BigDecimal profitAuto) {
        this.profitAuto = profitAuto;
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
}