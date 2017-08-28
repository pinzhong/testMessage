package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_config")
public class LoanConfig {
    /**
     * 主键id
     */
    @Id
    @Column(name = "loan_config_id")
    private Long loanConfigId;

    /**
     * 参数类型
     */
    private Integer type;

    /**
     * 参数值
     */
    private BigDecimal value;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 借款类型
     */
    @Column(name = "loan_type")
    private Integer loanType;

    /**
     * 长短贷申请编号
     */
    @Column(name = "loan_id")
    private Long loanId;

    /**
     * 获取主键id
     *
     * @return loan_config_id - 主键id
     */
    public Long getLoanConfigId() {
        return loanConfigId;
    }

    /**
     * 设置主键id
     *
     * @param loanConfigId 主键id
     */
    public void setLoanConfigId(Long loanConfigId) {
        this.loanConfigId = loanConfigId;
    }

    /**
     * 获取参数类型
     *
     * @return type - 参数类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置参数类型
     *
     * @param type 参数类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取参数值
     *
     * @return value - 参数值
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置参数值
     *
     * @param value 参数值
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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

    /**
     * 获取借款类型
     *
     * @return loan_type - 借款类型
     */
    public Integer getLoanType() {
        return loanType;
    }

    /**
     * 设置借款类型
     *
     * @param loanType 借款类型
     */
    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    /**
     * 获取长短贷申请编号
     *
     * @return loan_id - 长短贷申请编号
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * 设置长短贷申请编号
     *
     * @param loanId 长短贷申请编号
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }
}