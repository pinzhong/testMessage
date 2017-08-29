package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_zmxyscore")
public class CreditZmxyScore {
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
    private Byte realName;

    /**
     * 身份证号
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 芝麻openid
     */
    private String openid;

    /**
     * 芝麻分
     */
    @Column(name = "zmxy_score")
    private Integer zmxyScore;

    /**
     * 上次认证时间
     */
    @Column(name = "last_authtime")
    private Date lastAuthtime;

    /**
     * 上次认证分数
     */
    @Column(name = "last_score")
    private Integer lastScore;

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
    public Byte getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(Byte realName) {
        this.realName = realName;
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
     * 获取芝麻openid
     *
     * @return openid - 芝麻openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置芝麻openid
     *
     * @param openid 芝麻openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取芝麻分
     *
     * @return zmxy_score - 芝麻分
     */
    public Integer getZmxyScore() {
        return zmxyScore;
    }

    /**
     * 设置芝麻分
     *
     * @param zmxyScore 芝麻分
     */
    public void setZmxyScore(Integer zmxyScore) {
        this.zmxyScore = zmxyScore;
    }

    /**
     * 获取上次认证时间
     *
     * @return last_authtime - 上次认证时间
     */
    public Date getLastAuthtime() {
        return lastAuthtime;
    }

    /**
     * 设置上次认证时间
     *
     * @param lastAuthtime 上次认证时间
     */
    public void setLastAuthtime(Date lastAuthtime) {
        this.lastAuthtime = lastAuthtime;
    }

    /**
     * 获取上次认证分数
     *
     * @return last_score - 上次认证分数
     */
    public Integer getLastScore() {
        return lastScore;
    }

    /**
     * 设置上次认证分数
     *
     * @param lastScore 上次认证分数
     */
    public void setLastScore(Integer lastScore) {
        this.lastScore = lastScore;
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