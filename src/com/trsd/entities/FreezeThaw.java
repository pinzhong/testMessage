package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_freeze_thaw")
public class FreezeThaw {
    /**
     * 冻结解冻编号
     */
    @Id
    @Column(name = "freeze_thaw_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long freezeThawId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 冻结解冻金额
     */
    private BigDecimal account;

    private Integer type;

    /**
     * 状态，0为冻结，1为解冻
     */
    private Integer status;

    /**
     * 冻结时间
     */
    @Column(name = "freeze_time")
    private Date freezeTime;

    /**
     * 解冻时间
     */
    @Column(name = "thaw_time")
    private Date thawTime;

    /**
     * create_time
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * update_time
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * version
     */
    private Long version;

    /**
     * 扣费标识
     */
    private Integer flag;

    /**
     * 获取冻结解冻编号
     *
     * @return freeze_thaw_id - 冻结解冻编号
     */
    public Long getFreezeThawId() {
        return freezeThawId;
    }

    /**
     * 设置冻结解冻编号
     *
     * @param freezeThawId 冻结解冻编号
     */
    public void setFreezeThawId(Long freezeThawId) {
        this.freezeThawId = freezeThawId;
    }

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
     * 获取冻结解冻金额
     *
     * @return account - 冻结解冻金额
     */
    public BigDecimal getAccount() {
        return account;
    }

    /**
     * 设置冻结解冻金额
     *
     * @param account 冻结解冻金额
     */
    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取状态，0为冻结，1为解冻
     *
     * @return status - 状态，0为冻结，1为解冻
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态，0为冻结，1为解冻
     *
     * @param status 状态，0为冻结，1为解冻
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取冻结时间
     *
     * @return freeze_time - 冻结时间
     */
    public Date getFreezeTime() {
        return freezeTime;
    }

    /**
     * 设置冻结时间
     *
     * @param freezeTime 冻结时间
     */
    public void setFreezeTime(Date freezeTime) {
        this.freezeTime = freezeTime;
    }

    /**
     * 获取解冻时间
     *
     * @return thaw_time - 解冻时间
     */
    public Date getThawTime() {
        return thawTime;
    }

    /**
     * 设置解冻时间
     *
     * @param thawTime 解冻时间
     */
    public void setThawTime(Date thawTime) {
        this.thawTime = thawTime;
    }

    /**
     * 获取create_time
     *
     * @return create_time - create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time
     *
     * @param createTime create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取update_time
     *
     * @return update_time - update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update_time
     *
     * @param updateTime update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取version
     *
     * @return version - version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置version
     *
     * @param version version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取扣费标识
     *
     * @return flag - 扣费标识
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置扣费标识
     *
     * @param flag 扣费标识
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}