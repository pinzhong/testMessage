package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_jingdong")
public class CreditJingdong {
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
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

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
     * 成长值
     */
    @Column(name = "growth_value")
    private BigDecimal growthValue;

    /**
     * 用户等级
     */
    @Column(name = "vip_level")
    private String vipLevel;

    /**
     * 白条开通状态
     */
    @Column(name = "baitiao_status")
    private String baitiaoStatus;

    /**
     * 白条总额度
     */
    @Column(name = "credit_limit")
    private BigDecimal creditLimit;

    /**
     * 白条可用余额
     */
    @Column(name = "available_limit")
    private BigDecimal availableLimit;

    /**
     * 白条月还款
     */
    @Column(name = "month_loan")
    private BigDecimal monthLoan;

    /**
     * 白条消费
     */
    @Column(name = "baitiao_consum")
    private BigDecimal baitiaoConsum;

    /**
     * 小白信用分
     */
    @Column(name = "xiaobai_creditvalue")
    private BigDecimal xiaobaiCreditvalue;

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
     * 最后下单时间
     */
    @Column(name = "last_orderdate")
    private Date lastOrderdate;

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
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
     * 获取成长值
     *
     * @return growth_value - 成长值
     */
    public BigDecimal getGrowthValue() {
        return growthValue;
    }

    /**
     * 设置成长值
     *
     * @param growthValue 成长值
     */
    public void setGrowthValue(BigDecimal growthValue) {
        this.growthValue = growthValue;
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
     * 获取白条开通状态
     *
     * @return baitiao_status - 白条开通状态
     */
    public String getBaitiaoStatus() {
        return baitiaoStatus;
    }

    /**
     * 设置白条开通状态
     *
     * @param baitiaoStatus 白条开通状态
     */
    public void setBaitiaoStatus(String baitiaoStatus) {
        this.baitiaoStatus = baitiaoStatus == null ? null : baitiaoStatus.trim();
    }

    /**
     * 获取白条总额度
     *
     * @return credit_limit - 白条总额度
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * 设置白条总额度
     *
     * @param creditLimit 白条总额度
     */
    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * 获取白条可用余额
     *
     * @return available_limit - 白条可用余额
     */
    public BigDecimal getAvailableLimit() {
        return availableLimit;
    }

    /**
     * 设置白条可用余额
     *
     * @param availableLimit 白条可用余额
     */
    public void setAvailableLimit(BigDecimal availableLimit) {
        this.availableLimit = availableLimit;
    }

    /**
     * 获取白条月还款
     *
     * @return month_loan - 白条月还款
     */
    public BigDecimal getMonthLoan() {
        return monthLoan;
    }

    /**
     * 设置白条月还款
     *
     * @param monthLoan 白条月还款
     */
    public void setMonthLoan(BigDecimal monthLoan) {
        this.monthLoan = monthLoan;
    }

    /**
     * 获取白条消费
     *
     * @return baitiao_consum - 白条消费
     */
    public BigDecimal getBaitiaoConsum() {
        return baitiaoConsum;
    }

    /**
     * 设置白条消费
     *
     * @param baitiaoConsum 白条消费
     */
    public void setBaitiaoConsum(BigDecimal baitiaoConsum) {
        this.baitiaoConsum = baitiaoConsum;
    }

    /**
     * 获取小白信用分
     *
     * @return xiaobai_creditvalue - 小白信用分
     */
    public BigDecimal getXiaobaiCreditvalue() {
        return xiaobaiCreditvalue;
    }

    /**
     * 设置小白信用分
     *
     * @param xiaobaiCreditvalue 小白信用分
     */
    public void setXiaobaiCreditvalue(BigDecimal xiaobaiCreditvalue) {
        this.xiaobaiCreditvalue = xiaobaiCreditvalue;
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
     * 获取最后下单时间
     *
     * @return last_orderdate - 最后下单时间
     */
    public Date getLastOrderdate() {
        return lastOrderdate;
    }

    /**
     * 设置最后下单时间
     *
     * @param lastOrderdate 最后下单时间
     */
    public void setLastOrderdate(Date lastOrderdate) {
        this.lastOrderdate = lastOrderdate;
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