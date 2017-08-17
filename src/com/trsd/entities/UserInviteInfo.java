package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class UserInviteInfo {
    /** 主键ID  user_invite_id **/
    private Long userInviteId;

    /** 主键ID  user_id **/
    private Long userId;

    /** 邀请人user_id  invite_user_id **/
    private Long inviteUserId;

    /** 邀请人借款收益（user借到钱时给一级邀请人产生的收益）  loan_profit **/
    private BigDecimal loanProfit;

    /** 邀请人利息收益（user收到利息时给一级邀请人产生的收益）  interest_profit **/
    private BigDecimal interestProfit;

    /** 邀请等级，一级二级  level **/
    private Integer level;

    /** 创建时间  create_time **/
    private Date createTime;

    /**   version **/
    private Long version;

    /**   主键ID  user_invite_id   **/
    public Long getUserInviteId() {
        return userInviteId;
    }

    /**   主键ID  user_invite_id   **/
    public void setUserInviteId(Long userInviteId) {
        this.userInviteId = userInviteId;
    }

    /**   主键ID  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   主键ID  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   邀请人user_id  invite_user_id   **/
    public Long getInviteUserId() {
        return inviteUserId;
    }

    /**   邀请人user_id  invite_user_id   **/
    public void setInviteUserId(Long inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    /**   邀请人借款收益（user借到钱时给一级邀请人产生的收益）  loan_profit   **/
    public BigDecimal getLoanProfit() {
        return loanProfit;
    }

    /**   邀请人借款收益（user借到钱时给一级邀请人产生的收益）  loan_profit   **/
    public void setLoanProfit(BigDecimal loanProfit) {
        this.loanProfit = loanProfit;
    }

    /**   邀请人利息收益（user收到利息时给一级邀请人产生的收益）  interest_profit   **/
    public BigDecimal getInterestProfit() {
        return interestProfit;
    }

    /**   邀请人利息收益（user收到利息时给一级邀请人产生的收益）  interest_profit   **/
    public void setInterestProfit(BigDecimal interestProfit) {
        this.interestProfit = interestProfit;
    }

    /**   邀请等级，一级二级  level   **/
    public Integer getLevel() {
        return level;
    }

    /**   邀请等级，一级二级  level   **/
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**   创建时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   创建时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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