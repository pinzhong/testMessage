package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_loan_long_config")
public class LoanLongScheme {
    /**
     * 长贷参数编号
     */
    @Id
    @Column(name = "loan_short_config_id")
    private Long loanShortConfigId;

    /**
     * 主键id
     */
    @Column(name = "loan_long_id")
    private Long loanLongId;

    /**
     * 参数类型
     */
    private Integer type;

    /**
     * 参数值
     */
    private BigDecimal value;

    @Column(name = "create_time")
    private Date createTime;

    private String handle;

    private Integer flag;

    /**
     * 获取长贷参数编号
     *
     * @return loan_short_config_id - 长贷参数编号
     */
    public Long getLoanShortConfigId() {
        return loanShortConfigId;
    }

    /**
     * 设置长贷参数编号
     *
     * @param loanShortConfigId 长贷参数编号
     */
    public void setLoanShortConfigId(Long loanShortConfigId) {
        this.loanShortConfigId = loanShortConfigId;
    }

    /**
     * 获取主键id
     *
     * @return loan_long_id - 主键id
     */
    public Long getLoanLongId() {
        return loanLongId;
    }

    /**
     * 设置主键id
     *
     * @param loanLongId 主键id
     */
    public void setLoanLongId(Long loanLongId) {
        this.loanLongId = loanLongId;
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
     * @return handle
     */
    public String getHandle() {
        return handle;
    }

    /**
     * @param handle
     */
    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}