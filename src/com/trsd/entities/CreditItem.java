package com.trsd.entities;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_credit_item")
public class CreditItem {
    /**
     * 编号
     */
    @Id
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 类型
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 通道
     */
    private String provider;

    /**
     * 费用
     */
    private BigDecimal cost;

    private Integer score;

    /**
     * 是否允许重复
     */
    private Boolean isrepeat;

    /**
     * 是否启用（0：停用；1：启用）
     */
    private Boolean status;

    /**
     * 说明
     */
    private String remark;

    /**
     * 获取编号
     *
     * @return item_id - 编号
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置编号
     *
     * @param itemId 编号
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取类型
     *
     * @return type_id - 类型
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置类型
     *
     * @param typeId 类型
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取名称
     *
     * @return item_name - 名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置名称
     *
     * @param itemName 名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取通道
     *
     * @return provider - 通道
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置通道
     *
     * @param provider 通道
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * 获取费用
     *
     * @return cost - 费用
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置费用
     *
     * @param cost 费用
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取是否允许重复
     *
     * @return isrepeat - 是否允许重复
     */
    public Boolean getIsrepeat() {
        return isrepeat;
    }

    /**
     * 设置是否允许重复
     *
     * @param isrepeat 是否允许重复
     */
    public void setIsrepeat(Boolean isrepeat) {
        this.isrepeat = isrepeat;
    }

    /**
     * 获取是否启用（0：停用；1：启用）
     *
     * @return status - 是否启用（0：停用；1：启用）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置是否启用（0：停用；1：启用）
     *
     * @param status 是否启用（0：停用；1：启用）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取说明
     *
     * @return remark - 说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置说明
     *
     * @param remark 说明
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}