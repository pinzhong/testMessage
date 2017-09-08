package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_identity")
public class CreditIdentity {
    /**
     * 编号
     */
    @Id
    private Long authid;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 认证时间
     */
    private Date authtime;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private Date brithday;

    /**
     * 民族
     */
    private String nation;

    /**
     * 住址
     */
    private String address;

    /**
     * 发证机关
     */
    @Column(name = "issued_by")
    private String issuedBy;

    /**
     * 身份证正面照片
     */
    @Column(name = "idcard_front")
    private String idcardFront;

    /**
     * 手持身份证照片
     */
    @Column(name = "idcard_hand")
    private String idcardHand;

    /**
     * 是否通过
     */
    private Boolean ispass;

    /**
     * 认证提供商
     */
    private String provider;

    /**
     * 结束时间
     */
    private Date finishtime;

    /**
     * 费用
     */
    private BigDecimal cost;

    /**
     * 积分
     */
    private BigDecimal score;

    /**
     * 状态（-1：失败；0：进行中；1：成功）
     */
    private Integer status;

    /**
     * 扣费状态（0：未扣费；1：已扣费）
     */
    @Column(name = "charge_status")
    private Integer chargeStatus;

    /**
     * 积分状态（0：未加积分；1：已加积分）
     */
    @Column(name = "score_status")
    private Integer scoreStatus;

    /**
     * 获取编号
     *
     * @return authid - 编号
     */
    public Long getAuthid() {
        return authid;
    }

    /**
     * 设置编号
     *
     * @param authid 编号
     */
    public void setAuthid(Long authid) {
        this.authid = authid;
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
     * 获取认证时间
     *
     * @return authtime - 认证时间
     */
    public Date getAuthtime() {
        return authtime;
    }

    /**
     * 设置认证时间
     *
     * @param authtime 认证时间
     */
    public void setAuthtime(Date authtime) {
        this.authtime = authtime;
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
     * 获取身份证号
     *
     * @return certificate_no - 身份证号
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设置身份证号
     *
     * @param certificateNo 身份证号
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
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
     * 获取生日
     *
     * @return brithday - 生日
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * 设置生日
     *
     * @param brithday 生日
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * 获取住址
     *
     * @return address - 住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置住址
     *
     * @param address 住址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取发证机关
     *
     * @return issued_by - 发证机关
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * 设置发证机关
     *
     * @param issuedBy 发证机关
     */
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy == null ? null : issuedBy.trim();
    }

    /**
     * 获取身份证正面照片
     *
     * @return idcard_front - 身份证正面照片
     */
    public String getIdcardFront() {
        return idcardFront;
    }

    /**
     * 设置身份证正面照片
     *
     * @param idcardFront 身份证正面照片
     */
    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront == null ? null : idcardFront.trim();
    }

    /**
     * 获取手持身份证照片
     *
     * @return idcard_hand - 手持身份证照片
     */
    public String getIdcardHand() {
        return idcardHand;
    }

    /**
     * 设置手持身份证照片
     *
     * @param idcardHand 手持身份证照片
     */
    public void setIdcardHand(String idcardHand) {
        this.idcardHand = idcardHand == null ? null : idcardHand.trim();
    }

    /**
     * 获取是否通过
     *
     * @return ispass - 是否通过
     */
    public Boolean getIspass() {
        return ispass;
    }

    /**
     * 设置是否通过
     *
     * @param ispass 是否通过
     */
    public void setIspass(Boolean ispass) {
        this.ispass = ispass;
    }

    /**
     * 获取认证提供商
     *
     * @return provider - 认证提供商
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置认证提供商
     *
     * @param provider 认证提供商
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * 获取结束时间
     *
     * @return finishtime - 结束时间
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * 设置结束时间
     *
     * @param finishtime 结束时间
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * 获取费用
     *
     * @return cost - 费用
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置费用
     *
     * @param cost 费用
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * 获取积分
     *
     * @return score - 积分
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * 设置积分
     *
     * @param score 积分
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * 获取状态（-1：失败；0：进行中；1：成功）
     *
     * @return status - 状态（-1：失败；0：进行中；1：成功）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（-1：失败；0：进行中；1：成功）
     *
     * @param status 状态（-1：失败；0：进行中；1：成功）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取扣费状态（0：未扣费；1：已扣费）
     *
     * @return charge_status - 扣费状态（0：未扣费；1：已扣费）
     */
    public Integer getChargeStatus() {
        return chargeStatus;
    }

    /**
     * 设置扣费状态（0：未扣费；1：已扣费）
     *
     * @param chargeStatus 扣费状态（0：未扣费；1：已扣费）
     */
    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    /**
     * 获取积分状态（0：未加积分；1：已加积分）
     *
     * @return score_status - 积分状态（0：未加积分；1：已加积分）
     */
    public Integer getScoreStatus() {
        return scoreStatus;
    }

    /**
     * 设置积分状态（0：未加积分；1：已加积分）
     *
     * @param scoreStatus 积分状态（0：未加积分；1：已加积分）
     */
    public void setScoreStatus(Integer scoreStatus) {
        this.scoreStatus = scoreStatus;
    }
}