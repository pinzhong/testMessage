package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_recharge")
public class Recharge {
    @Id
    @Column(name = "recharge_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rechargeId;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "event_key")
    private String eventKey;

    @Column(name = "pay_type")
    private Integer payType;

    @Column(name = "business_type")
    private Integer businessType;

    @Column(name = "user_id")
    private Long userId;

    private Integer status;

    private Integer version;

    private String remark;

    private BigDecimal amount;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "bind_time")
    private Date bindTime;

    @Column(name = "sucess_time")
    private Date sucessTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return recharge_id
     */
    public Long getRechargeId() {
        return rechargeId;
    }

    /**
     * @param rechargeId
     */
    public void setRechargeId(Long rechargeId) {
        this.rechargeId = rechargeId;
    }

    /**
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * @return event_key
     */
    public String getEventKey() {
        return eventKey;
    }

    /**
     * @param eventKey
     */
    public void setEventKey(String eventKey) {
        this.eventKey = eventKey == null ? null : eventKey.trim();
    }

    /**
     * @return pay_type
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * @param payType
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * @return business_type
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * @param businessType
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
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
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * @return bind_time
     */
    public Date getBindTime() {
        return bindTime;
    }

    /**
     * @param bindTime
     */
    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    /**
     * @return sucess_time
     */
    public Date getSucessTime() {
        return sucessTime;
    }

    /**
     * @param sucessTime
     */
    public void setSucessTime(Date sucessTime) {
        this.sucessTime = sucessTime;
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
}