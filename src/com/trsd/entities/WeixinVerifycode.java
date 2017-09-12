package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_weixin_verifycode")
public class WeixinVerifycode {
    @Id
    @Column(name = "weixin_verifycode_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer weixinVerifycodeId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "verify_code")
    private String verifyCode;

    private Integer state;

    @Column(name = "open_id")
    private String openId;

    @Column(name = "union_id")
    private String unionId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "success_time")
    private Date successTime;

    /**
     * @return weixin_verifycode_id
     */
    public Integer getWeixinVerifycodeId() {
        return weixinVerifycodeId;
    }

    /**
     * @param weixinVerifycodeId
     */
    public void setWeixinVerifycodeId(Integer weixinVerifycodeId) {
        this.weixinVerifycodeId = weixinVerifycodeId;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return verify_code
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * @param verifyCode
     */
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * @return union_id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * @param unionId
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
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
     * @return success_time
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * @param successTime
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }
}