package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_short_detail")
public class LoanShortDetail {
    /**
     * 短贷借款人还款详细编号
     */
    @Id
    @Column(name = "loan_short_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanShortDetailId;

    /**
     * 主键id
     */
    @Column(name = "loan_short_id")
    private Long loanShortId;

    /**
     * 还款金额
     */
    @Column(name = "payback_money")
    private BigDecimal paybackMoney;

    /**
     * 还款状态
     */
    private Integer status;

    /**
     * 还款类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 获取短贷借款人还款详细编号
     *
     * @return loan_short_detail_id - 短贷借款人还款详细编号
     */
    public Long getLoanShortDetailId() {
        return loanShortDetailId;
    }

    /**
     * 设置短贷借款人还款详细编号
     *
     * @param loanShortDetailId 短贷借款人还款详细编号
     */
    public void setLoanShortDetailId(Long loanShortDetailId) {
        this.loanShortDetailId = loanShortDetailId;
    }

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
     * 获取还款金额
     *
     * @return payback_money - 还款金额
     */
    public BigDecimal getPaybackMoney() {
        return paybackMoney;
    }

    /**
     * 设置还款金额
     *
     * @param paybackMoney 还款金额
     */
    public void setPaybackMoney(BigDecimal paybackMoney) {
        this.paybackMoney = paybackMoney;
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

    /**
     * 获取还款类型
     *
     * @return type - 还款类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置还款类型
     *
     * @param type 还款类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}