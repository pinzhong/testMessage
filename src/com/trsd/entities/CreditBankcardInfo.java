package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class CreditBankcardInfo {
    /** 编号  authid **/
    private Long authid;

    /** 用户编号  userId **/
    private Long userid;

    /** 认证时间  createtime **/
    private Date createtime;

    /** 是否通过  ispass **/
    private Byte ispass;

    /** 银行卡号  bankcard **/
    private String bankcard;

    /** 身份证姓名  real_name **/
    private String realName;

    /** 身份证号码  certificate_no **/
    private String certificateNo;

    /** 银行名称  bankname **/
    private String bankname;

    /** 银行卡类别  cardtype **/
    private String cardtype;

    /** 提供商  provider **/
    private String provider;

    /** 结束时间  finishtime **/
    private Date finishtime;

    /** 费用  cost **/
    private BigDecimal cost;

    /** 积分  score **/
    private BigDecimal score;

    /** 状态（-1：失败；0：进行中；1：成功）  status **/
    private Byte status;

    /**   编号  authid   **/
    public Long getAuthid() {
        return authid;
    }

    /**   编号  authid   **/
    public void setAuthid(Long authid) {
        this.authid = authid;
    }

    /**   用户编号  userId   **/
    public Long getUserid() {
        return userid;
    }

    /**   用户编号  userId   **/
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**   认证时间  createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**   认证时间  createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**   是否通过  ispass   **/
    public Byte getIspass() {
        return ispass;
    }

    /**   是否通过  ispass   **/
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**   银行卡号  bankcard   **/
    public String getBankcard() {
        return bankcard;
    }

    /**   银行卡号  bankcard   **/
    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    /**   身份证姓名  real_name   **/
    public String getRealName() {
        return realName;
    }

    /**   身份证姓名  real_name   **/
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**   身份证号码  certificate_no   **/
    public String getCertificateNo() {
        return certificateNo;
    }

    /**   身份证号码  certificate_no   **/
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**   银行名称  bankname   **/
    public String getBankname() {
        return bankname;
    }

    /**   银行名称  bankname   **/
    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    /**   银行卡类别  cardtype   **/
    public String getCardtype() {
        return cardtype;
    }

    /**   银行卡类别  cardtype   **/
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    /**   提供商  provider   **/
    public String getProvider() {
        return provider;
    }

    /**   提供商  provider   **/
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**   结束时间  finishtime   **/
    public Date getFinishtime() {
        return finishtime;
    }

    /**   结束时间  finishtime   **/
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**   费用  cost   **/
    public BigDecimal getCost() {
        return cost;
    }

    /**   费用  cost   **/
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**   积分  score   **/
    public BigDecimal getScore() {
        return score;
    }

    /**   积分  score   **/
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**   状态（-1：失败；0：进行中；1：成功）  status   **/
    public Byte getStatus() {
        return status;
    }

    /**   状态（-1：失败；0：进行中；1：成功）  status   **/
    public void setStatus(Byte status) {
        this.status = status;
    }
}