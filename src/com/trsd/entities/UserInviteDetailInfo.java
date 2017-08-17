package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class UserInviteDetailInfo {
    /**   user_invite_detail_id **/
    private Long userInviteDetailId;

    /** 主键ID  user_invite_id **/
    private Long userInviteId;

    /** 借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）  type **/
    private Integer type;

    /** 一级邀请人产生的收益  profit **/
    private BigDecimal profit;

    /** 对应的事件id  event_id **/
    private Long eventId;

    /**   create_time **/
    private Date createTime;

    /**     user_invite_detail_id   **/
    public Long getUserInviteDetailId() {
        return userInviteDetailId;
    }

    /**     user_invite_detail_id   **/
    public void setUserInviteDetailId(Long userInviteDetailId) {
        this.userInviteDetailId = userInviteDetailId;
    }

    /**   主键ID  user_invite_id   **/
    public Long getUserInviteId() {
        return userInviteId;
    }

    /**   主键ID  user_invite_id   **/
    public void setUserInviteId(Long userInviteId) {
        this.userInviteId = userInviteId;
    }

    /**   借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）  type   **/
    public Integer getType() {
        return type;
    }

    /**   借款收益（借款人借到钱时产生的收益），投资收益（投资人收到利息时的收益）  type   **/
    public void setType(Integer type) {
        this.type = type;
    }

    /**   一级邀请人产生的收益  profit   **/
    public BigDecimal getProfit() {
        return profit;
    }

    /**   一级邀请人产生的收益  profit   **/
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**   对应的事件id  event_id   **/
    public Long getEventId() {
        return eventId;
    }

    /**   对应的事件id  event_id   **/
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**     create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**     create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}