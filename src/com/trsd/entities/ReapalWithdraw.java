package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_withdraw")
public class ReapalWithdraw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "withdraw_no")
    private String withdrawNo;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "contract_user_code")
    private String contractUserCode;

    @Column(name = "bankcard_id")
    private String bankcardId;

    private BigDecimal amount;

    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "success_time")
    private Date successTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Short status;

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
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return withdraw_no
     */
    public String getWithdrawNo() {
        return withdrawNo;
    }

    /**
     * @param withdrawNo
     */
    public void setWithdrawNo(String withdrawNo) {
        this.withdrawNo = withdrawNo == null ? null : withdrawNo.trim();
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return contract_user_code
     */
    public String getContractUserCode() {
        return contractUserCode;
    }

    /**
     * @param contractUserCode
     */
    public void setContractUserCode(String contractUserCode) {
        this.contractUserCode = contractUserCode == null ? null : contractUserCode.trim();
    }

    /**
     * @return bankcard_id
     */
    public String getBankcardId() {
        return bankcardId;
    }

    /**
     * @param bankcardId
     */
    public void setBankcardId(String bankcardId) {
        this.bankcardId = bankcardId == null ? null : bankcardId.trim();
    }

    /**
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
     * @return success_time
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * @param successTime
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
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