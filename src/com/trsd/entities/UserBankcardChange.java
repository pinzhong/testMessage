package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_bankcardchange")
public class UserBankcardChange {
    /**
     * 主键id
     */
    @Id
    @Column(name = "change_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long changeId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 身份证姓名
     */
    @Column(name = "original_real_name")
    private String originalRealName;

    /**
     * 身份证号码
     */
    @Column(name = "original_certificate_no")
    private String originalCertificateNo;

    /**
     * 原银行卡号
     */
    @Column(name = "original_card_no")
    private String originalCardNo;

    /**
     * 原银行名称
     */
    @Column(name = "originalbank_name")
    private String originalbankName;

    /**
     * 原开户省份
     */
    @Column(name = "original_province")
    private String originalProvince;

    /**
     * 原开户城市
     */
    @Column(name = "original_city")
    private String originalCity;

    /**
     * 原开户地区
     */
    @Column(name = "original_area")
    private String originalArea;

    /**
     * 原支行名称
     */
    @Column(name = "original_branch_name")
    private String originalBranchName;

    /**
     * 身份证姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号码
     */
    @Column(name = "certificate_no")
    private String certificateNo;

    /**
     * 银行卡号
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 银行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 开户省份
     */
    private String province;

    /**
     * 开户城市
     */
    private String city;

    /**
     * 开户地区
     */
    private String area;

    /**
     * 支行名称
     */
    @Column(name = "branch_name")
    private String branchName;

    /**
     * 更改时间
     */
    @Column(name = "change_time")
    private Date changeTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键id
     *
     * @return change_id - 主键id
     */
    public Long getChangeId() {
        return changeId;
    }

    /**
     * 设置主键id
     *
     * @param changeId 主键id
     */
    public void setChangeId(Long changeId) {
        this.changeId = changeId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取身份证姓名
     *
     * @return original_real_name - 身份证姓名
     */
    public String getOriginalRealName() {
        return originalRealName;
    }

    /**
     * 设置身份证姓名
     *
     * @param originalRealName 身份证姓名
     */
    public void setOriginalRealName(String originalRealName) {
        this.originalRealName = originalRealName == null ? null : originalRealName.trim();
    }

    /**
     * 获取身份证号码
     *
     * @return original_certificate_no - 身份证号码
     */
    public String getOriginalCertificateNo() {
        return originalCertificateNo;
    }

    /**
     * 设置身份证号码
     *
     * @param originalCertificateNo 身份证号码
     */
    public void setOriginalCertificateNo(String originalCertificateNo) {
        this.originalCertificateNo = originalCertificateNo == null ? null : originalCertificateNo.trim();
    }

    /**
     * 获取原银行卡号
     *
     * @return original_card_no - 原银行卡号
     */
    public String getOriginalCardNo() {
        return originalCardNo;
    }

    /**
     * 设置原银行卡号
     *
     * @param originalCardNo 原银行卡号
     */
    public void setOriginalCardNo(String originalCardNo) {
        this.originalCardNo = originalCardNo == null ? null : originalCardNo.trim();
    }

    /**
     * 获取原银行名称
     *
     * @return originalbank_name - 原银行名称
     */
    public String getOriginalbankName() {
        return originalbankName;
    }

    /**
     * 设置原银行名称
     *
     * @param originalbankName 原银行名称
     */
    public void setOriginalbankName(String originalbankName) {
        this.originalbankName = originalbankName == null ? null : originalbankName.trim();
    }

    /**
     * 获取原开户省份
     *
     * @return original_province - 原开户省份
     */
    public String getOriginalProvince() {
        return originalProvince;
    }

    /**
     * 设置原开户省份
     *
     * @param originalProvince 原开户省份
     */
    public void setOriginalProvince(String originalProvince) {
        this.originalProvince = originalProvince == null ? null : originalProvince.trim();
    }

    /**
     * 获取原开户城市
     *
     * @return original_city - 原开户城市
     */
    public String getOriginalCity() {
        return originalCity;
    }

    /**
     * 设置原开户城市
     *
     * @param originalCity 原开户城市
     */
    public void setOriginalCity(String originalCity) {
        this.originalCity = originalCity == null ? null : originalCity.trim();
    }

    /**
     * 获取原开户地区
     *
     * @return original_area - 原开户地区
     */
    public String getOriginalArea() {
        return originalArea;
    }

    /**
     * 设置原开户地区
     *
     * @param originalArea 原开户地区
     */
    public void setOriginalArea(String originalArea) {
        this.originalArea = originalArea == null ? null : originalArea.trim();
    }

    /**
     * 获取原支行名称
     *
     * @return original_branch_name - 原支行名称
     */
    public String getOriginalBranchName() {
        return originalBranchName;
    }

    /**
     * 设置原支行名称
     *
     * @param originalBranchName 原支行名称
     */
    public void setOriginalBranchName(String originalBranchName) {
        this.originalBranchName = originalBranchName == null ? null : originalBranchName.trim();
    }

    /**
     * 获取身份证姓名
     *
     * @return real_name - 身份证姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置身份证姓名
     *
     * @param realName 身份证姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取身份证号码
     *
     * @return certificate_no - 身份证号码
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设置身份证号码
     *
     * @param certificateNo 身份证号码
     */
    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    /**
     * 获取银行卡号
     *
     * @return card_no - 银行卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置银行卡号
     *
     * @param cardNo 银行卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取银行名称
     *
     * @return bank_name - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 获取开户省份
     *
     * @return province - 开户省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置开户省份
     *
     * @param province 开户省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取开户城市
     *
     * @return city - 开户城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置开户城市
     *
     * @param city 开户城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取开户地区
     *
     * @return area - 开户地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置开户地区
     *
     * @param area 开户地区
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 获取支行名称
     *
     * @return branch_name - 支行名称
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 设置支行名称
     *
     * @param branchName 支行名称
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    /**
     * 获取更改时间
     *
     * @return change_time - 更改时间
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * 设置更改时间
     *
     * @param changeTime 更改时间
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}