package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_mobiletop")
public class CreditMobiletop {
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
     * 通话号码
     */
    private String callnumber;

    /**
     * 通话次数
     */
    private Integer callcount;

    /**
     * 归属地
     */
    private String location;

    /**
     * 通话时长（分钟）
     */
    private Integer callmin;

    /**
     * 最早联系时间
     */
    private Date firstcalltime;

    /**
     * 最晚联系时间
     */
    private Date lastcalltime;

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

    /**
     * 获取通话次数
     *
     * @return callcount - 通话次数
     */
    public Integer getCallcount() {
        return callcount;
    }

    /**
     * 设置通话次数
     *
     * @param callcount 通话次数
     */
    public void setCallcount(Integer callcount) {
        this.callcount = callcount;
    }

    /**
     * 获取归属地
     *
     * @return location - 归属地
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置归属地
     *
     * @param location 归属地
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * 获取通话时长（分钟）
     *
     * @return callmin - 通话时长（分钟）
     */
    public Integer getCallmin() {
        return callmin;
    }

    /**
     * 设置通话时长（分钟）
     *
     * @param callmin 通话时长（分钟）
     */
    public void setCallmin(Integer callmin) {
        this.callmin = callmin;
    }

    /**
     * 获取最早联系时间
     *
     * @return firstcalltime - 最早联系时间
     */
    public Date getFirstcalltime() {
        return firstcalltime;
    }

    /**
     * 设置最早联系时间
     *
     * @param firstcalltime 最早联系时间
     */
    public void setFirstcalltime(Date firstcalltime) {
        this.firstcalltime = firstcalltime;
    }

    /**
     * 获取最晚联系时间
     *
     * @return lastcalltime - 最晚联系时间
     */
    public Date getLastcalltime() {
        return lastcalltime;
    }

    /**
     * 设置最晚联系时间
     *
     * @param lastcalltime 最晚联系时间
     */
    public void setLastcalltime(Date lastcalltime) {
        this.lastcalltime = lastcalltime;
    }
}