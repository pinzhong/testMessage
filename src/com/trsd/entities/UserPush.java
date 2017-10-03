package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_push")
public class UserPush {
    /**
     * 主键id
     */
    @Id
    @Column(name = "user_push_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userPushId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 推送标题
     */
    @Column(name = "push_title")
    private String pushTitle;

    /**
     * 推送内容
     */
    @Column(name = "push_content")
    private String pushContent;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private Integer type;

    /**
     * 已读状态，0为未读，1为已读
     */
    private Integer status;

    private String content;

    /**
     * 获取主键id
     *
     * @return user_push_id - 主键id
     */
    public Long getUserPushId() {
        return userPushId;
    }

    /**
     * 设置主键id
     *
     * @param userPushId 主键id
     */
    public void setUserPushId(Long userPushId) {
        this.userPushId = userPushId;
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
     * 获取推送标题
     *
     * @return push_title - 推送标题
     */
    public String getPushTitle() {
        return pushTitle;
    }

    /**
     * 设置推送标题
     *
     * @param pushTitle 推送标题
     */
    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle == null ? null : pushTitle.trim();
    }

    /**
     * 获取推送内容
     *
     * @return push_content - 推送内容
     */
    public String getPushContent() {
        return pushContent;
    }

    /**
     * 设置推送内容
     *
     * @param pushContent 推送内容
     */
    public void setPushContent(String pushContent) {
        this.pushContent = pushContent == null ? null : pushContent.trim();
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
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取已读状态，0为未读，1为已读
     *
     * @return status - 已读状态，0为未读，1为已读
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置已读状态，0为未读，1为已读
     *
     * @param status 已读状态，0为未读，1为已读
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}