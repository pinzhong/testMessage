package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_cardpwd")
public class ReapalCardpwd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bankcard_id")
    private String bankcardId;

    @Column(name = "recharge_no")
    private String rechargeNo;

    @Column(name = "terminal_type")
    private String terminalType;

    @Column(name = "return_url")
    private String returnUrl;

    @Column(name = "notify_url")
    private String notifyUrl;

    private Short status;

    @Column(name = "bank_card_type")
    private String bankCardType;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_code")
    private String bankCode;

    @Column(name = "card_last")
    private String cardLast;

    private String phone;

    @Column(name = "total_fee")
    private Integer totalFee;

    private Integer version;

    @Column(name = "result_code")
    private String resultCode;

    @Column(name = "result_msg")
    private String resultMsg;

    @Column(name = "notify_result_code")
    private String notifyResultCode;

    @Column(name = "notify_result_msg")
    private String notifyResultMsg;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return terminal_type
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * @param terminalType
     */
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    /**
     * @return return_url
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * @param returnUrl
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    /**
     * @return notify_url
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * @param notifyUrl
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
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
     * @return bank_card_type
     */
    public String getBankCardType() {
        return bankCardType;
    }

    /**
     * @param bankCardType
     */
    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    /**
     * @return bank_name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * @return bank_code
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * @param bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * @return card_last
     */
    public String getCardLast() {
        return cardLast;
    }

    /**
     * @param cardLast
     */
    public void setCardLast(String cardLast) {
        this.cardLast = cardLast == null ? null : cardLast.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return total_fee
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * @param totalFee
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
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
}