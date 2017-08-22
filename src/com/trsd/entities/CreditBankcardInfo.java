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
    private BigDecimal bankcard;

    /** 身份证姓名  realname **/
    private String realname;

    /** 身份证号码  vip_score **/
    private String vipScore;

    /** 银行名称  bankname **/
    private String bankname;

    /** 银行卡类别  cardtype **/
    private String cardtype;

    /** 通道  channel **/
    private String channel;

    /** 通道token  token **/
    private String token;

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
    public BigDecimal getBankcard() {
        return bankcard;
    }

    /**   银行卡号  bankcard   **/
    public void setBankcard(BigDecimal bankcard) {
        this.bankcard = bankcard;
    }

    /**   身份证姓名  realname   **/
    public String getRealname() {
        return realname;
    }

    /**   身份证姓名  realname   **/
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**   身份证号码  vip_score   **/
    public String getVipScore() {
        return vipScore;
    }

    /**   身份证号码  vip_score   **/
    public void setVipScore(String vipScore) {
        this.vipScore = vipScore == null ? null : vipScore.trim();
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

    /**   通道  channel   **/
    public String getChannel() {
        return channel;
    }

    /**   通道  channel   **/
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**   通道token  token   **/
    public String getToken() {
        return token;
    }

    /**   通道token  token   **/
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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