package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_breach_photos")
public class BreachPhoto {
    /**
     * 编号
     */
    @Id
    @Column(name = "photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long photoId;

    /**
     * 关联编号
     */
    @Column(name = "ref_id")
    private Long refId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 违约类型(1:公示；2：申诉)
     */
    @Column(name = "breach_type")
    private Integer breachType;

    /**
     * 图片类型(1:内容；2：身份证正面；3：申诉证据照)
     */
    @Column(name = "photo_type")
    private Integer photoType;

    /**
     * 上传时间
     */
    @Column(name = "upload_time")
    private Date uploadTime;

    /**
     * 存储方式(1:OSS；2：本地）
     */
    @Column(name = "store_type")
    private Integer storeType;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 状态（0：不显示；1：显示）
     */
    @Column(name = "show_status")
    private Integer showStatus;

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

    public BreachPhoto(Long refId, Long userId, Integer breachType, Integer photoType, Date uploadTime,
			Integer storeType, String filename, Integer showStatus) {
		super();
		this.refId = refId;
		this.userId = userId;
		this.breachType = breachType;
		this.photoType = photoType;
		this.uploadTime = uploadTime;
		this.storeType = storeType;
		this.filename = filename;
		this.showStatus = showStatus;
	}

	public BreachPhoto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     * 获取编号
     *
     * @return photo_id - 编号
     */
    public Long getPhotoId() {
        return photoId;
    }

    /**
     * 设置编号
     *
     * @param photoId 编号
     */
    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    /**
     * 获取关联编号
     *
     * @return ref_id - 关联编号
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * 设置关联编号
     *
     * @param refId 关联编号
     */
    public void setRefId(Long refId) {
        this.refId = refId;
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
     * 获取违约类型(1:公示；2：申诉)
     *
     * @return breach_type - 违约类型(1:公示；2：申诉)
     */
    public Integer getBreachType() {
        return breachType;
    }

    /**
     * 设置违约类型(1:公示；2：申诉)
     *
     * @param breachType 违约类型(1:公示；2：申诉)
     */
    public void setBreachType(Integer breachType) {
        this.breachType = breachType;
    }

    /**
     * 获取图片类型(1:内容；2：手持身份证；3：身份证正面)
     *
     * @return photo_type - 图片类型(1:内容；2：手持身份证；3：身份证正面)
     */
    public Integer getPhotoType() {
        return photoType;
    }

    /**
     * 设置图片类型(1:内容；2：手持身份证；3：身份证正面)
     *
     * @param photoType 图片类型(1:内容；2：手持身份证；3：身份证正面)
     */
    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }

    /**
     * 获取上传时间
     *
     * @return upload_time - 上传时间
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * 设置上传时间
     *
     * @param uploadTime 上传时间
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 获取存储方式(1:OSS；2：本地）
     *
     * @return store_type - 存储方式(1:OSS；2：本地）
     */
    public Integer getStoreType() {
        return storeType;
    }

    /**
     * 设置存储方式(1:OSS；2：本地）
     *
     * @param storeType 存储方式(1:OSS；2：本地）
     */
    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    /**
     * 获取文件名称
     *
     * @return filename - 文件名称
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名称
     *
     * @param filename 文件名称
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * 获取状态（0：不显示；1：显示）
     *
     * @return show_status - 状态（0：不显示；1：显示）
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置状态（0：不显示；1：显示）
     *
     * @param showStatus 状态（0：不显示；1：显示）
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
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
}