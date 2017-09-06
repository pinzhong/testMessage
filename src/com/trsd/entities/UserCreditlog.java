package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_creditlog")
public class UserCreditlog {
    /**
     * 主键id
     */
    @Id
    @Column(name = "user_credit_id")
    private Long userCreditId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 变动分数
     */
    @Column(name = "credit_value")
    private Integer creditValue;

    /**
     * 变动类型
     */
    @Column(name = "credit_type")
    private Integer creditType;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "event_id")
    private Long eventId;

    private Integer type;

    /**
     * 获取主键id
     *
     * @return user_credit_id - 主键id
     */
    public Long getUserCreditId() {
        return userCreditId;
    }

    /**
     * 设置主键id
     *
     * @param userCreditId 主键id
     */
    public void setUserCreditId(Long userCreditId) {
        this.userCreditId = userCreditId;
    }

    /**
     * 获取主键ID
     *
     * @return user_id - 主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键ID
     *
     * @param userId 主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取变动分数
     *
     * @return credit_value - 变动分数
     */
    public Integer getCreditValue() {
        return creditValue;
    }

    /**
     * 设置变动分数
     *
     * @param creditValue 变动分数
     */
    public void setCreditValue(Integer creditValue) {
        this.creditValue = creditValue;
    }

    /**
     * 获取变动类型
     *
     * @return credit_type - 变动类型
     */
    public Integer getCreditType() {
        return creditType;
    }

    /**
     * 设置变动类型
     *
     * @param creditType 变动类型
     */
    public void setCreditType(Integer creditType) {
        this.creditType = creditType;
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
     * @return event_id
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * @param eventId
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}