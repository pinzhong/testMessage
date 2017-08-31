package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_userfinish")
public class CreditUserfinish {
    /**
     * 编号
     */
    @Id
    @Column(name = "rec_id")
    private Integer recId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 认证类型
     */
    @Column(name = "credit_type")
    private Integer creditType;

    /**
     * 数据提供商
     */
    private String provider;

    /**
     * 认证时间
     */
    private Date finishtime;

    /**
     * 状态（0：失效；2：有效）
     */
    private Byte status;

    /**
     * 获取编号
     *
     * @return rec_id - 编号
     */
    public Integer getRecId() {
        return recId;
    }

    /**
     * 设置编号
     *
     * @param recId 编号
     */
    public void setRecId(Integer recId) {
        this.recId = recId;
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
     * 获取认证类型
     *
     * @return credit_type - 认证类型
     */
    public Integer getCreditType() {
        return creditType;
    }

    /**
     * 设置认证类型
     *
     * @param creditType 认证类型
     */
    public void setCreditType(Integer creditType) {
        this.creditType = creditType;
    }

    /**
     * 获取数据提供商
     *
     * @return provider - 数据提供商
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置数据提供商
     *
     * @param provider 数据提供商
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * 获取认证时间
     *
     * @return finishtime - 认证时间
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * 设置认证时间
     *
     * @param finishtime 认证时间
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * 获取状态（0：失效；2：有效）
     *
     * @return status - 状态（0：失效；2：有效）
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态（0：失效；2：有效）
     *
     * @param status 状态（0：失效；2：有效）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}