package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class CreditMobileInfo {
    /** 编号  authid **/
    private String authid;

    /** 用户编号  userId **/
    private Long userid;

    /** 用户电话号码  phone **/
    private String phone;

    /** 认证时间  createtime **/
    private Date createtime;

    /** 京东登录名  ispass **/
    private Byte ispass;

    /** 当前余额  blance **/
    private BigDecimal blance;

    /** 会员积分  vip_score **/
    private String vipScore;

    /** 运营商  isp **/
    private String isp;

    /** 入网时间  jointime **/
    private Date jointime;

    /** 网龄  netage **/
    private String netage;

    /** 号码归属地  location **/
    private String location;

    /** 地址  address **/
    private String address;

    /** 用户等级  vip_level **/
    private String vipLevel;

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
    public String getAuthid() {
        return authid;
    }

    /**   编号  authid   **/
    public void setAuthid(String authid) {
        this.authid = authid == null ? null : authid.trim();
    }

    /**   用户编号  userId   **/
    public Long getUserid() {
        return userid;
    }

    /**   用户编号  userId   **/
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**   用户电话号码  phone   **/
    public String getPhone() {
        return phone;
    }

    /**   用户电话号码  phone   **/
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**   认证时间  createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**   认证时间  createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**   京东登录名  ispass   **/
    public Byte getIspass() {
        return ispass;
    }

    /**   京东登录名  ispass   **/
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**   当前余额  blance   **/
    public BigDecimal getBlance() {
        return blance;
    }

    /**   当前余额  blance   **/
    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }

    /**   会员积分  vip_score   **/
    public String getVipScore() {
        return vipScore;
    }

    /**   会员积分  vip_score   **/
    public void setVipScore(String vipScore) {
        this.vipScore = vipScore == null ? null : vipScore.trim();
    }

    /**   运营商  isp   **/
    public String getIsp() {
        return isp;
    }

    /**   运营商  isp   **/
    public void setIsp(String isp) {
        this.isp = isp == null ? null : isp.trim();
    }

    /**   入网时间  jointime   **/
    public Date getJointime() {
        return jointime;
    }

    /**   入网时间  jointime   **/
    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    /**   网龄  netage   **/
    public String getNetage() {
        return netage;
    }

    /**   网龄  netage   **/
    public void setNetage(String netage) {
        this.netage = netage == null ? null : netage.trim();
    }

    /**   号码归属地  location   **/
    public String getLocation() {
        return location;
    }

    /**   号码归属地  location   **/
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**   地址  address   **/
    public String getAddress() {
        return address;
    }

    /**   地址  address   **/
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**   用户等级  vip_level   **/
    public String getVipLevel() {
        return vipLevel;
    }

    /**   用户等级  vip_level   **/
    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
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