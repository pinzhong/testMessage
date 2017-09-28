package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_bankcard")
public class ReapalBankcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bankcard_id")
    private String bankcardId;

    @Column(name = "bind_id")
    private String bindId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "recharge_no")
    private String rechargeNo;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "card_no")
    private String cardNo;

    @Column(name = "card_type")
    private Short cardType;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "fromPort")
    private String fromport;

    @Column(name = "certificate_no")
    private String certificateNo;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_code")
    private String bankCode;

    private String branch;

    @Column(name = "sub_branch")
    private String subBranch;

    private String province;

    private String city;

    private String phone;

    private String cvv2;

    private String validthru;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 实名绑卡
     */
    @Column(name = "realname_bind_status")
    private Short realnameBindStatus;

    /**
     * 签约
     */
    @Column(name = "bind_status")
    private Short bindStatus;

    /**
     * 卡密鉴权
     */
    @Column(name = "cardpwd_status")
    private Short cardpwdStatus;

    /**
     * 白名单
     */
    @Column(name = "white_status")
    private Short whiteStatus;

    private Short status;

    @Column(name = "need_carpwd")
    private Short needCarpwd;

    private Short type;

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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * @return account_type
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * @return card_no
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * @return card_type
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return fromPort
     */
    public String getFromport() {
        return fromport;
    }

    /**
     * @param fromport
     */
    public void setFromport(String fromport) {
        this.fromport = fromport == null ? null : fromport.trim();
    }

    /**
     * @return certificate_no
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * @param certificateNo
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
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
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * @return sub_branch
     */
    public String getSubBranch() {
        return subBranch;
    }

    /**
     * @param subBranch
     */
    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch == null ? null : subBranch.trim();
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
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
     * @return cvv2
     */
    public String getCvv2() {
        return cvv2;
    }

    /**
     * @param cvv2
     */
    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2 == null ? null : cvv2.trim();
    }

    /**
     * @return validthru
     */
    public String getValidthru() {
        return validthru;
    }

    /**
     * @param validthru
     */
    public void setValidthru(String validthru) {
        this.validthru = validthru == null ? null : validthru.trim();
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
     * 获取实名绑卡
     *
     * @return realname_bind_status - 实名绑卡
     */
    public Short getRealnameBindStatus() {
        return realnameBindStatus;
    }

    /**
     * 设置实名绑卡
     *
     * @param realnameBindStatus 实名绑卡
     */
    public void setRealnameBindStatus(Short realnameBindStatus) {
        this.realnameBindStatus = realnameBindStatus;
    }

    /**
     * 获取签约
     *
     * @return bind_status - 签约
     */
    public Short getBindStatus() {
        return bindStatus;
    }

    /**
     * 设置签约
     *
     * @param bindStatus 签约
     */
    public void setBindStatus(Short bindStatus) {
        this.bindStatus = bindStatus;
    }

    /**
     * 获取卡密鉴权
     *
     * @return cardpwd_status - 卡密鉴权
     */
    public Short getCardpwdStatus() {
        return cardpwdStatus;
    }

    /**
     * 设置卡密鉴权
     *
     * @param cardpwdStatus 卡密鉴权
     */
    public void setCardpwdStatus(Short cardpwdStatus) {
        this.cardpwdStatus = cardpwdStatus;
    }

    /**
     * 获取白名单
     *
     * @return white_status - 白名单
     */
    public Short getWhiteStatus() {
        return whiteStatus;
    }

    /**
     * 设置白名单
     *
     * @param whiteStatus 白名单
     */
    public void setWhiteStatus(Short whiteStatus) {
        this.whiteStatus = whiteStatus;
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
     * @return need_carpwd
     */
    public Short getNeedCarpwd() {
        return needCarpwd;
    }

    /**
     * @param needCarpwd
     */
    public void setNeedCarpwd(Short needCarpwd) {
        this.needCarpwd = needCarpwd;
    }

    /**
     * @return type
     */
    public Short getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Short type) {
        this.type = type;
    }
}