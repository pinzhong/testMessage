package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_free_ticket")
public class FreeTicket {
    /**
     * 编号
     */
    @Id
    @Column(name = "free_ticket_id")
    private Long freeTicketId;

    /**
     * 使用金额
     */
    @Column(name = "freet_amount")
    private BigDecimal freetAmount;

    /**
     * 状态（未使用，已使用，已过期）
     */
    private Integer status;

    /**
     * 使用时间
     */
    @Column(name = "free_time")
    private Date freeTime;

    /**
     * 对应的长、短贷投资id
     */
    @Column(name = "pay_back_id")
    private Long payBackId;

    /**
     * 免息券类型
     */
    @Column(name = "free_type")
    private Integer freeType;

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
     * @return free_ticket_id - 编号
     */
    public Long getFreeTicketId() {
        return freeTicketId;
    }

    /**
     * 设置编号
     *
     * @param freeTicketId 编号
     */
    public void setFreeTicketId(Long freeTicketId) {
        this.freeTicketId = freeTicketId;
    }

    /**
     * 获取使用金额
     *
     * @return freet_amount - 使用金额
     */
    public BigDecimal getFreetAmount() {
        return freetAmount;
    }

    /**
     * 设置使用金额
     *
     * @param freetAmount 使用金额
     */
    public void setFreetAmount(BigDecimal freetAmount) {
        this.freetAmount = freetAmount;
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
     * @return free_time - 使用时间
     */
    public Date getFreeTime() {
        return freeTime;
    }

    /**
     * 设置使用时间
     *
     * @param freeTime 使用时间
     */
    public void setFreeTime(Date freeTime) {
        this.freeTime = freeTime;
    }

    /**
     * 获取对应的长、短贷投资id
     *
     * @return pay_back_id - 对应的长、短贷投资id
     */
    public Long getPayBackId() {
        return payBackId;
    }

    /**
     * 设置对应的长、短贷投资id
     *
     * @param payBackId 对应的长、短贷投资id
     */
    public void setPayBackId(Long payBackId) {
        this.payBackId = payBackId;
    }

    /**
     * 获取免息券类型
     *
     * @return free_type - 免息券类型
     */
    public Integer getFreeType() {
        return freeType;
    }

    /**
     * 设置免息券类型
     *
     * @param freeType 免息券类型
     */
    public void setFreeType(Integer freeType) {
        this.freeType = freeType;
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