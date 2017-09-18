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
    private Boolean ispass;

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
     * 扣费编号
     */
    private Long freezeid;

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
     * 与通讯录匹配数量
     */
    @Column(name = "match_num")
    private Integer matchNum;

    /**
     * 人工审核状态（0：不需要；1：需要）
     */
    @Column(name = "manual_status")
    private Integer manualStatus;

    /**
     * 人工审核结果（0：不通过；1：通过）
     */
    @Column(name = "manual_result")
    private Integer manualResult;

    /**
     * 人工审核时间
     */
    @Column(name = "manual_time")
    private Date manualTime;

    /**
     * 人工审核人员
     */
    @Column(name = "manual_by")
    private String manualBy;

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
     * 获取扣费编号
     *
     * @return freezeid - 扣费编号
     */
    public Long getFreezeid() {
        return freezeid;
    }

    /**
     * 设置扣费编号
     *
     * @param freezeid 扣费编号
     */
    public void setFreezeid(Long freezeid) {
        this.freezeid = freezeid;
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

    /**
     * 获取与通讯录匹配数量
     *
     * @return match_num - 与通讯录匹配数量
     */
    public Integer getMatchNum() {
        return matchNum;
    }

    /**
     * 设置与通讯录匹配数量
     *
     * @param matchNum 与通讯录匹配数量
     */
    public void setMatchNum(Integer matchNum) {
        this.matchNum = matchNum;
    }

    /**
     * 获取人工审核状态（0：不需要；1：需要）
     *
     * @return manual_status - 人工审核状态（0：不需要；1：需要）
     */
    public Integer getManualStatus() {
        return manualStatus;
    }

    /**
     * 设置人工审核状态（0：不需要；1：需要）
     *
     * @param manualStatus 人工审核状态（0：不需要；1：需要）
     */
    public void setManualStatus(Integer manualStatus) {
        this.manualStatus = manualStatus;
    }

    /**
     * 获取人工审核结果（0：不通过；1：通过）
     *
     * @return manual_result - 人工审核结果（0：不通过；1：通过）
     */
    public Integer getManualResult() {
        return manualResult;
    }

    /**
     * 设置人工审核结果（0：不通过；1：通过）
     *
     * @param manualResult 人工审核结果（0：不通过；1：通过）
     */
    public void setManualResult(Integer manualResult) {
        this.manualResult = manualResult;
    }

    /**
     * 获取人工审核时间
     *
     * @return manual_time - 人工审核时间
     */
    public Date getManualTime() {
        return manualTime;
    }

    /**
     * 设置人工审核时间
     *
     * @param manualTime 人工审核时间
     */
    public void setManualTime(Date manualTime) {
        this.manualTime = manualTime;
    }

    /**
     * 获取人工审核人员
     *
     * @return manual_by - 人工审核人员
     */
    public String getManualBy() {
        return manualBy;
    }

    /**
     * 设置人工审核人员
     *
     * @param manualBy 人工审核人员
     */
    public void setManualBy(String manualBy) {
        this.manualBy = manualBy == null ? null : manualBy.trim();
    }
}