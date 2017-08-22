package com.trsd.entities;

import java.util.Date;

public class CreditMobiletopInfo {
    /** 编号  recordid **/
    private String recordid;

    /** 认证编号  authid **/
    private String authid;

    /** 用户编号  userId **/
    private Long userid;

    /** 用户电话号码  phone **/
    private String phone;

    /** 认证时间  createtime **/
    private Date createtime;

    /** 通话号码  callnumber **/
    private String callnumber;

    /** 通话次数  calltime **/
    private Byte calltime;

    /** 归属地  location **/
    private String location;

    /** 通话时长（分钟）  callmin **/
    private Byte callmin;

    /** 最早联系时间  firstcalltime **/
    private Date firstcalltime;

    /** 最晚联系时间  lastcalltime **/
    private Date lastcalltime;

    /**   编号  recordid   **/
    public String getRecordid() {
        return recordid;
    }

    /**   编号  recordid   **/
    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    /**   认证编号  authid   **/
    public String getAuthid() {
        return authid;
    }

    /**   认证编号  authid   **/
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

    /**   通话号码  callnumber   **/
    public String getCallnumber() {
        return callnumber;
    }

    /**   通话号码  callnumber   **/
    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber == null ? null : callnumber.trim();
    }

    /**   通话次数  calltime   **/
    public Byte getCalltime() {
        return calltime;
    }

    /**   通话次数  calltime   **/
    public void setCalltime(Byte calltime) {
        this.calltime = calltime;
    }

    /**   归属地  location   **/
    public String getLocation() {
        return location;
    }

    /**   归属地  location   **/
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**   通话时长（分钟）  callmin   **/
    public Byte getCallmin() {
        return callmin;
    }

    /**   通话时长（分钟）  callmin   **/
    public void setCallmin(Byte callmin) {
        this.callmin = callmin;
    }

    /**   最早联系时间  firstcalltime   **/
    public Date getFirstcalltime() {
        return firstcalltime;
    }

    /**   最早联系时间  firstcalltime   **/
    public void setFirstcalltime(Date firstcalltime) {
        this.firstcalltime = firstcalltime;
    }

    /**   最晚联系时间  lastcalltime   **/
    public Date getLastcalltime() {
        return lastcalltime;
    }

    /**   最晚联系时间  lastcalltime   **/
    public void setLastcalltime(Date lastcalltime) {
        this.lastcalltime = lastcalltime;
    }
}