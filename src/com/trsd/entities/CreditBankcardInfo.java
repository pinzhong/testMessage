package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class CreditBankcardInfo {
    /** ���  authid **/
    private Long authid;

    /** �û����  userId **/
    private Long userid;

    /** ��֤ʱ��  createtime **/
    private Date createtime;

    /** �Ƿ�ͨ��  ispass **/
    private Byte ispass;

    /** ���п���  bankcard **/
    private String bankcard;

    /** ���֤����  real_name **/
    private String realName;

    /** ���֤����  certificate_no **/
    private String certificateNo;

    /** ��������  bankname **/
    private String bankname;

    /** ���п����  cardtype **/
    private String cardtype;

    /** �ṩ��  provider **/
    private String provider;

    /** ����ʱ��  finishtime **/
    private Date finishtime;

    /** ����  cost **/
    private BigDecimal cost;

    /** ����  score **/
    private BigDecimal score;

    /** ״̬��-1��ʧ�ܣ�0�������У�1���ɹ���  status **/
    private Byte status;

    /**   ���  authid   **/
    public Long getAuthid() {
        return authid;
    }

    /**   ���  authid   **/
    public void setAuthid(Long authid) {
        this.authid = authid;
    }

    /**   �û����  userId   **/
    public Long getUserid() {
        return userid;
    }

    /**   �û����  userId   **/
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**   ��֤ʱ��  createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**   ��֤ʱ��  createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**   �Ƿ�ͨ��  ispass   **/
    public Byte getIspass() {
        return ispass;
    }

    /**   �Ƿ�ͨ��  ispass   **/
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**   ���п���  bankcard   **/
    public String getBankcard() {
        return bankcard;
    }

    /**   ���п���  bankcard   **/
    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    /**   ���֤����  real_name   **/
    public String getRealName() {
        return realName;
    }

    /**   ���֤����  real_name   **/
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**   ���֤����  certificate_no   **/
    public String getCertificateNo() {
        return certificateNo;
    }

    /**   ���֤����  certificate_no   **/
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**   ��������  bankname   **/
    public String getBankname() {
        return bankname;
    }

    /**   ��������  bankname   **/
    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    /**   ���п����  cardtype   **/
    public String getCardtype() {
        return cardtype;
    }

    /**   ���п����  cardtype   **/
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    /**   �ṩ��  provider   **/
    public String getProvider() {
        return provider;
    }

    /**   �ṩ��  provider   **/
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**   ����ʱ��  finishtime   **/
    public Date getFinishtime() {
        return finishtime;
    }

    /**   ����ʱ��  finishtime   **/
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**   ����  cost   **/
    public BigDecimal getCost() {
        return cost;
    }

    /**   ����  cost   **/
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**   ����  score   **/
    public BigDecimal getScore() {
        return score;
    }

    /**   ����  score   **/
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**   ״̬��-1��ʧ�ܣ�0�������У�1���ɹ���  status   **/
    public Byte getStatus() {
        return status;
    }

    /**   ״̬��-1��ʧ�ܣ�0�������У�1���ɹ���  status   **/
    public void setStatus(Byte status) {
        this.status = status;
    }
}