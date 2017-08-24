package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_account_detail")
public class UserAccountDetail {
    /**
     * 编号
     */
    @Id
    @Column(name = "user_account_detail_id")
    private Long userAccountDetailId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 变动金额
     */
    private BigDecimal account;

    /**
     * 资金变动类型
     */
    private Integer type;

    /**
     * 资金变动事件编号
     */
    @Column(name = "event_id")
    private Long eventId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "surplus_account")
    private BigDecimal surplusAccount;

    /**
     * 获取编号
     *
     * @return user_account_detail_id - 编号
     */
    public Long getUserAccountDetailId() {
        return userAccountDetailId;
    }

    /**
     * 设置编号
     *
     * @param userAccountDetailId 编号
     */
    public void setUserAccountDetailId(Long userAccountDetailId) {
        this.userAccountDetailId = userAccountDetailId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取变动金额
     *
     * @return account - 变动金额
     */
    public BigDecimal getAccount() {
        return account;
    }

    /**
     * 设置变动金额
     *
     * @param account 变动金额
     */
    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    /**
     * 获取资金变动类型
     *
     * @return type - 资金变动类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置资金变动类型
     *
     * @param type 资金变动类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取资金变动事件编号
     *
     * @return event_id - 资金变动事件编号
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * 设置资金变动事件编号
     *
     * @param eventId 资金变动事件编号
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
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
     * @return surplus_account
     */
    public BigDecimal getSurplusAccount() {
        return surplusAccount;
    }

    /**
     * @param surplusAccount
     */
    public void setSurplusAccount(BigDecimal surplusAccount) {
        this.surplusAccount = surplusAccount;
    }
}