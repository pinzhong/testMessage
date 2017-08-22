package com.trsd.entities;

import java.math.BigDecimal;

public class CreditItemInfo {
    /** 编号  item_id **/
    private Integer itemId;

    /** 类型  type_id **/
    private Integer typeId;

    /** 名称  item_name **/
    private String itemName;

    /** 通道  channel **/
    private String channel;

    /** 费用  cost **/
    private BigDecimal cost;

    /**   score **/
    private Integer score;

    /** 是否允许重复  isrepeat **/
    private Boolean isrepeat;

    /** 是否启用（0：停用；1：启用）  status **/
    private Boolean status;

    /** 说明  remark **/
    private String remark;

    /**   编号  item_id   **/
    public Integer getItemId() {
        return itemId;
    }

    /**   编号  item_id   **/
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**   类型  type_id   **/
    public Integer getTypeId() {
        return typeId;
    }

    /**   类型  type_id   **/
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**   名称  item_name   **/
    public String getItemName() {
        return itemName;
    }

    /**   名称  item_name   **/
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**   通道  channel   **/
    public String getChannel() {
        return channel;
    }

    /**   通道  channel   **/
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**   费用  cost   **/
    public BigDecimal getCost() {
        return cost;
    }

    /**   费用  cost   **/
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**     score   **/
    public Integer getScore() {
        return score;
    }

    /**     score   **/
    public void setScore(Integer score) {
        this.score = score;
    }

    /**   是否允许重复  isrepeat   **/
    public Boolean getIsrepeat() {
        return isrepeat;
    }

    /**   是否允许重复  isrepeat   **/
    public void setIsrepeat(Boolean isrepeat) {
        this.isrepeat = isrepeat;
    }

    /**   是否启用（0：停用；1：启用）  status   **/
    public Boolean getStatus() {
        return status;
    }

    /**   是否启用（0：停用；1：启用）  status   **/
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**   说明  remark   **/
    public String getRemark() {
        return remark;
    }

    /**   说明  remark   **/
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}