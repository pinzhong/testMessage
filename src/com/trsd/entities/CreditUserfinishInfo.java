package com.trsd.entities;

import java.util.Date;

public class CreditUserfinishInfo {
    /** ���  rec_id **/
    private Integer recId;

    /** �û����  user_id **/
    private Long userId;

    /** ��֤����  credit_type **/
    private String creditType;

    /** �����ṩ��  provider **/
    private String provider;

    /** ��֤ʱ��  finishtime **/
    private Date finishtime;

    /** ״̬��0��ʧЧ��2����Ч��  status **/
    private Byte status;

    /**   ���  rec_id   **/
    public Integer getRecId() {
        return recId;
    }

    /**   ���  rec_id   **/
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    /**   �û����  user_id   **/
    public Long getUserId() {
        return userId;
    }

    /**   �û����  user_id   **/
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**   ��֤����  credit_type   **/
    public String getCreditType() {
        return creditType;
    }

    /**   ��֤����  credit_type   **/
    public void setCreditType(String creditType) {
        this.creditType = creditType == null ? null : creditType.trim();
    }

    /**   �����ṩ��  provider   **/
    public String getProvider() {
        return provider;
    }

    /**   �����ṩ��  provider   **/
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**   ��֤ʱ��  finishtime   **/
    public Date getFinishtime() {
        return finishtime;
    }

    /**   ��֤ʱ��  finishtime   **/
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**   ״̬��0��ʧЧ��2����Ч��  status   **/
    public Byte getStatus() {
        return status;
    }

    /**   ״̬��0��ʧЧ��2����Ч��  status   **/
    public void setStatus(Byte status) {
        this.status = status;
    }
}