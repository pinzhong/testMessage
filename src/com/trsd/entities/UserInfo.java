package com.trsd.entities;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键ID user_id **/
	private Long userId;

	/** 电话号码 phone **/
	private String phone;

	/** 用户昵称 nickname **/
	private String nickname;

	/** 用户姓名 real_name **/
	private String realName;

	/** 身份证号 certificate_no **/
	private String certificateNo;

	/** 登录密码 login_password **/
	private String loginPassword;

	/** 交易密码 trade_password **/
	private String tradePassword;

	/** QQ号 qq **/
	private String qq;

	/** 微信号 weixin **/
	private String weixin;

	/** 粉丝数 fans_count **/
	private Integer fansCount;

	/** 当前额度 credit_score **/
	private Integer creditScore;

	/** 借款用户等级 user_level **/
	private Integer userLevel;

	/** 金主等级 financier_level **/
	private Integer financierLevel;

	/** 用户状态 status **/
	private Integer status;

	/** 头像 headpic **/
	private String headpic;

	/** 邀请码 invite_code **/
	private String inviteCode;

	/** inviter_id **/
	private Long inviterId;

	/** qq登录openid qq_open_id **/
	private String qqOpenId;

	/** 微信登录openid weixin_unionid **/
	private String weixinUnionid;

	/** weixin_info **/
	private String weixinInfo;

	/** 加密串 encryptstr **/
	private String encryptstr;

	/** encryptstr1 **/
	private String encryptstr1;

	/** encryptstr2 **/
	private String encryptstr2;

	/** 最后登录时间 last_login_time **/
	private Date lastLoginTime;

	/** 最后登录ip last_login_ip **/
	private String lastLoginIp;

	/** 最后登录地点 last_login_location **/
	private String lastLoginLocation;

	/** 最后登录设备号 last_login_udid **/
	private String lastLoginUdid;

	/** create_time **/
	private Date createTime;

	/** update_time **/
	private Date updateTime;

	/** 版本号 version **/
	private Long version;

	/** 当前可用额度 available_score **/
	private Integer availableScore;

	/** 主键ID user_id **/
	public Long getUserId() {
		return userId;
	}

	/** 主键ID user_id **/
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/** 电话号码 phone **/
	public String getPhone() {
		return phone;
	}

	/** 电话号码 phone **/
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/** 用户昵称 nickname **/
	public String getNickname() {
		return nickname;
	}

	/** 用户昵称 nickname **/
	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	/** 用户姓名 real_name **/
	public String getRealName() {
		return realName;
	}

	/** 用户姓名 real_name **/
	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	/** 身份证号 certificate_no **/
	public String getCertificateNo() {
		return certificateNo;
	}

	/** 身份证号 certificate_no **/
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo == null ? null : certificateNo.trim();
	}

	/** 登录密码 login_password **/
	public String getLoginPassword() {
		return loginPassword;
	}

	/** 登录密码 login_password **/
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword == null ? null : loginPassword.trim();
	}

	/** 交易密码 trade_password **/
	public String getTradePassword() {
		return tradePassword;
	}

	/** 交易密码 trade_password **/
	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword == null ? null : tradePassword.trim();
	}

	/** QQ号 qq **/
	public String getQq() {
		return qq;
	}

	/** QQ号 qq **/
	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	/** 微信号 weixin **/
	public String getWeixin() {
		return weixin;
	}

	/** 微信号 weixin **/
	public void setWeixin(String weixin) {
		this.weixin = weixin == null ? null : weixin.trim();
	}

	/** 粉丝数 fans_count **/
	public Integer getFansCount() {
		return fansCount;
	}

	/** 粉丝数 fans_count **/
	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	/** 当前额度 credit_score **/
	public Integer getCreditScore() {
		return creditScore;
	}

	/** 当前额度 credit_score **/
	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}

	/** 借款用户等级 user_level **/
	public Integer getUserLevel() {
		return userLevel;
	}

	/** 借款用户等级 user_level **/
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	/** 金主等级 financier_level **/
	public Integer getFinancierLevel() {
		return financierLevel;
	}

	/** 金主等级 financier_level **/
	public void setFinancierLevel(Integer financierLevel) {
		this.financierLevel = financierLevel;
	}

	/** 用户状态 status **/
	public Integer getStatus() {
		return status;
	}

	/** 用户状态 status **/
	public void setStatus(Integer status) {
		this.status = status;
	}

	/** 头像 headpic **/
	public String getHeadpic() {
		return headpic;
	}

	/** 头像 headpic **/
	public void setHeadpic(String headpic) {
		this.headpic = headpic == null ? null : headpic.trim();
	}

	/** 邀请码 invite_code **/
	public String getInviteCode() {
		return inviteCode;
	}

	/** 邀请码 invite_code **/
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode == null ? null : inviteCode.trim();
	}

	/** inviter_id **/
	public Long getInviterId() {
		return inviterId;
	}

	/** inviter_id **/
	public void setInviterId(Long inviterId) {
		this.inviterId = inviterId;
	}

	/** qq登录openid qq_open_id **/
	public String getQqOpenId() {
		return qqOpenId;
	}

	/** qq登录openid qq_open_id **/
	public void setQqOpenId(String qqOpenId) {
		this.qqOpenId = qqOpenId == null ? null : qqOpenId.trim();
	}

	/** 微信登录openid weixin_unionid **/
	public String getWeixinUnionid() {
		return weixinUnionid;
	}

	/** 微信登录openid weixin_unionid **/
	public void setWeixinUnionid(String weixinUnionid) {
		this.weixinUnionid = weixinUnionid == null ? null : weixinUnionid.trim();
	}

	/** weixin_info **/
	public String getWeixinInfo() {
		return weixinInfo;
	}

	/** weixin_info **/
	public void setWeixinInfo(String weixinInfo) {
		this.weixinInfo = weixinInfo == null ? null : weixinInfo.trim();
	}

	/** 加密串 encryptstr **/
	public String getEncryptstr() {
		return encryptstr;
	}

	/** 加密串 encryptstr **/
	public void setEncryptstr(String encryptstr) {
		this.encryptstr = encryptstr == null ? null : encryptstr.trim();
	}

	/** encryptstr1 **/
	public String getEncryptstr1() {
		return encryptstr1;
	}

	/** encryptstr1 **/
	public void setEncryptstr1(String encryptstr1) {
		this.encryptstr1 = encryptstr1 == null ? null : encryptstr1.trim();
	}

	/** encryptstr2 **/
	public String getEncryptstr2() {
		return encryptstr2;
	}

	/** encryptstr2 **/
	public void setEncryptstr2(String encryptstr2) {
		this.encryptstr2 = encryptstr2 == null ? null : encryptstr2.trim();
	}

	/** 最后登录时间 last_login_time **/
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/** 最后登录时间 last_login_time **/
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/** 最后登录ip last_login_ip **/
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/** 最后登录ip last_login_ip **/
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
	}

	/** 最后登录地点 last_login_location **/
	public String getLastLoginLocation() {
		return lastLoginLocation;
	}

	/** 最后登录地点 last_login_location **/
	public void setLastLoginLocation(String lastLoginLocation) {
		this.lastLoginLocation = lastLoginLocation == null ? null : lastLoginLocation.trim();
	}

	/** 最后登录设备号 last_login_udid **/
	public String getLastLoginUdid() {
		return lastLoginUdid;
	}

	/** 最后登录设备号 last_login_udid **/
	public void setLastLoginUdid(String lastLoginUdid) {
		this.lastLoginUdid = lastLoginUdid == null ? null : lastLoginUdid.trim();
	}

	/** create_time **/
	public Date getCreateTime() {
		return createTime;
	}

	/** create_time **/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/** update_time **/
	public Date getUpdateTime() {
		return updateTime;
	}

	/** update_time **/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/** 版本号 version **/
	public Long getVersion() {
		return version;
	}

	/** 版本号 version **/
	public void setVersion(Long version) {
		this.version = version;
	}

	/** 当前可用额度 available_score **/
	public Integer getAvailableScore() {
		return availableScore;
	}

	/** 当前可用额度 available_score **/
	public void setAvailableScore(Integer availableScore) {
		this.availableScore = availableScore;
	}
}