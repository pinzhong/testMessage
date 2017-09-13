package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_recharge_easypay")
public class RechargeEasypay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 第三方支付流水
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 账务系统流水
     */
    @Column(name = "event_key")
    private String eventKey;

    /**
     * 支付类型
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 业务类型 默认为0
     */
    @Column(name = "business_type")
    private Integer businessType;

    /**
     * 实际充值金额
     */
    @Column(name = "real_amount")
    private BigDecimal realAmount;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 状态 0 初始 1通知成功 2调用账务系统成功
     */
    private Integer status;

    /**
     * 版本 并发控制
     */
    private Integer version;

    /**
     * 备注
     */
    private String remark;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 通知时间
     */
    @Column(name = "notify_time")
    private Date notifyTime;

    /**
     * 成功时间
     */
    @Column(name = "success_time")
    private Date successTime;

    /**
     * 最近更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取第三方支付流水
     *
     * @return order_no - 第三方支付流水
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置第三方支付流水
     *
     * @param orderNo 第三方支付流水
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取账务系统流水
     *
     * @return event_key - 账务系统流水
     */
    public String getEventKey() {
        return eventKey;
    }

    /**
     * 设置账务系统流水
     *
     * @param eventKey 账务系统流水
     */
    public void setEventKey(String eventKey) {
        this.eventKey = eventKey == null ? null : eventKey.trim();
    }

    /**
     * 获取支付类型
     *
     * @return pay_type - 支付类型
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付类型
     *
     * @param payType 支付类型
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取业务类型 默认为0
     *
     * @return business_type - 业务类型 默认为0
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型 默认为0
     *
     * @param businessType 业务类型 默认为0
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取实际充值金额
     *
     * @return real_amount - 实际充值金额
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 设置实际充值金额
     *
     * @param realAmount 实际充值金额
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取状态 0 初始 1通知成功 2调用账务系统成功
     *
     * @return status - 状态 0 初始 1通知成功 2调用账务系统成功
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0 初始 1通知成功 2调用账务系统成功
     *
     * @param status 状态 0 初始 1通知成功 2调用账务系统成功
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取版本 并发控制
     *
     * @return version - 版本 并发控制
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本 并发控制
     *
     * @param version 版本 并发控制
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * 获取通知时间
     *
     * @return notify_time - 通知时间
     */
    public Date getNotifyTime() {
        return notifyTime;
    }

    /**
     * 设置通知时间
     *
     * @param notifyTime 通知时间
     */
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    /**
     * 获取成功时间
     *
     * @return success_time - 成功时间
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置成功时间
     *
     * @param successTime 成功时间
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取最近更新时间
     *
     * @return update_time - 最近更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最近更新时间
     *
     * @param updateTime 最近更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}