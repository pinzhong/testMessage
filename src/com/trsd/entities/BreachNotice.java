package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_breach_notice")
public class BreachNotice {
    /**
     * 编号
     */
    @Id
    @Column(name = "notice_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noticeId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 身份证号码
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 标题
     */
    private String ttitle;

    /**
     * 内容
     */
    private String content;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 地区
     */
    private String area;

    /**
     * 类型
     */
    private Integer type;

    @Column(name = "show_photo")
    private String showPhoto;

    /**
     * 状态（0：待审核；1：发布中；-1：审核失败）
     */
    private Integer status;

    /**
     * 审核时间
     */
    @Column(name = "audit_time")
    private Date auditTime;

    /**
     * 审核人
     */
    @Column(name = "audit_by")
    private String auditBy;

    /**
     * 撤销状态（0：未撤销；1：已撤销）
     */
    @Column(name = "revoke_status")
    private Integer revokeStatus;

    /**
     * 撤销人
     */
    @Column(name = "revoke_by")
    private String revokeBy;

    /**
     * 撤销时间
     */
    @Column(name = "revoke_time")
    private Date revokeTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取编号
     *
     * @return notice_id - 编号
     */
    public Long getNoticeId() {
        return noticeId;
    }

    /**
     * 设置编号
     *
     * @param noticeId 编号
     */
    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
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
     * 获取身份证号码
     *
     * @return certificate_no - 身份证号码
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设置身份证号码
     *
     * @param certificateNo 身份证号码
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**
     * 获取姓名
     *
     * @return real_name - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取标题
     *
     * @return ttitle - 标题
     */
    public String getTtitle() {
        return ttitle;
    }

    /**
     * 设置标题
     *
     * @param ttitle 标题
     */
    public void setTtitle(String ttitle) {
        this.ttitle = ttitle == null ? null : ttitle.trim();
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取地区
     *
     * @return area - 地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置地区
     *
     * @param area 地区
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return show_photo
     */
    public String getShowPhoto() {
        return showPhoto;
    }

    /**
     * @param showPhoto
     */
    public void setShowPhoto(String showPhoto) {
        this.showPhoto = showPhoto == null ? null : showPhoto.trim();
    }

    /**
     * 获取状态（0：待审核；1：发布中；-1：审核失败）
     *
     * @return status - 状态（0：待审核；1：发布中；-1：审核失败）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0：待审核；1：发布中；-1：审核失败）
     *
     * @param status 状态（0：待审核；1：发布中；-1：审核失败）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取审核时间
     *
     * @return audit_time - 审核时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置审核时间
     *
     * @param auditTime 审核时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 获取审核人
     *
     * @return audit_by - 审核人
     */
    public String getAuditBy() {
        return auditBy;
    }

    /**
     * 设置审核人
     *
     * @param auditBy 审核人
     */
    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy == null ? null : auditBy.trim();
    }

    /**
     * 获取撤销状态（0：未撤销；1：已撤销）
     *
     * @return revoke_status - 撤销状态（0：未撤销；1：已撤销）
     */
    public Integer getRevokeStatus() {
        return revokeStatus;
    }

    /**
     * 设置撤销状态（0：未撤销；1：已撤销）
     *
     * @param revokeStatus 撤销状态（0：未撤销；1：已撤销）
     */
    public void setRevokeStatus(Integer revokeStatus) {
        this.revokeStatus = revokeStatus;
    }

    /**
     * 获取撤销人
     *
     * @return revoke_by - 撤销人
     */
    public String getRevokeBy() {
        return revokeBy;
    }

    /**
     * 设置撤销人
     *
     * @param revokeBy 撤销人
     */
    public void setRevokeBy(String revokeBy) {
        this.revokeBy = revokeBy == null ? null : revokeBy.trim();
    }

    /**
     * 获取撤销时间
     *
     * @return revoke_time - 撤销时间
     */
    public Date getRevokeTime() {
        return revokeTime;
    }

    /**
     * 设置撤销时间
     *
     * @param revokeTime 撤销时间
     */
    public void setRevokeTime(Date revokeTime) {
        this.revokeTime = revokeTime;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}