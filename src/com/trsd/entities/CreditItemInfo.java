package com.trsd.entities;

import java.math.BigDecimal;

public class CreditItemInfo {
    /** ���  item_id **/
    private Integer itemId;

    /** ����  type_id **/
    private Integer typeId;

    /** ����  item_name **/
    private String itemName;

    /** ͨ��  channel **/
    private String channel;

    /** ����  cost **/
    private BigDecimal cost;

    /**   score **/
    private Integer score;

    /** �Ƿ������ظ�  isrepeat **/
    private Boolean isrepeat;

    /** �Ƿ����ã�0��ͣ�ã�1�����ã�  status **/
    private Boolean status;

    /** ˵��  remark **/
    private String remark;

    /**   ���  item_id   **/
    public Integer getItemId() {
        return itemId;
    }

    /**   ���  item_id   **/
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**   ����  type_id   **/
    public Integer getTypeId() {
        return typeId;
    }

    /**   ����  type_id   **/
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**   ����  item_name   **/
    public String getItemName() {
        return itemName;
    }

    /**   ����  item_name   **/
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**   ͨ��  channel   **/
    public String getChannel() {
        return channel;
    }

    /**   ͨ��  channel   **/
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**   ����  cost   **/
    public BigDecimal getCost() {
        return cost;
    }

    /**   ����  cost   **/
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

    /**   �Ƿ������ظ�  isrepeat   **/
    public Boolean getIsrepeat() {
        return isrepeat;
    }

    /**   �Ƿ������ظ�  isrepeat   **/
    public void setIsrepeat(Boolean isrepeat) {
        this.isrepeat = isrepeat;
    }

    /**   �Ƿ����ã�0��ͣ�ã�1�����ã�  status   **/
    public Boolean getStatus() {
        return status;
    }

    /**   �Ƿ����ã�0��ͣ�ã�1�����ã�  status   **/
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**   ˵��  remark   **/
    public String getRemark() {
        return remark;
    }

    /**   ˵��  remark   **/
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}