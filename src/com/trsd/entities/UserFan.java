package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_fan")
public class UserFan {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "user_fan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userFanId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 粉丝用户id
     */
    @Column(name = "fan_id")
    private Long fanId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 事件编号
     */
    @Column(name = "event_id")
    private Long eventId;

    /**
     * 加粉事件类型
     */
    private Integer type;

    /**
     * 状态，-1失效，1有效
     */
    private Integer status;

    /**
     * 获取主键ID
     *
     * @return user_fan_id - 主键ID
     */
    public Long getUserFanId() {
        return userFanId;
    }

    /**
     * 设置主键ID
     *
     * @param userFanId 主键ID
     */
    public void setUserFanId(Long userFanId) {
        this.userFanId = userFanId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取粉丝用户id
     *
     * @return fan_id - 粉丝用户id
     */
    public Long getFanId() {
        return fanId;
    }

    /**
     * 设置粉丝用户id
     *
     * @param fanId 粉丝用户id
     */
    public void setFanId(Long fanId) {
        this.fanId = fanId;
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
     * 获取事件编号
     *
     * @return event_id - 事件编号
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * 设置事件编号
     *
     * @param eventId 事件编号
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * 获取加粉事件类型
     *
     * @return type - 加粉事件类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置加粉事件类型
     *
     * @param type 加粉事件类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取状态，-1失效，1有效
     *
     * @return status - 状态，-1失效，1有效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态，-1失效，1有效
     *
     * @param status 状态，-1失效，1有效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}