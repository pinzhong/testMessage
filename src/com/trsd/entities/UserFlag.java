package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_flag")
public class UserFlag {
    /**
     * 编号
     */
    @Id
    @Column(name = "user_flag_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userFlagId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 标记类型
     */
    @Column(name = "flag_type")
    private Integer flagType;

    /**
     * 标记时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 标记状态
     */
    private Integer status;

    /**
     * 标记原因
     */
    @Column(name = "flag_reason")
    private String flagReason;

    /**
     * 获取编号
     *
     * @return user_flag_id - 编号
     */
    public Long getUserFlagId() {
        return userFlagId;
    }

    /**
     * 设置编号
     *
     * @param userFlagId 编号
     */
    public void setUserFlagId(Long userFlagId) {
        this.userFlagId = userFlagId;
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
     * 获取标记类型
     *
     * @return flag_type - 标记类型
     */
    public Integer getFlagType() {
        return flagType;
    }

    /**
     * 设置标记类型
     *
     * @param flagType 标记类型
     */
    public void setFlagType(Integer flagType) {
        this.flagType = flagType;
    }

    /**
     * 获取标记时间
     *
     * @return create_time - 标记时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置标记时间
     *
     * @param createTime 标记时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取标记状态
     *
     * @return status - 标记状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置标记状态
     *
     * @param status 标记状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取标记原因
     *
     * @return flag_reason - 标记原因
     */
    public String getFlagReason() {
        return flagReason;
    }

    /**
     * 设置标记原因
     *
     * @param flagReason 标记原因
     */
    public void setFlagReason(String flagReason) {
        this.flagReason = flagReason == null ? null : flagReason.trim();
    }
}