package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_mobilerecord")
public class CreditMobilerecord {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordid;

    /**
     * 认证编号
     */
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
     * 通话时间
     */
    private Date calltime;

    /**
     * 通话时长（秒）
     */
    private Integer callsecond;

    /**
     * 通话地点
     */
    private String address;

    /**
     * 通话类型
     */
    private String calltype;

    /**
     * 通话号码
     */
    private String callnumber;

    /**
     * 获取编号
     *
     * @return recordid - 编号
     */
    public Long getRecordid() {
        return recordid;
    }

    /**
     * 设置编号
     *
     * @param recordid 编号
     */
    public void setRecordid(Long recordid) {
        this.recordid = recordid;
    }

    /**
     * 获取认证编号
     *
     * @return authid - 认证编号
     */
    public Long getAuthid() {
        return authid;
    }

    /**
     * 设置认证编号
     *
     * @param authid 认证编号
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
     * 获取通话时间
     *
     * @return calltime - 通话时间
     */
    public Date getCalltime() {
        return calltime;
    }

    /**
     * 设置通话时间
     *
     * @param calltime 通话时间
     */
    public void setCalltime(Date calltime) {
        this.calltime = calltime;
    }

    /**
     * 获取通话时长（秒）
     *
     * @return callsecond - 通话时长（秒）
     */
    public Integer getCallsecond() {
        return callsecond;
    }

    /**
     * 设置通话时长（秒）
     *
     * @param callsecond 通话时长（秒）
     */
    public void setCallsecond(Integer callsecond) {
        this.callsecond = callsecond;
    }

    /**
     * 获取通话地点
     *
     * @return address - 通话地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置通话地点
     *
     * @param address 通话地点
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取通话类型
     *
     * @return calltype - 通话类型
     */
    public String getCalltype() {
        return calltype;
    }

    /**
     * 设置通话类型
     *
     * @param calltype 通话类型
     */
    public void setCalltype(String calltype) {
        this.calltype = calltype == null ? null : calltype.trim();
    }

    /**
     * 获取通话号码
     *
     * @return callnumber - 通话号码
     */
    public String getCallnumber() {
        return callnumber;
    }

    /**
     * 设置通话号码
     *
     * @param callnumber 通话号码
     */
    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber == null ? null : callnumber.trim();
    }
}