package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class CreditMobileInfo {
    /** ���  authid **/
    private String authid;

    /** �û����  userId **/
    private Long userid;

    /** �û��绰����  phone **/
    private String phone;

    /** ��֤ʱ��  createtime **/
    private Date createtime;

    /** ������¼��  ispass **/
    private Byte ispass;

    /** ��ǰ���  blance **/
    private BigDecimal blance;

    /** ��Ա����  vip_score **/
    private String vipScore;

    /** ��Ӫ��  isp **/
    private String isp;

    /** ����ʱ��  jointime **/
    private Date jointime;

    /** ����  netage **/
    private String netage;

    /** ���������  location **/
    private String location;

    /** ��ַ  address **/
    private String address;

    /** �û��ȼ�  vip_level **/
    private String vipLevel;

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
    public String getAuthid() {
        return authid;
    }

    /**   ���  authid   **/
    public void setAuthid(String authid) {
        this.authid = authid == null ? null : authid.trim();
    }

    /**   �û����  userId   **/
    public Long getUserid() {
        return userid;
    }

    /**   �û����  userId   **/
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**   �û��绰����  phone   **/
    public String getPhone() {
        return phone;
    }

    /**   �û��绰����  phone   **/
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**   ��֤ʱ��  createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**   ��֤ʱ��  createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**   ������¼��  ispass   **/
    public Byte getIspass() {
        return ispass;
    }

    /**   ������¼��  ispass   **/
    public void setIspass(Byte ispass) {
        this.ispass = ispass;
    }

    /**   ��ǰ���  blance   **/
    public BigDecimal getBlance() {
        return blance;
    }

    /**   ��ǰ���  blance   **/
    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }

    /**   ��Ա����  vip_score   **/
    public String getVipScore() {
        return vipScore;
    }

    /**   ��Ա����  vip_score   **/
    public void setVipScore(String vipScore) {
        this.vipScore = vipScore == null ? null : vipScore.trim();
    }

    /**   ��Ӫ��  isp   **/
    public String getIsp() {
        return isp;
    }

    /**   ��Ӫ��  isp   **/
    public void setIsp(String isp) {
        this.isp = isp == null ? null : isp.trim();
    }

    /**   ����ʱ��  jointime   **/
    public Date getJointime() {
        return jointime;
    }

    /**   ����ʱ��  jointime   **/
    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    /**   ����  netage   **/
    public String getNetage() {
        return netage;
    }

    /**   ����  netage   **/
    public void setNetage(String netage) {
        this.netage = netage == null ? null : netage.trim();
    }

    /**   ���������  location   **/
    public String getLocation() {
        return location;
    }

    /**   ���������  location   **/
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**   ��ַ  address   **/
    public String getAddress() {
        return address;
    }

    /**   ��ַ  address   **/
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**   �û��ȼ�  vip_level   **/
    public String getVipLevel() {
        return vipLevel;
    }

    /**   �û��ȼ�  vip_level   **/
    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
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