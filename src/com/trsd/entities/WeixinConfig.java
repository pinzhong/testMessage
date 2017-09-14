package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_weixin_config")
public class WeixinConfig {
    @Id
    @Column(name = "weixin_config_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer weixinConfigId;

    /**
     * 配置项
     */
    private String key;

    /**
     * 配置值
     */
    private String value;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private String description;

    /**
     * @return weixin_config_id
     */
    public Integer getWeixinConfigId() {
        return weixinConfigId;
    }

    /**
     * @param weixinConfigId
     */
    public void setWeixinConfigId(Integer weixinConfigId) {
        this.weixinConfigId = weixinConfigId;
    }

    /**
     * 获取配置项
     *
     * @return key - 配置项
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置配置项
     *
     * @param key 配置项
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * 获取配置值
     *
     * @return value - 配置值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置配置值
     *
     * @param value 配置值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}