package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_recharge_exception")
public class RechargeException {
    @Id
    @Column(name = "recharge_exception_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rechargeExceptionId;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "process_time")
    private Date processTime;

    private Integer status;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return recharge_exception_id
     */
    public Long getRechargeExceptionId() {
        return rechargeExceptionId;
    }

    /**
     * @param rechargeExceptionId
     */
    public void setRechargeExceptionId(Long rechargeExceptionId) {
        this.rechargeExceptionId = rechargeExceptionId;
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
     * @return process_time
     */
    public Date getProcessTime() {
        return processTime;
    }

    /**
     * @param processTime
     */
    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
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