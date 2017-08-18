package com.trsd.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserAccountInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键  user_account_id **/
    private Long userAccountId;

    /** 主键ID  user_id **/
    private Long userId;

    /** 账户余额  balance **/
    private BigDecimal balance;

    /** 账户状态  status **/
    private Integer status;

    /**   create_time **/
    private Date createTime;

    /**   update_time **/
    private Date updateTime;

    /**   version **/
    private Long version;

    /**   主键  user_account_id   **/
    public Long getUserAccountId() {
        return userAccountId;
    }

    /**   主键  user_account_id   **/
    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    /**   主键ID  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   主键ID  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   账户余额  balance   **/
    public BigDecimal getBalance() {
        return balance;
    }

    /**   账户余额  balance   **/
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**   账户状态  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   账户状态  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**     create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**     create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**     update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**     update_time   **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**     version   **/
    public Long getVersion() {
        return version;
    }

    /**     version   **/
    public void setVersion(Long version) {
        this.version = version;
    }
}