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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authid;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 认证时间
     */
    private Date createtime;

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
     * 业务凭证号
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 芝麻openid
     */
    private String openid;

    /**
     * 服务商
     */
    private String provider;

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
     * 获取业务凭证号
     *
     * @return transaction_id - 业务凭证号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置业务凭证号
     *
     * @param transactionId 业务凭证号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
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
}