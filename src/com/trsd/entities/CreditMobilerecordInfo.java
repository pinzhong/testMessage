package com.trsd.entities;

import java.util.Date;

public class CreditMobilerecordInfo {
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

    /** ������¼��  ispass **/
    private Byte ispass;

    /** ͨ��ʱ��  calltime **/
    private Date calltime;

    /** ͨ��ʱ�����룩  callsecond **/
    private Integer callsecond;

    /** ͨ���ص�  address **/
    private String address;

    /** ͨ������  calltype **/
    private String calltype;

    /** ͨ������  callnumber **/
    private String callnumber;

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

    /**   ������¼��  ispass   **/
    public Byte getIspass() {
        return ispass;
    }

    /**   ������¼��  ispass   **/
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**   ͨ��ʱ��  calltime   **/
    public Date getCalltime() {
        return calltime;
    }

    /**   ͨ��ʱ��  calltime   **/
    public void setCalltime(Date calltime) {
        this.calltime = calltime;
    }

    /**   ͨ��ʱ�����룩  callsecond   **/
    public Integer getCallsecond() {
        return callsecond;
    }

    /**   ͨ��ʱ�����룩  callsecond   **/
    public void setCallsecond(Integer callsecond) {
        this.callsecond = callsecond;
    }

    /**   ͨ���ص�  address   **/
    public String getAddress() {
        return address;
    }

    /**   ͨ���ص�  address   **/
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**   ͨ������  calltype   **/
    public String getCalltype() {
        return calltype;
    }

    /**   ͨ������  calltype   **/
    public void setCalltype(String calltype) {
        this.calltype = calltype == null ? null : calltype.trim();
    }

    /**   ͨ������  callnumber   **/
    public String getCallnumber() {
        return callnumber;
    }

    /**   ͨ������  callnumber   **/
    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber == null ? null : callnumber.trim();
    }
}