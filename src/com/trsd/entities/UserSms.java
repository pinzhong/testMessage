package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_sms")
public class UserSms {
    /**
     * 主键id
     */
    @Id
    @Column(name = "user_sms_id")
    private Long userSmsId;

    /**
     * 主键ID
     */
    private String phone;

    /**
     * 短信类型（验证码，提示短信）
     */
    private Integer type;

    /**
     * 使用状态
     */
    private Integer status;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 发送状态
     */
    private Integer code;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取主键id
     *
     * @return user_sms_id - 主键id
     */
    public Long getUserSmsId() {
        return userSmsId;
    }

    /**
     * 设置主键id
     *
     * @param userSmsId 主键id
     */
    public void setUserSmsId(Long userSmsId) {
        this.userSmsId = userSmsId;
    }

    /**
     * 获取主键ID
     *
     * @return phone - 主键ID
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置主键ID
     *
     * @param phone 主键ID
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取短信类型（验证码，提示短信）
     *
     * @return type - 短信类型（验证码，提示短信）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置短信类型（验证码，提示短信）
     *
     * @param type 短信类型（验证码，提示短信）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取使用状态
     *
     * @return status - 使用状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置使用状态
     *
     * @param status 使用状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取短信内容
     *
     * @return content - 短信内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置短信内容
     *
     * @param content 短信内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取发送状态
     *
     * @return code - 发送状态
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置发送状态
     *
     * @param code 发送状态
     */
    public void setCode(Integer code) {
        this.code = code;
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
}