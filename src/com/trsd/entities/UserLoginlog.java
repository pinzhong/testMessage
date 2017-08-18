package com.trsd.entities;

import java.io.Serializable;
import java.util.Date;

public class UserLoginlog implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 主键ID
     */
    private Long userLoginId;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 最后登录时间
     */
    private Date loginTime;

    /**
     * 最后登录ip
     */
    private String loginIp;

    /**
     * 最后登录地点
     */
    private String loginLocation;

    /**
     * 最后登录设备号
     */
    private String loginUdid;

    /**
     * 主键ID
     * @return user_login_id 主键ID
     */
    public Long getUserLoginId() {
        return userLoginId;
    }

    /**
     * 主键ID
     * @param userLoginId 主键ID
     */
    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    /**
     * 用户编号
     * @return user_id 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户编号
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 最后登录时间
     * @return login_time 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 最后登录时间
     * @param loginTime 最后登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 最后登录ip
     * @return login_ip 最后登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 最后登录ip
     * @param loginIp 最后登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 最后登录地点
     * @return login_location 最后登录地点
     */
    public String getLoginLocation() {
        return loginLocation;
    }

    /**
     * 最后登录地点
     * @param loginLocation 最后登录地点
     */
    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation == null ? null : loginLocation.trim();
    }

    /**
     * 最后登录设备号
     * @return login_udid 最后登录设备号
     */
    public String getLoginUdid() {
        return loginUdid;
    }

    /**
     * 最后登录设备号
     * @param loginUdid 最后登录设备号
     */
    public void setLoginUdid(String loginUdid) {
        this.loginUdid = loginUdid == null ? null : loginUdid.trim();
    }
}