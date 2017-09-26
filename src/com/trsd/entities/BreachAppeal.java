package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_breach_appeal")
public class BreachAppeal {
    /**
     * 编号
     */
    @Id
    @Column(name = "appeal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appealId;

    /**
     * 违约公示编号
     */
    @Column(name = "notice_id")
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
     * 电话号码
     */
    private String phone;

    /**
     * 申诉原因
     */
    private String reson;
    
    /**
     * 封面图片
     */
    @Column(name="show_photo")
    private String showPhoto;

    /**
     * 状态（0：待处理；1：已处理）
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
     * 审核结果（0：驳回；1：成功受理）
     */
    @Column(name = "audit_result")
    private Integer auditResult;

    /**
     * 审核说明
     */
    @Column(name = "audit_remark")
    private String auditRemark;

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
     * @return appeal_id - 编号
     */
    public Long getAppealId() {
        return appealId;
    }

    /**
     * 设置编号
     *
     * @param appealId 编号
     */
    public void setAppealId(Long appealId) {
        this.appealId = appealId;
    }

    /**
     * 获取违约公示编号
     *
     * @return notice_id - 违约公示编号
     */
    public Long getNoticeId() {
        return noticeId;
    }

    /**
     * 设置违约公示编号
     *
     * @param noticeId 违约公示编号
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
     * 获取申诉原因
     *
     * @return reson - 申诉原因
     */
    public String getReson() {
        return reson;
    }

    /**
     * 设置申诉原因
     *
     * @param reson 申诉原因
     */
    public void setReson(String reson) {
        this.reson = reson == null ? null : reson.trim();
    }

    /**
     * 获取封面图片
     * @return
     */
    public String getShowPhoto() {
		return showPhoto;
	}

    /**
     * 设置封面图片
     * @param showPhoto
     */
	public void setShowPhoto(String showPhoto) {
		this.showPhoto = showPhoto;
	}

	/**
     * 获取状态（0：待处理；1：已处理）
     *
     * @return status - 状态（0：待处理；1：已处理）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0：待处理；1：已处理）
     *
     * @param status 状态（0：待处理；1：已处理）
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
     * 获取审核结果（0：驳回；1：成功受理）
     *
     * @return audit_result - 审核结果（0：驳回；1：成功受理）
     */
    public Integer getAuditResult() {
        return auditResult;
    }

    /**
     * 设置审核结果（0：驳回；1：成功受理）
     *
     * @param auditResult 审核结果（0：驳回；1：成功受理）
     */
    public void setAuditResult(Integer auditResult) {
        this.auditResult = auditResult;
    }

    /**
     * 获取审核说明
     *
     * @return audit_remark - 审核说明
     */
    public String getAuditRemark() {
        return auditRemark;
    }

    /**
     * 设置审核说明
     *
     * @param auditRemark 审核说明
     */
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
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