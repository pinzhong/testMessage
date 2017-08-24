package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_short_config")
public class LoanShortConfig {
    /**
     * 主键id
     */
    @Id
    @Column(name = "loan_short_config_id")
    private Long loanShortConfigId;

    /**
     * 主键id
     */
    @Column(name = "loan_short_id")
    private Long loanShortId;

    /**
     * 参数类型
     */
    private Integer type;

    /**
     * 参数值
     */
    private Long value;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 获取主键id
     *
     * @return loan_short_config_id - 主键id
     */
    public Long getLoanShortConfigId() {
        return loanShortConfigId;
    }

    /**
     * 设置主键id
     *
     * @param loanShortConfigId 主键id
     */
    public void setLoanShortConfigId(Long loanShortConfigId) {
        this.loanShortConfigId = loanShortConfigId;
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
    public Long getValue() {
        return value;
    }

    /**
     * 设置参数值
     *
     * @param value 参数值
     */
    public void setValue(Long value) {
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
}