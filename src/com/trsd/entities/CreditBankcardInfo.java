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
    private BigDecimal bankcard;

    /** ���֤����  realname **/
    private String realname;

    /** ���֤����  vip_score **/
    private String vipScore;

    /** ��������  bankname **/
    private String bankname;

    /** ���п����  cardtype **/
    private String cardtype;

    /** ͨ��  channel **/
    private String channel;

    /** ͨ��token  token **/
    private String token;

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
    public BigDecimal getBankcard() {
        return bankcard;
    }

    /**   ���п���  bankcard   **/
    public void setBankcard(BigDecimal bankcard) {
        this.bankcard = bankcard;
    }

    /**   ���֤����  realname   **/
    public String getRealname() {
        return realname;
    }

    /**   ���֤����  realname   **/
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**   ���֤����  vip_score   **/
    public String getVipScore() {
        return vipScore;
    }

    /**   ���֤����  vip_score   **/
    public void setVipScore(String vipScore) {
        this.vipScore = vipScore == null ? null : vipScore.trim();
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

    /**   ͨ��  channel   **/
    public String getChannel() {
        return channel;
    }

    /**   ͨ��  channel   **/
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**   ͨ��token  token   **/
    public String getToken() {
        return token;
    }

    /**   ͨ��token  token   **/
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
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