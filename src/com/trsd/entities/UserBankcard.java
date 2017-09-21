package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_bankcard")
public class UserBankcard {
    /**
     * 主键id
     */
    @Id
    @Column(name = "user_bankcard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBankcardId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

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
     * 银行卡类型
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 支行名称
     */
    @Column(name = "branch_name")
    private String branchName;

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
     * 更改次数
     */
    @Column(name = "change_num")
    private Integer changeNum;

    /**
     * 签约状态
     */
    @Column(name = "sign_status")
    private Integer signStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键id
     *
     * @return user_bankcard_id - 主键id
     */
    public Long getUserBankcardId() {
        return userBankcardId;
    }

    /**
     * 设置主键id
     *
     * @param userBankcardId 主键id
     */
    public void setUserBankcardId(Long userBankcardId) {
        this.userBankcardId = userBankcardId;
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
     * 获取银行卡类型
     *
     * @return card_type - 银行卡类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置银行卡类型
     *
     * @param cardType 银行卡类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
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
     * 获取更改次数
     *
     * @return change_num - 更改次数
     */
    public Integer getChangeNum() {
        return changeNum;
    }

    /**
     * 设置更改次数
     *
     * @param changeNum 更改次数
     */
    public void setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
    }

    /**
     * 获取签约状态
     *
     * @return sign_status - 签约状态
     */
    public Integer getSignStatus() {
        return signStatus;
    }

    /**
     * 设置签约状态
     *
     * @param signStatus 签约状态
     */
    public void setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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