package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_recharge_youyunbao_exception")
public class RechargeYouyunbaoException {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 第三方订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 处理时间
     */
    @Column(name = "process_time")
    private Date processTime;

    /**
     * 处理状态
     */
    private Integer status;

    /**
     * 最近操作时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取第三方订单编号
     *
     * @return order_no - 第三方订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置第三方订单编号
     *
     * @param orderNo 第三方订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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
     * 获取处理时间
     *
     * @return process_time - 处理时间
     */
    public Date getProcessTime() {
        return processTime;
    }

    /**
     * 设置处理时间
     *
     * @param processTime 处理时间
     */
    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    /**
     * 获取处理状态
     *
     * @return status - 处理状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置处理状态
     *
     * @param status 处理状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取最近操作时间
     *
     * @return update_time - 最近操作时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最近操作时间
     *
     * @param updateTime 最近操作时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}