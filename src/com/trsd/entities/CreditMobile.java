package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_mobile")
public class CreditMobile {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authid;

    /**
     * 用户编号
     */
    @Column(name = "userId")
    private Long userid;

    /**
     * 用户电话号码
     */
    private String phone;

    /**
     * 认证时间
     */
    private Date createtime;

    /**
     * 是否通过
     */
    private Byte ispass;

    /**
     * 当前余额
     */
    private BigDecimal blance;

    /**
     * 会员积分
     */
    @Column(name = "vip_score")
    private String vipScore;

    /**
     * 运营商
     */
    private String isp;

    /**
     * 入网时间
     */
    private Date jointime;

    /**
     * 网龄
     */
    private String netage;

    /**
     * 号码归属地
     */
    private String location;

    /**
     * 运营商姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户等级
     */
    @Column(name = "vip_level")
    private String vipLevel;

    /**
     * 服务商
     */
    private String provider;

    /**
     * 通道token
     */
    private String token;

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
     * 获取用户编号
     *
     * @return userId - 用户编号
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户编号
     *
     * @param userid 用户编号
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取用户电话号码
     *
     * @return phone - 用户电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置用户电话号码
     *
     * @param phone 用户电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取认证时间
     *
     * @return createtime - 认证时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置认证时间
     *
     * @param createtime 认证时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取是否通过
     *
     * @return ispass - 是否通过
     */
    public Byte getIspass() {
        return ispass;
    }

    /**
     * 设置是否通过
     *
     * @param ispass 是否通过
     */
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**
     * 获取当前余额
     *
     * @return blance - 当前余额
     */
    public BigDecimal getBlance() {
        return blance;
    }

    /**
     * 设置当前余额
     *
     * @param blance 当前余额
     */
    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }

    /**
     * 获取会员积分
     *
     * @return vip_score - 会员积分
     */
    public String getVipScore() {
        return vipScore;
    }

    /**
     * 设置会员积分
     *
     * @param vipScore 会员积分
     */
    public void setVipScore(String vipScore) {
        this.vipScore = vipScore == null ? null : vipScore.trim();
    }

    /**
     * 获取运营商
     *
     * @return isp - 运营商
     */
    public String getIsp() {
        return isp;
    }

    /**
     * 设置运营商
     *
     * @param isp 运营商
     */
    public void setIsp(String isp) {
        this.isp = isp == null ? null : isp.trim();
    }

    /**
     * 获取入网时间
     *
     * @return jointime - 入网时间
     */
    public Date getJointime() {
        return jointime;
    }

    /**
     * 设置入网时间
     *
     * @param jointime 入网时间
     */
    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    /**
     * 获取网龄
     *
     * @return netage - 网龄
     */
    public String getNetage() {
        return netage;
    }

    /**
     * 设置网龄
     *
     * @param netage 网龄
     */
    public void setNetage(String netage) {
        this.netage = netage == null ? null : netage.trim();
    }

    /**
     * 获取号码归属地
     *
     * @return location - 号码归属地
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置号码归属地
     *
     * @param location 号码归属地
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 获取运营商姓名
     *
     * @return real_name - 运营商姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置运营商姓名
     *
     * @param realName 运营商姓名
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
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取用户等级
     *
     * @return vip_level - 用户等级
     */
    public String getVipLevel() {
        return vipLevel;
    }

    /**
     * 设置用户等级
     *
     * @param vipLevel 用户等级
     */
    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
    }

    /**
     * 获取服务商
     *
     * @return provider - 服务商
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置服务商
     *
     * @param provider 服务商
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * 获取通道token
     *
     * @return token - 通道token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置通道token
     *
     * @param token 通道token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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