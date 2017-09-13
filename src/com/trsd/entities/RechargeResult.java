package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_recharge_result")
public class RechargeResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 业务充值id 来自于t_recharge_youyunbao和t_recharge_easypay的主键
     */
    @Column(name = "business_recharge_id")
    private Long businessRechargeId;

    /**
     * 账务系统流水
     */
    @Column(name = "event_key")
    private String eventKey;

    /**
     * 支付提供商 1易生支付 2优云宝-支付宝 
     */
    @Column(name = "pay_provider")
    private Integer payProvider;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 状态 0 初始 1 成功  一般都处于成功状态
     */
    private Integer status;

    /**
     * 第三方支付流水
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 版本 并发控制
     */
    private Integer version;

    private String remark;

    /**
     * 充值金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 成功时间
     */
    @Column(name = "success_time")
    private Date successTime;

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
     * 获取业务充值id 来自于t_recharge_youyunbao和t_recharge_easypay的主键
     *
     * @return business_recharge_id - 业务充值id 来自于t_recharge_youyunbao和t_recharge_easypay的主键
     */
    public Long getBusinessRechargeId() {
        return businessRechargeId;
    }

    /**
     * 设置业务充值id 来自于t_recharge_youyunbao和t_recharge_easypay的主键
     *
     * @param businessRechargeId 业务充值id 来自于t_recharge_youyunbao和t_recharge_easypay的主键
     */
    public void setBusinessRechargeId(Long businessRechargeId) {
        this.businessRechargeId = businessRechargeId;
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
     * 获取支付提供商 1易生支付 2优云宝-支付宝 
     *
     * @return pay_provider - 支付提供商 1易生支付 2优云宝-支付宝 
     */
    public Integer getPayProvider() {
        return payProvider;
    }

    /**
     * 设置支付提供商 1易生支付 2优云宝-支付宝 
     *
     * @param payProvider 支付提供商 1易生支付 2优云宝-支付宝 
     */
    public void setPayProvider(Integer payProvider) {
        this.payProvider = payProvider;
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
     * 获取状态 0 初始 1 成功  一般都处于成功状态
     *
     * @return status - 状态 0 初始 1 成功  一般都处于成功状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0 初始 1 成功  一般都处于成功状态
     *
     * @param status 状态 0 初始 1 成功  一般都处于成功状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取充值金额
     *
     * @return amount - 充值金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置充值金额
     *
     * @param amount 充值金额
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
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