package com.trsd.entities;

import java.util.Date;

public class CreditMobiletopInfo {
    /** ���  recordid **/
    private String recordid;

    /** ��֤���  authid **/
    private String authid;

    /** �û����  userId **/
    private Long userid;

    /** �û��绰����  phone **/
    private String phone;

    /** ��֤ʱ��  createtime **/
    private Date createtime;

    /** ͨ������  callnumber **/
    private String callnumber;

    /** ͨ������  calltime **/
    private Byte calltime;

    /** ������  location **/
    private String location;

    /** ͨ��ʱ�������ӣ�  callmin **/
    private Byte callmin;

    /** ������ϵʱ��  firstcalltime **/
    private Date firstcalltime;

    /** ������ϵʱ��  lastcalltime **/
    private Date lastcalltime;

    /**   ���  recordid   **/
    public String getRecordid() {
        return recordid;
    }

    /**   ���  recordid   **/
    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    /**   ��֤���  authid   **/
    public String getAuthid() {
        return authid;
    }

    /**   ��֤���  authid   **/
    public void setAuthid(String authid) {
        this.authid = authid == null ? null : authid.trim();
    }

    /**   �û����  userId   **/
    public Long getUserid() {
        return userid;
    }

    /**   �û����  userId   **/
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**   �û��绰����  phone   **/
    public String getPhone() {
        return phone;
    }

    /**   �û��绰����  phone   **/
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**   ��֤ʱ��  createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**   ��֤ʱ��  createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**   ͨ������  callnumber   **/
    public String getCallnumber() {
        return callnumber;
    }

    /**   ͨ������  callnumber   **/
    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber == null ? null : callnumber.trim();
    }

    /**   ͨ������  calltime   **/
    public Byte getCalltime() {
        return calltime;
    }

    /**   ͨ������  calltime   **/
    public void setCalltime(Byte calltime) {
        this.calltime = calltime;
    }

    /**   ������  location   **/
    public String getLocation() {
        return location;
    }

    /**   ������  location   **/
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**   ͨ��ʱ�������ӣ�  callmin   **/
    public Byte getCallmin() {
        return callmin;
    }

    /**   ͨ��ʱ�������ӣ�  callmin   **/
    public void setCallmin(Byte callmin) {
        this.callmin = callmin;
    }

    /**   ������ϵʱ��  firstcalltime   **/
    public Date getFirstcalltime() {
        return firstcalltime;
    }

    /**   ������ϵʱ��  firstcalltime   **/
    public void setFirstcalltime(Date firstcalltime) {
        this.firstcalltime = firstcalltime;
    }

    /**   ������ϵʱ��  lastcalltime   **/
    public Date getLastcalltime() {
        return lastcalltime;
    }

    /**   ������ϵʱ��  lastcalltime   **/
    public void setLastcalltime(Date lastcalltime) {
        this.lastcalltime = lastcalltime;
    }
}