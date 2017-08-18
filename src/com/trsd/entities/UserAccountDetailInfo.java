package com.trsd.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserAccountDetailInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 编号  user_account_detail_id **/
    private Long userAccountDetailId;

    /** 用户编号  user_id **/
    private Long userId;

    /** 变动金额  account **/
    private BigDecimal account;

    /** 资金变动类型  type **/
    private Integer type;

    /** 资金变动事件编号  event_id **/
    private Long eventId;

    /** 创建时间  create_time **/
    private Date createTime;

    /**   surplus_account **/
    private BigDecimal surplusAccount;

    /**   编号  user_account_detail_id   **/
    public Long getUserAccountDetailId() {
        return userAccountDetailId;
    }

    /**   编号  user_account_detail_id   **/
    public void setUserAccountDetailId(Long userAccountDetailId) {
        this.userAccountDetailId = userAccountDetailId;
    }

    /**   用户编号  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   用户编号  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   变动金额  account   **/
    public BigDecimal getAccount() {
        return account;
    }

    /**   变动金额  account   **/
    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    /**   资金变动类型  type   **/
    public Integer getType() {
        return type;
    }

    /**   资金变动类型  type   **/
    public void setType(Integer type) {
        this.type = type;
    }

    /**   资金变动事件编号  event_id   **/
    public Long getEventId() {
        return eventId;
    }

    /**   资金变动事件编号  event_id   **/
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**   创建时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   创建时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**     surplus_account   **/
    public BigDecimal getSurplusAccount() {
        return surplusAccount;
    }

    /**     surplus_account   **/
    public void setSurplusAccount(BigDecimal surplusAccount) {
        this.surplusAccount = surplusAccount;
    }
}