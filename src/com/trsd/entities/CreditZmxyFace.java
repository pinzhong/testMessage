package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_zmxyface")
public class CreditZmxyFace {
    /**
     * 编号
     */
    @Id
    @Column(name = "rec_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 编号
     */
    private Long authid;

    /**
     * 认证时间
     */
    private Date authtime;

    /**
     * 姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 业务凭证号
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 业务编号
     */
    @Column(name = "biz_no")
    private Integer bizNo;

    /**
     * 是否通过
     */
    private Boolean ispass;

    /**
     * 结束时间
     */
    private Date finishtime;

    /**
     * 费用
     */
    private BigDecimal cost;

    /**
     * 积分
     */
    private BigDecimal score;

    /**
     * 状态（-1：失败；0：进行中；1：成功）
     */
    private Byte status;

    /**
     * 获取编号
     *
     * @return rec_id - 编号
     */
    public Long getRecId() {
        return recId;
    }

    /**
     * 设置编号
     *
     * @param recId 编号
     */
    public void setRecId(Long recId) {
        this.recId = recId;
    }

    /**
     * 获取主键ID
     *
     * @return user_id - 主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键ID
     *
     * @param userId 主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取编号
     *
     * @return authid - 编号
     */
    public Long getAuthid() {
        return authid;
    }

    /**
     * 设置编号
     *
     * @param authid 编号
     */
    public void setAuthid(Long authid) {
        this.authid = authid;
    }

    /**
     * 获取认证时间
     *
     * @return authtime - 认证时间
     */
    public Date getAuthtime() {
        return authtime;
    }

    /**
     * 设置认证时间
     *
     * @param authtime 认证时间
     */
    public void setAuthtime(Date authtime) {
        this.authtime = authtime;
    }

    /**
     * 获取姓名
     *
     * @return real_name - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取身份证号
     *
     * @return certificate_no - 身份证号
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设置身份证号
     *
     * @param certificateNo 身份证号
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**
     * 获取业务凭证号
     *
     * @return transaction_id - 业务凭证号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置业务凭证号
     *
     * @param transactionId 业务凭证号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取业务编号
     *
     * @return biz_no - 业务编号
     */
    public Integer getBizNo() {
        return bizNo;
    }

    /**
     * 设置业务编号
     *
     * @param bizNo 业务编号
     */
    public void setBizNo(Integer bizNo) {
        this.bizNo = bizNo;
    }

    /**
     * 获取是否通过
     *
     * @return ispass - 是否通过
     */
    public Boolean getIspass() {
        return ispass;
    }

    /**
     * 设置是否通过
     *
     * @param ispass 是否通过
     */
    public void setIspass(Boolean ispass) {
        this.ispass = ispass;
    }

    /**
     * 获取结束时间
     *
     * @return finishtime - 结束时间
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * 设置结束时间
     *
     * @param finishtime 结束时间
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
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
     * 获取积分
     *
     * @return score - 积分
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * 设置积分
     *
     * @param score 积分
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * 获取状态（-1：失败；0：进行中；1：成功）
     *
     * @return status - 状态（-1：失败；0：进行中；1：成功）
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态（-1：失败；0：进行中；1：成功）
     *
     * @param status 状态（-1：失败；0：进行中；1：成功）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}