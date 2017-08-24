package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_invite_detail")
public class UserInviteDetail {
    @Id
    @Column(name = "user_invite_detail_id")
    private Long userInviteDetailId;

    /**
     * 主键ID
     */
    @Column(name = "user_invite_id")
    private Long userInviteId;

    /**
     * 借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）
     */
    private Integer type;

    /**
     * 一级邀请人产生的收益
     */
    private BigDecimal profit;

    /**
     * 对应的事件id
     */
    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return user_invite_detail_id
     */
    public Long getUserInviteDetailId() {
        return userInviteDetailId;
    }

    /**
     * @param userInviteDetailId
     */
    public void setUserInviteDetailId(Long userInviteDetailId) {
        this.userInviteDetailId = userInviteDetailId;
    }

    /**
     * 获取主键ID
     *
     * @return user_invite_id - 主键ID
     */
    public Long getUserInviteId() {
        return userInviteId;
    }

    /**
     * 设置主键ID
     *
     * @param userInviteId 主键ID
     */
    public void setUserInviteId(Long userInviteId) {
        this.userInviteId = userInviteId;
    }

    /**
     * 获取借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）
     *
     * @return type - 借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）
     *
     * @param type 借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取一级邀请人产生的收益
     *
     * @return profit - 一级邀请人产生的收益
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * 设置一级邀请人产生的收益
     *
     * @param profit 一级邀请人产生的收益
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * 获取对应的事件id
     *
     * @return event_id - 对应的事件id
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * 设置对应的事件id
     *
     * @param eventId 对应的事件id
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
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
}