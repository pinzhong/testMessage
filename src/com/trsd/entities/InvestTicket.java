package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_invest_ticket")
public class InvestTicket {
    /**
     * 编号
     */
    @Id
    @Column(name = "invest_ticket_id")
    @GeneratedValue(generator = "JDBC")
    private Long investTicketId;

    /**
     * 使用金额
     */
    @Column(name = "invest_amount")
    private BigDecimal investAmount;

    /**
     * 状态（未使用，已使用，已过期）
     */
    private Integer status;

    /**
     * 使用时间
     */
    @Column(name = "invest_time")
    private Date investTime;

    /**
     * 对应的长、短贷投资id
     */
    @Column(name = "lend_id")
    private Long lendId;

    /**
     * 投资券类型
     */
    @Column(name = "invest_type")
    private Integer investType;

    /**
     * 过期时间
     */
    @Column(name = "limit_time")
    private Date limitTime;

    /**
     * 使用人
     */
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "create_time")
    private Date createTime;

    private Long version;

    /**
     * 获取编号
     *
     * @return invest_ticket_id - 编号
     */
    public Long getInvestTicketId() {
        return investTicketId;
    }

    /**
     * 设置编号
     *
     * @param investTicketId 编号
     */
    public void setInvestTicketId(Long investTicketId) {
        this.investTicketId = investTicketId;
    }

    /**
     * 获取使用金额
     *
     * @return invest_amount - 使用金额
     */
    public BigDecimal getInvestAmount() {
        return investAmount;
    }

    /**
     * 设置使用金额
     *
     * @param investAmount 使用金额
     */
    public void setInvestAmount(BigDecimal investAmount) {
        this.investAmount = investAmount;
    }

    /**
     * 获取状态（未使用，已使用，已过期）
     *
     * @return status - 状态（未使用，已使用，已过期）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（未使用，已使用，已过期）
     *
     * @param status 状态（未使用，已使用，已过期）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取使用时间
     *
     * @return invest_time - 使用时间
     */
    public Date getInvestTime() {
        return investTime;
    }

    /**
     * 设置使用时间
     *
     * @param investTime 使用时间
     */
    public void setInvestTime(Date investTime) {
        this.investTime = investTime;
    }

    /**
     * 获取对应的长、短贷投资id
     *
     * @return lend_id - 对应的长、短贷投资id
     */
    public Long getLendId() {
        return lendId;
    }

    /**
     * 设置对应的长、短贷投资id
     *
     * @param lendId 对应的长、短贷投资id
     */
    public void setLendId(Long lendId) {
        this.lendId = lendId;
    }

    /**
     * 获取投资券类型
     *
     * @return invest_type - 投资券类型
     */
    public Integer getInvestType() {
        return investType;
    }

    /**
     * 设置投资券类型
     *
     * @param investType 投资券类型
     */
    public void setInvestType(Integer investType) {
        this.investType = investType;
    }

    /**
     * 获取过期时间
     *
     * @return limit_time - 过期时间
     */
    public Date getLimitTime() {
        return limitTime;
    }

    /**
     * 设置过期时间
     *
     * @param limitTime 过期时间
     */
    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * 获取使用人
     *
     * @return user_id - 使用人
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置使用人
     *
     * @param userId 使用人
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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