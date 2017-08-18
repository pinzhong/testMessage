package com.trsd.entities;

import java.io.Serializable;
import java.util.Date;

public class LoanShortConfigInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键id  loan_short_config_id **/
    private Long loanShortConfigId;

    /** 主键id  loan_short_id **/
    private Long loanShortId;

    /** 参数类型  type **/
    private Integer type;

    /** 参数值  value **/
    private Long value;

    /** 创建时间  createtime **/
    private Date createtime;

    /**   主键id  loan_short_config_id   **/
    public Long getLoanShortConfigId() {
        return loanShortConfigId;
    }

    /**   主键id  loan_short_config_id   **/
    public void setLoanShortConfigId(Long loanShortConfigId) {
        this.loanShortConfigId = loanShortConfigId;
    }

    /**   主键id  loan_short_id   **/
    public Long getLoanShortId() {
        return loanShortId;
    }

    /**   主键id  loan_short_id   **/
    public void setLoanShortId(Long loanShortId) {
        this.loanShortId = loanShortId;
    }

    /**   参数类型  type   **/
    public Integer getType() {
        return type;
    }

    /**   参数类型  type   **/
    public void setType(Integer type) {
        this.type = type;
    }

    /**   参数值  value   **/
    public Long getValue() {
        return value;
    }

    /**   参数值  value   **/
    public void setValue(Long value) {
        this.value = value;
    }

    /**   创建时间  createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**   创建时间  createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}