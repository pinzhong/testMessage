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
     * 身份证正面
     */
    @Column(name = "idcard_front")
    private String idcardFront;

    /**
     * 身份证背面
     */
    @Column(name = "idcard_back")
    private String idcardBack;

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
    private Byte status;

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
     * 获取身份证正面
     *
     * @return idcard_front - 身份证正面
     */
    public String getIdcardFront() {
        return idcardFront;
    }

    /**
     * 设置身份证正面
     *
     * @param idcardFront 身份证正面
     */
    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront == null ? null : idcardFront.trim();
    }

    /**
     * 获取身份证背面
     *
     * @return idcard_back - 身份证背面
     */
    public String getIdcardBack() {
        return idcardBack;
    }

    /**
     * 设置身份证背面
     *
     * @param idcardBack 身份证背面
     */
    public void setIdcardBack(String idcardBack) {
        this.idcardBack = idcardBack == null ? null : idcardBack.trim();
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
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态（-1：失败；0：进行中；1：成功）
     *
     * @param status 状态（-1：失败；0：进行中；1：成功）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}