package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_bind")
public class ReapalBind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recharge_no")
    private String rechargeNo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Short status;

    @Column(name = "bind_id")
    private String bindId;

    private Integer certificate;

    @Column(name = "result_code")
    private String resultCode;

    @Column(name = "result_msg")
    private String resultMsg;

    @Column(name = "notify_result_code")
    private String notifyResultCode;

    @Column(name = "notify_result_msg")
    private String notifyResultMsg;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return recharge_no
     */
    public String getRechargeNo() {
        return rechargeNo;
    }

    /**
     * @param rechargeNo
     */
    public void setRechargeNo(String rechargeNo) {
        this.rechargeNo = rechargeNo == null ? null : rechargeNo.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return status
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return bind_id
     */
    public String getBindId() {
        return bindId;
    }

    /**
     * @param bindId
     */
    public void setBindId(String bindId) {
        this.bindId = bindId == null ? null : bindId.trim();
    }

    /**
     * @return certificate
     */
    public Integer getCertificate() {
        return certificate;
    }

    /**
     * @param certificate
     */
    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    /**
     * @return result_code
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * @return result_msg
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * @param resultMsg
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }

    /**
     * @return notify_result_code
     */
    public String getNotifyResultCode() {
        return notifyResultCode;
    }

    /**
     * @param notifyResultCode
     */
    public void setNotifyResultCode(String notifyResultCode) {
        this.notifyResultCode = notifyResultCode == null ? null : notifyResultCode.trim();
    }

    /**
     * @return notify_result_msg
     */
    public String getNotifyResultMsg() {
        return notifyResultMsg;
    }

    /**
     * @param notifyResultMsg
     */
    public void setNotifyResultMsg(String notifyResultMsg) {
        this.notifyResultMsg = notifyResultMsg == null ? null : notifyResultMsg.trim();
    }
}