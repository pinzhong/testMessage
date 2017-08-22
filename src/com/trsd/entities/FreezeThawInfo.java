package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class FreezeThawInfo {
    /** 冻结解冻编号  freeze_thaw_id **/
    private Long freezeThawId;

    /** 主键ID  user_id **/
    private Long userId;

    /** 冻结解冻金额  account **/
    private BigDecimal account;

    /**   type **/
    private Integer type;

    /** 状态，0为冻结，1为解冻  status **/
    private Integer status;

    /** 冻结时间  freeze_time **/
    private Date freezeTime;

    /** 解冻时间  thaw_time **/
    private Date thawTime;

    /** create_time  create_time **/
    private Date createTime;

    /** update_time  update_time **/
    private Date updateTime;

    /** version  version **/
    private Long version;

    /**   冻结解冻编号  freeze_thaw_id   **/
    public Long getFreezeThawId() {
        return freezeThawId;
    }

    /**   冻结解冻编号  freeze_thaw_id   **/
    public void setFreezeThawId(Long freezeThawId) {
        this.freezeThawId = freezeThawId;
    }

    /**   主键ID  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   主键ID  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   冻结解冻金额  account   **/
    public BigDecimal getAccount() {
        return account;
    }

    /**   冻结解冻金额  account   **/
    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    /**     type   **/
    public Integer getType() {
        return type;
    }

    /**     type   **/
    public void setType(Integer type) {
        this.type = type;
    }

    /**   状态，0为冻结，1为解冻  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   状态，0为冻结，1为解冻  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   冻结时间  freeze_time   **/
    public Date getFreezeTime() {
        return freezeTime;
    }

    /**   冻结时间  freeze_time   **/
    public void setFreezeTime(Date freezeTime) {
        this.freezeTime = freezeTime;
    }

    /**   解冻时间  thaw_time   **/
    public Date getThawTime() {
        return thawTime;
    }

    /**   解冻时间  thaw_time   **/
    public void setThawTime(Date thawTime) {
        this.thawTime = thawTime;
    }

    /**   create_time  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   create_time  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   update_time  update_time   **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**   update_time  update_time   **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**   version  version   **/
    public Long getVersion() {
        return version;
    }

    /**   version  version   **/
    public void setVersion(Long version) {
        this.version = version;
    }
}