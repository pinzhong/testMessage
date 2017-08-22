package com.trsd.entities;

import java.util.Date;

public class CreditUserfinishInfo {
    /** 编号  rec_id **/
    private Integer recId;

    /** 用户编号  user_id **/
    private Long userId;

    /** 认证类型  credit_type **/
    private String creditType;

    /** 数据提供商  provider **/
    private String provider;

    /** 认证时间  finishtime **/
    private Date finishtime;

    /** 状态（0：失效；2：有效）  status **/
    private Byte status;

    /**   编号  rec_id   **/
    public Integer getRecId() {
        return recId;
    }

    /**   编号  rec_id   **/
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**   用户编号  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   用户编号  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   认证类型  credit_type   **/
    public String getCreditType() {
        return creditType;
    }

    /**   认证类型  credit_type   **/
    public void setCreditType(String creditType) {
        this.creditType = creditType == null ? null : creditType.trim();
    }

    /**   数据提供商  provider   **/
    public String getProvider() {
        return provider;
    }

    /**   数据提供商  provider   **/
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**   认证时间  finishtime   **/
    public Date getFinishtime() {
        return finishtime;
    }

    /**   认证时间  finishtime   **/
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**   状态（0：失效；2：有效）  status   **/
    public Byte getStatus() {
        return status;
    }

    /**   状态（0：失效；2：有效）  status   **/
    public void setStatus(Byte status) {
        this.status = status;
    }
}