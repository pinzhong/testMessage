package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_message_template")
public class MessageTemplate {
    /**
     * 主键编号
     */
    @Id
    @Column(name = "message_template_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageTemplateId;

    /**
     * 模板代码
     */
    private String code;

    /**
     * 消息类型
     */
    private Integer type;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 使用状态
     */
    private Integer status;

    private String title;

    @Column(name = "push_msg")
    private String pushMsg;

    /**
     * 获取主键编号
     *
     * @return message_template_id - 主键编号
     */
    public Long getMessageTemplateId() {
        return messageTemplateId;
    }

    /**
     * 设置主键编号
     *
     * @param messageTemplateId 主键编号
     */
    public void setMessageTemplateId(Long messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }

    /**
     * 获取模板代码
     *
     * @return code - 模板代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置模板代码
     *
     * @param code 模板代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取消息类型
     *
     * @return type - 消息类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置消息类型
     *
     * @param type 消息类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取消息内容
     *
     * @return content - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return push_msg
     */
    public String getPushMsg() {
        return pushMsg;
    }

    /**
     * @param pushMsg
     */
    public void setPushMsg(String pushMsg) {
        this.pushMsg = pushMsg == null ? null : pushMsg.trim();
    }
}