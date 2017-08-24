package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_loginlog")
public class UserLoginlog {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "user_login_id")
    private Long userLoginId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 最后登录ip
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 最后登录地点
     */
    @Column(name = "login_location")
    private String loginLocation;

    /**
     * 最后登录设备号
     */
    @Column(name = "login_udid")
    private String loginUdid;

    /**
     * 获取主键ID
     *
     * @return user_login_id - 主键ID
     */
    public Long getUserLoginId() {
        return userLoginId;
    }

    /**
     * 设置主键ID
     *
     * @param userLoginId 主键ID
     */
    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取最后登录时间
     *
     * @return login_time - 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param loginTime 最后登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取最后登录ip
     *
     * @return login_ip - 最后登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置最后登录ip
     *
     * @param loginIp 最后登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 获取最后登录地点
     *
     * @return login_location - 最后登录地点
     */
    public String getLoginLocation() {
        return loginLocation;
    }

    /**
     * 设置最后登录地点
     *
     * @param loginLocation 最后登录地点
     */
    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation == null ? null : loginLocation.trim();
    }

    /**
     * 获取最后登录设备号
     *
     * @return login_udid - 最后登录设备号
     */
    public String getLoginUdid() {
        return loginUdid;
    }

    /**
     * 设置最后登录设备号
     *
     * @param loginUdid 最后登录设备号
     */
    public void setLoginUdid(String loginUdid) {
        this.loginUdid = loginUdid == null ? null : loginUdid.trim();
    }
}