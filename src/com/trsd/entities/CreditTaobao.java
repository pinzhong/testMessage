package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_taobao")
public class CreditTaobao {
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
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 是否通过
     */
    private Byte ispass;

    /**
     * 认证状态
     */
    @Column(name = "identity_status")
    private String identityStatus;

    /**
     * 用户等级
     */
    @Column(name = "vip_level")
    private String vipLevel;

    /**
     * 信用分
     */
    @Column(name = "credit_score")
    private BigDecimal creditScore;

    /**
     * 账户余额
     */
    @Column(name = "acc_bal")
    private BigDecimal accBal;

    /**
     * 余额宝余额
     */
    @Column(name = "yuebao_bal")
    private BigDecimal yuebaoBal;

    /**
     * 余额宝收益
     */
    @Column(name = "yuebao_income")
    private BigDecimal yuebaoIncome;

    /**
     * 花呗额度
     */
    @Column(name = "huabei_limit")
    private BigDecimal huabeiLimit;

    /**
     * 花呗可用额度
     */
    @Column(name = "huabei_aviable")
    private BigDecimal huabeiAviable;

    /**
     * 订单数量
     */
    @Column(name = "order_amount")
    private Integer orderAmount;

    /**
     * 订单总金额
     */
    @Column(name = "order_totalprice")
    private BigDecimal orderTotalprice;

    /**
     * 最后收货地址
     */
    @Column(name = "last_receiveaddress")
    private String lastReceiveaddress;

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
     * 扣费编号
     */
    private Long freezeid;

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
     * 与通讯录号码匹配数量
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
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
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
     * 获取认证状态
     *
     * @return identity_status - 认证状态
     */
    public String getIdentityStatus() {
        return identityStatus;
    }

    /**
     * 设置认证状态
     *
     * @param identityStatus 认证状态
     */
    public void setIdentityStatus(String identityStatus) {
        this.identityStatus = identityStatus == null ? null : identityStatus.trim();
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
     * 获取信用分
     *
     * @return credit_score - 信用分
     */
    public BigDecimal getCreditScore() {
        return creditScore;
    }

    /**
     * 设置信用分
     *
     * @param creditScore 信用分
     */
    public void setCreditScore(BigDecimal creditScore) {
        this.creditScore = creditScore;
    }

    /**
     * 获取账户余额
     *
     * @return acc_bal - 账户余额
     */
    public BigDecimal getAccBal() {
        return accBal;
    }

    /**
     * 设置账户余额
     *
     * @param accBal 账户余额
     */
    public void setAccBal(BigDecimal accBal) {
        this.accBal = accBal;
    }

    /**
     * 获取余额宝余额
     *
     * @return yuebao_bal - 余额宝余额
     */
    public BigDecimal getYuebaoBal() {
        return yuebaoBal;
    }

    /**
     * 设置余额宝余额
     *
     * @param yuebaoBal 余额宝余额
     */
    public void setYuebaoBal(BigDecimal yuebaoBal) {
        this.yuebaoBal = yuebaoBal;
    }

    /**
     * 获取余额宝收益
     *
     * @return yuebao_income - 余额宝收益
     */
    public BigDecimal getYuebaoIncome() {
        return yuebaoIncome;
    }

    /**
     * 设置余额宝收益
     *
     * @param yuebaoIncome 余额宝收益
     */
    public void setYuebaoIncome(BigDecimal yuebaoIncome) {
        this.yuebaoIncome = yuebaoIncome;
    }

    /**
     * 获取花呗额度
     *
     * @return huabei_limit - 花呗额度
     */
    public BigDecimal getHuabeiLimit() {
        return huabeiLimit;
    }

    /**
     * 设置花呗额度
     *
     * @param huabeiLimit 花呗额度
     */
    public void setHuabeiLimit(BigDecimal huabeiLimit) {
        this.huabeiLimit = huabeiLimit;
    }

    /**
     * 获取花呗可用额度
     *
     * @return huabei_aviable - 花呗可用额度
     */
    public BigDecimal getHuabeiAviable() {
        return huabeiAviable;
    }

    /**
     * 设置花呗可用额度
     *
     * @param huabeiAviable 花呗可用额度
     */
    public void setHuabeiAviable(BigDecimal huabeiAviable) {
        this.huabeiAviable = huabeiAviable;
    }

    /**
     * 获取订单数量
     *
     * @return order_amount - 订单数量
     */
    public Integer getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单数量
     *
     * @param orderAmount 订单数量
     */
    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取订单总金额
     *
     * @return order_totalprice - 订单总金额
     */
    public BigDecimal getOrderTotalprice() {
        return orderTotalprice;
    }

    /**
     * 设置订单总金额
     *
     * @param orderTotalprice 订单总金额
     */
    public void setOrderTotalprice(BigDecimal orderTotalprice) {
        this.orderTotalprice = orderTotalprice;
    }

    /**
     * 获取最后收货地址
     *
     * @return last_receiveaddress - 最后收货地址
     */
    public String getLastReceiveaddress() {
        return lastReceiveaddress;
    }

    /**
     * 设置最后收货地址
     *
     * @param lastReceiveaddress 最后收货地址
     */
    public void setLastReceiveaddress(String lastReceiveaddress) {
        this.lastReceiveaddress = lastReceiveaddress == null ? null : lastReceiveaddress.trim();
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
     * 获取与通讯录号码匹配数量
     *
     * @return match_num - 与通讯录号码匹配数量
     */
    public Integer getMatchNum() {
        return matchNum;
    }

    /**
     * 设置与通讯录号码匹配数量
     *
     * @param matchNum 与通讯录号码匹配数量
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