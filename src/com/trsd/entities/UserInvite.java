package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_invite")
public class UserInvite {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "user_invite_id")
    private Long userInviteId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 邀请人user_id
     */
    @Column(name = "invite_user_id")
    private Long inviteUserId;

    /**
     * 邀请人借款收益（user借到钱时给一级邀请人产生的收益）
     */
    @Column(name = "loan_profit")
    private BigDecimal loanProfit;

    /**
     * 邀请人利息收益（user收到利息时给一级邀请人产生的收益）
     */
    @Column(name = "interest_profit")
    private BigDecimal interestProfit;

    /**
     * 邀请等级，一级二级
     */
    private Integer level;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private Long version;

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
     * 获取邀请人user_id
     *
     * @return invite_user_id - 邀请人user_id
     */
    public Long getInviteUserId() {
        return inviteUserId;
    }

    /**
     * 设置邀请人user_id
     *
     * @param inviteUserId 邀请人user_id
     */
    public void setInviteUserId(Long inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    /**
     * 获取邀请人借款收益（user借到钱时给一级邀请人产生的收益）
     *
     * @return loan_profit - 邀请人借款收益（user借到钱时给一级邀请人产生的收益）
     */
    public BigDecimal getLoanProfit() {
        return loanProfit;
    }

    /**
     * 设置邀请人借款收益（user借到钱时给一级邀请人产生的收益）
     *
     * @param loanProfit 邀请人借款收益（user借到钱时给一级邀请人产生的收益）
     */
    public void setLoanProfit(BigDecimal loanProfit) {
        this.loanProfit = loanProfit;
    }

    /**
     * 获取邀请人利息收益（user收到利息时给一级邀请人产生的收益）
     *
     * @return interest_profit - 邀请人利息收益（user收到利息时给一级邀请人产生的收益）
     */
    public BigDecimal getInterestProfit() {
        return interestProfit;
    }

    /**
     * 设置邀请人利息收益（user收到利息时给一级邀请人产生的收益）
     *
     * @param interestProfit 邀请人利息收益（user收到利息时给一级邀请人产生的收益）
     */
    public void setInterestProfit(BigDecimal interestProfit) {
        this.interestProfit = interestProfit;
    }

    /**
     * 获取邀请等级，一级二级
     *
     * @return level - 邀请等级，一级二级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置邀请等级，一级二级
     *
     * @param level 邀请等级，一级二级
     */
    public void setLevel(Integer level) {
        this.level = level;
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
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}