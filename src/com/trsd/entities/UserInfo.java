package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class UserInfo {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private Date brithday;

    /**
     * 登录密码
     */
    @Column(name = "login_password")
    private String loginPassword;

    /**
     * 交易密码
     */
    @Column(name = "trade_password")
    private String tradePassword;

    /**
     * QQ号
     */
    private String qq;

    /**
     * 微信号
     */
    private String weixin;

    /**
     * 粉丝数
     */
    @Column(name = "fans_count")
    private Integer fansCount;

    /**
     * 当前额度
     */
    @Column(name = "credit_score")
    private BigDecimal creditScore;

    @Column(name = "zmxy_score")
    private Long zmxyScore;

    /**
     * 借款用户等级
     */
    @Column(name = "user_level")
    private Integer userLevel;

    /**
     * 金主等级
     */
    @Column(name = "financier_level")
    private Integer financierLevel;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 头像
     */
    private String headpic;

    /**
     * 邀请码
     */
    @Column(name = "invite_code")
    private String inviteCode;

    @Column(name = "inviter_id")
    private Long inviterId;

    /**
     * qq登录openid
     */
    @Column(name = "qq_open_id")
    private String qqOpenId;

    /**
     * 微信登录openid
     */
    @Column(name = "weixin_unionid")
    private String weixinUnionid;

    @Column(name = "weixin_info")
    private String weixinInfo;

    /**
     * 加密串
     */
    private String encryptstr;

    private String encryptstr1;

    private String encryptstr2;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 最后登录ip
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /**
     * 最后登录地点
     */
    @Column(name = "last_login_location")
    private String lastLoginLocation;

    /**
     * 最后登录设备号
     */
    @Column(name = "last_login_udid")
    private String lastLoginUdid;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 关注数
     */
    @Column(name = "follow_count")
    private Integer followCount;

    /**
     * 一级邀请码绑定人数
     */
    @Column(name = "invite_one_count")
    private Integer inviteOneCount;

    /**
     * 二级邀请码绑定人数
     */
    @Column(name = "invite_two_count")
    private Integer inviteTwoCount;

    /**
     * 用户类型，企业用户或个人用户
     */
    private Integer type;

    /**
     * 绑定的邀请码
     */
    @Column(name = "inviter_code")
    private String inviterCode;

    /**
     * 是否关注微信号 0 未关注 1 已关注
     */
    @Column(name = "is_follow")
    private Integer isFollow;

    /**
     * 借款资格
     */
    @Column(name = "borrow_flag")
    private String borrowFlag;

    /**
     * 投资资格（0：无；1：有）
     */
    @Column(name = "invest_flag")
    private String investFlag;

    @Column(name = "user_key")
    private String userKey;

    /**
     * 必须完成认证情况
     */
    @Column(name = "auth_status")
    private Integer authStatus;

    /**
     * 获取主键ID
     *
     * @return user_id - 主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键ID
     *
     * @param userId 主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取电话号码
     *
     * @return phone - 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话号码
     *
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取用户姓名
     *
     * @return real_name - 用户姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户姓名
     *
     * @param realName 用户姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取身份证号
     *
     * @return certificate_no - 身份证号
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设置身份证号
     *
     * @param certificateNo 身份证号
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取生日
     *
     * @return brithday - 生日
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * 设置生日
     *
     * @param brithday 生日
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * 获取登录密码
     *
     * @return login_password - 登录密码
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 设置登录密码
     *
     * @param loginPassword 登录密码
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * 获取交易密码
     *
     * @return trade_password - 交易密码
     */
    public String getTradePassword() {
        return tradePassword;
    }

    /**
     * 设置交易密码
     *
     * @param tradePassword 交易密码
     */
    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword == null ? null : tradePassword.trim();
    }

    /**
     * 获取QQ号
     *
     * @return qq - QQ号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ号
     *
     * @param qq QQ号
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 获取微信号
     *
     * @return weixin - 微信号
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置微信号
     *
     * @param weixin 微信号
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * 获取粉丝数
     *
     * @return fans_count - 粉丝数
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * 设置粉丝数
     *
     * @param fansCount 粉丝数
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * 获取当前额度
     *
     * @return credit_score - 当前额度
     */
    public BigDecimal getCreditScore() {
        return creditScore;
    }

    /**
     * 设置当前额度
     *
     * @param creditScore 当前额度
     */
    public void setCreditScore(BigDecimal creditScore) {
        this.creditScore = creditScore;
    }

    /**
     * @return zmxy_score
     */
    public Long getZmxyScore() {
        return zmxyScore;
    }

    /**
     * @param zmxyScore
     */
    public void setZmxyScore(Long zmxyScore) {
        this.zmxyScore = zmxyScore;
    }

    /**
     * 获取借款用户等级
     *
     * @return user_level - 借款用户等级
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * 设置借款用户等级
     *
     * @param userLevel 借款用户等级
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取金主等级
     *
     * @return financier_level - 金主等级
     */
    public Integer getFinancierLevel() {
        return financierLevel;
    }

    /**
     * 设置金主等级
     *
     * @param financierLevel 金主等级
     */
    public void setFinancierLevel(Integer financierLevel) {
        this.financierLevel = financierLevel;
    }

    /**
     * 获取用户状态
     *
     * @return status - 用户状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置用户状态
     *
     * @param status 用户状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取头像
     *
     * @return headpic - 头像
     */
    public String getHeadpic() {
        return headpic;
    }

    /**
     * 设置头像
     *
     * @param headpic 头像
     */
    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    /**
     * 获取邀请码
     *
     * @return invite_code - 邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码
     *
     * @param inviteCode 邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    /**
     * @return inviter_id
     */
    public Long getInviterId() {
        return inviterId;
    }

    /**
     * @param inviterId
     */
    public void setInviterId(Long inviterId) {
        this.inviterId = inviterId;
    }

    /**
     * 获取qq登录openid
     *
     * @return qq_open_id - qq登录openid
     */
    public String getQqOpenId() {
        return qqOpenId;
    }

    /**
     * 设置qq登录openid
     *
     * @param qqOpenId qq登录openid
     */
    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId == null ? null : qqOpenId.trim();
    }

    /**
     * 获取微信登录openid
     *
     * @return weixin_unionid - 微信登录openid
     */
    public String getWeixinUnionid() {
        return weixinUnionid;
    }

    /**
     * 设置微信登录openid
     *
     * @param weixinUnionid 微信登录openid
     */
    public void setWeixinUnionid(String weixinUnionid) {
        this.weixinUnionid = weixinUnionid == null ? null : weixinUnionid.trim();
    }

    /**
     * @return weixin_info
     */
    public String getWeixinInfo() {
        return weixinInfo;
    }

    /**
     * @param weixinInfo
     */
    public void setWeixinInfo(String weixinInfo) {
        this.weixinInfo = weixinInfo == null ? null : weixinInfo.trim();
    }

    /**
     * 获取加密串
     *
     * @return encryptstr - 加密串
     */
    public String getEncryptstr() {
        return encryptstr;
    }

    /**
     * 设置加密串
     *
     * @param encryptstr 加密串
     */
    public void setEncryptstr(String encryptstr) {
        this.encryptstr = encryptstr == null ? null : encryptstr.trim();
    }

    /**
     * @return encryptstr1
     */
    public String getEncryptstr1() {
        return encryptstr1;
    }

    /**
     * @param encryptstr1
     */
    public void setEncryptstr1(String encryptstr1) {
        this.encryptstr1 = encryptstr1 == null ? null : encryptstr1.trim();
    }

    /**
     * @return encryptstr2
     */
    public String getEncryptstr2() {
        return encryptstr2;
    }

    /**
     * @param encryptstr2
     */
    public void setEncryptstr2(String encryptstr2) {
        this.encryptstr2 = encryptstr2 == null ? null : encryptstr2.trim();
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取最后登录ip
     *
     * @return last_login_ip - 最后登录ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录ip
     *
     * @param lastLoginIp 最后登录ip
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * 获取最后登录地点
     *
     * @return last_login_location - 最后登录地点
     */
    public String getLastLoginLocation() {
        return lastLoginLocation;
    }

    /**
     * 设置最后登录地点
     *
     * @param lastLoginLocation 最后登录地点
     */
    public void setLastLoginLocation(String lastLoginLocation) {
        this.lastLoginLocation = lastLoginLocation == null ? null : lastLoginLocation.trim();
    }

    /**
     * 获取最后登录设备号
     *
     * @return last_login_udid - 最后登录设备号
     */
    public String getLastLoginUdid() {
        return lastLoginUdid;
    }

    /**
     * 设置最后登录设备号
     *
     * @param lastLoginUdid 最后登录设备号
     */
    public void setLastLoginUdid(String lastLoginUdid) {
        this.lastLoginUdid = lastLoginUdid == null ? null : lastLoginUdid.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取关注数
     *
     * @return follow_count - 关注数
     */
    public Integer getFollowCount() {
        return followCount;
    }

    /**
     * 设置关注数
     *
     * @param followCount 关注数
     */
    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    /**
     * 获取一级邀请码绑定人数
     *
     * @return invite_one_count - 一级邀请码绑定人数
     */
    public Integer getInviteOneCount() {
        return inviteOneCount;
    }

    /**
     * 设置一级邀请码绑定人数
     *
     * @param inviteOneCount 一级邀请码绑定人数
     */
    public void setInviteOneCount(Integer inviteOneCount) {
        this.inviteOneCount = inviteOneCount;
    }

    /**
     * 获取二级邀请码绑定人数
     *
     * @return invite_two_count - 二级邀请码绑定人数
     */
    public Integer getInviteTwoCount() {
        return inviteTwoCount;
    }

    /**
     * 设置二级邀请码绑定人数
     *
     * @param inviteTwoCount 二级邀请码绑定人数
     */
    public void setInviteTwoCount(Integer inviteTwoCount) {
        this.inviteTwoCount = inviteTwoCount;
    }

    /**
     * 获取用户类型，企业用户或个人用户
     *
     * @return type - 用户类型，企业用户或个人用户
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型，企业用户或个人用户
     *
     * @param type 用户类型，企业用户或个人用户
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取绑定的邀请码
     *
     * @return inviter_code - 绑定的邀请码
     */
    public String getInviterCode() {
        return inviterCode;
    }

    /**
     * 设置绑定的邀请码
     *
     * @param inviterCode 绑定的邀请码
     */
    public void setInviterCode(String inviterCode) {
        this.inviterCode = inviterCode == null ? null : inviterCode.trim();
    }

    /**
     * 获取是否关注微信号 0 未关注 1 已关注
     *
     * @return is_follow - 是否关注微信号 0 未关注 1 已关注
     */
    public Integer getIsFollow() {
        return isFollow;
    }

    /**
     * 设置是否关注微信号 0 未关注 1 已关注
     *
     * @param isFollow 是否关注微信号 0 未关注 1 已关注
     */
    public void setIsFollow(Integer isFollow) {
        this.isFollow = isFollow;
    }

    /**
     * 获取借款资格
     *
     * @return borrow_flag - 借款资格
     */
    public String getBorrowFlag() {
        return borrowFlag;
    }

    /**
     * 设置借款资格
     *
     * @param borrowFlag 借款资格
     */
    public void setBorrowFlag(String borrowFlag) {
        this.borrowFlag = borrowFlag == null ? null : borrowFlag.trim();
    }

    /**
     * 获取投资资格（0：无；1：有）
     *
     * @return invest_flag - 投资资格（0：无；1：有）
     */
    public String getInvestFlag() {
        return investFlag;
    }

    /**
     * 设置投资资格（0：无；1：有）
     *
     * @param investFlag 投资资格（0：无；1：有）
     */
    public void setInvestFlag(String investFlag) {
        this.investFlag = investFlag == null ? null : investFlag.trim();
    }

    /**
     * @return user_key
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * @param userKey
     */
    public void setUserKey(String userKey) {
        this.userKey = userKey == null ? null : userKey.trim();
    }

    /**
     * 获取必须完成认证情况
     *
     * @return auth_status - 必须完成认证情况
     */
    public Integer getAuthStatus() {
        return authStatus;
    }

    /**
     * 设置必须完成认证情况
     *
     * @param authStatus 必须完成认证情况
     */
    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }
}