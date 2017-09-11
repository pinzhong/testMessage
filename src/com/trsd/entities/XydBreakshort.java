package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_xyd_break_short")
public class XydBreakshort {
    /**
     * 主键id
     */
    @Id
    @Column(name = "loan_short_id")
    private Long loanShortId;

    /**
     * 主键编号
     */
    @Column(name = "xyd_break_short_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long xydBreakShortId;

    /**
     * 待还违约金
     */
    @Column(name = "repayment_penalty")
    private BigDecimal repaymentPenalty;

    /**
     * 已还违约金
     */
    @Column(name = "payment_penalty")
    private BigDecimal paymentPenalty;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 还款状态
     */
    private Integer status;

    /**
     * 获取主键id
     *
     * @return loan_short_id - 主键id
     */
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**
     * 设置主键id
     *
     * @param loanShortId 主键id
     */
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**
     * 获取主键编号
     *
     * @return xyd_break_short_id - 主键编号
     */
    public Long getXydBreakShortId() {
        return xydBreakShortId;
    }

    /**
     * 设置主键编号
     *
     * @param xydBreakShortId 主键编号
     */
    public void setXydBreakShortId(Long xydBreakShortId) {
        this.xydBreakShortId = xydBreakShortId;
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
     * 获取已还违约金
     *
     * @return payment_penalty - 已还违约金
     */
    public BigDecimal getPaymentPenalty() {
        return paymentPenalty;
    }

    /**
     * 设置已还违约金
     *
     * @param paymentPenalty 已还违约金
     */
    public void setPaymentPenalty(BigDecimal paymentPenalty) {
        this.paymentPenalty = paymentPenalty;
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
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取还款状态
     *
     * @return status - 还款状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置还款状态
     *
     * @param status 还款状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}