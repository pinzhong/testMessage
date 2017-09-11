package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_long_detail")
public class LoanLongDetail {
    /**
     * 长贷借款人还款详细编号
     */
    @Id
    @Column(name = "loan_long_detail")
    private Long loanLongDetail;

    /**
     * 编号
     */
    @Column(name = "loan_payback_id")
    private Long loanPaybackId;

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
     * 还款时间
     */
    private Date createtime;

    /**
     * 获取长贷借款人还款详细编号
     *
     * @return loan_long_detail - 长贷借款人还款详细编号
     */
    public Long getLoanLongDetail() {
        return loanLongDetail;
    }

    /**
     * 设置长贷借款人还款详细编号
     *
     * @param loanLongDetail 长贷借款人还款详细编号
     */
    public void setLoanLongDetail(Long loanLongDetail) {
        this.loanLongDetail = loanLongDetail;
    }

    /**
     * 获取编号
     *
     * @return loan_payback_id - 编号
     */
    public Long getLoanPaybackId() {
        return loanPaybackId;
    }

    /**
     * 设置编号
     *
     * @param loanPaybackId 编号
     */
    public void setLoanPaybackId(Long loanPaybackId) {
        this.loanPaybackId = loanPaybackId;
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
     * 获取还款时间
     *
     * @return createtime - 还款时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置还款时间
     *
     * @param createtime 还款时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}