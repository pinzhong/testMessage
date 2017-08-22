package com.trsd.entities;

public class CreditTypeInfo {
    /** 编号  type_id **/
    private Integer typeId;

    /** 名称  type_name **/
    private String typeName;

    /** 是否必须  ismust **/
    private Boolean ismust;

    /** 是否启用（0：停用；1：启用）  status **/
    private Boolean status;

    /** 说明  remark **/
    private String remark;

    /**   编号  type_id   **/
    public Integer getTypeId() {
        return typeId;
    }

    /**   编号  type_id   **/
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**   名称  type_name   **/
    public String getTypeName() {
        return typeName;
    }

    /**   名称  type_name   **/
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**   是否必须  ismust   **/
    public Boolean getIsmust() {
        return ismust;
    }

    /**   是否必须  ismust   **/
    public void setIsmust(Boolean ismust) {
        this.ismust = ismust;
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