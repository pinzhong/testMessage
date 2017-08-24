package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_bankcard")
public class CreditBankcard {
    /**
     * 编号
     */
    @Id
    private Long authid;

    /**
     * 用户编号
     */
    @Column(name = "userId")
    private Long userid;

    /**
     * 认证时间
     */
    private Date createtime;

    /**
     * 是否通过
     */
    private int ispass;

    /**
     * 银行卡号
     */
    private String bankcard;

    /**
     * 身份证姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号码
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 银行卡类别
     */
    private String cardtype;

    /**
     * 提供商
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
    private int status;

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
    public int getIspass() {
        return ispass;
    }

    /**
     * 设置是否通过
     *
     * @param ispass 是否通过
     */
    public void setIspass(int ispass) {
        this.ispass = ispass;
    }

    /**
     * 获取银行卡号
     *
     * @return bankcard - 银行卡号
     */
    public String getBankcard() {
        return bankcard;
    }

    /**
     * 设置银行卡号
     *
     * @param bankcard 银行卡号
     */
    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    /**
     * 获取身份证姓名
     *
     * @return real_name - 身份证姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置身份证姓名
     *
     * @param realName 身份证姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
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
     * 获取银行名称
     *
     * @return bankname - 银行名称
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 设置银行名称
     *
     * @param bankname 银行名称
     */
    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    /**
     * 获取银行卡类别
     *
     * @return cardtype - 银行卡类别
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 设置银行卡类别
     *
     * @param cardtype 银行卡类别
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    /**
     * 获取提供商
     *
     * @return provider - 提供商
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置提供商
     *
     * @param provider 提供商
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
    public int getStatus() {
        return status;
    }

    /**
     * 设置状态（-1：失败；0：进行中；1：成功）
     *
     * @param status 状态（-1：失败；0：进行中；1：成功）
     */
    public void setStatus(int status) {
        this.status = status;
    }
}