package com.trsd.entities;

import javax.persistence.*;

@Table(name = "t_credit_type")
public class CreditType {
    /**
     * 编号
     */
    @Id
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 是否必须
     */
    private Boolean ismust;

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
     * @return type_id - 编号
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置编号
     *
     * @param typeId 编号
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取名称
     *
     * @return type_name - 名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置名称
     *
     * @param typeName 名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 获取是否必须
     *
     * @return ismust - 是否必须
     */
    public Boolean getIsmust() {
        return ismust;
    }

    /**
     * 设置是否必须
     *
     * @param ismust 是否必须
     */
    public void setIsmust(Boolean ismust) {
        this.ismust = ismust;
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