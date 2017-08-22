package com.trsd.entities;

import java.util.Date;

public class CreditMobilerecordInfo {
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

    /** 京东登录名  ispass **/
    private Byte ispass;

    /** 通话时间  calltime **/
    private Date calltime;

    /** 通话时长（秒）  callsecond **/
    private Integer callsecond;

    /** 通话地点  address **/
    private String address;

    /** 通话类型  calltype **/
    private String calltype;

    /** 通话号码  callnumber **/
    private String callnumber;

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

    /**   京东登录名  ispass   **/
    public Byte getIspass() {
        return ispass;
    }

    /**   京东登录名  ispass   **/
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**   通话时间  calltime   **/
    public Date getCalltime() {
        return calltime;
    }

    /**   通话时间  calltime   **/
    public void setCalltime(Date calltime) {
        this.calltime = calltime;
    }

    /**   通话时长（秒）  callsecond   **/
    public Integer getCallsecond() {
        return callsecond;
    }

    /**   通话时长（秒）  callsecond   **/
    public void setCallsecond(Integer callsecond) {
        this.callsecond = callsecond;
    }

    /**   通话地点  address   **/
    public String getAddress() {
        return address;
    }

    /**   通话地点  address   **/
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**   通话类型  calltype   **/
    public String getCalltype() {
        return calltype;
    }

    /**   通话类型  calltype   **/
    public void setCalltype(String calltype) {
        this.calltype = calltype == null ? null : calltype.trim();
    }

    /**   通话号码  callnumber   **/
    public String getCallnumber() {
        return callnumber;
    }

    /**   通话号码  callnumber   **/
    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber == null ? null : callnumber.trim();
    }
}