package com.trsd.entities;

public class CreditTypeInfo {
    /** ���  type_id **/
    private Integer typeId;

    /** ����  type_name **/
    private String typeName;

    /** �Ƿ����  ismust **/
    private Boolean ismust;

    /** �Ƿ����ã�0��ͣ�ã�1�����ã�  status **/
    private Boolean status;

    /** ˵��  remark **/
    private String remark;

    /**   ���  type_id   **/
    public Integer getTypeId() {
        return typeId;
    }

    /**   ���  type_id   **/
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**   ����  type_name   **/
    public String getTypeName() {
        return typeName;
    }

    /**   ����  type_name   **/
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**   �Ƿ����  ismust   **/
    public Boolean getIsmust() {
        return ismust;
    }

    /**   �Ƿ����  ismust   **/
    public void setIsmust(Boolean ismust) {
        this.ismust = ismust;
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