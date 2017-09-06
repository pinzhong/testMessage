package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_mobilecontacts")
public class UserMobileContacts {
    /**
     * 主键id
     */
    @Id
    @Column(name = "contact_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 通讯录姓名
     */
    @Column(name = "contact_name")
    private String contactName;

    /**
     * 通讯录号码
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取主键id
     *
     * @return contact_id - 主键id
     */
    public Long getContactId() {
        return contactId;
    }

    /**
     * 设置主键id
     *
     * @param contactId 主键id
     */
    public void setContactId(Long contactId) {
        this.contactId = contactId;
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
     * 获取通讯录姓名
     *
     * @return contact_name - 通讯录姓名
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置通讯录姓名
     *
     * @param contactName 通讯录姓名
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取通讯录号码
     *
     * @return contact_phone - 通讯录号码
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置通讯录号码
     *
     * @param contactPhone 通讯录号码
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
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
}