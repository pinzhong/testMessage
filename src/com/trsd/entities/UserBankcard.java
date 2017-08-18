package com.trsd.entities;

import java.io.Serializable;
import java.util.Date;

public class UserBankcard implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 主键id
     */
    private Long userBankcardId;

    /**
     * 主键ID
     */
    private Long userId;

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
     * 银行名称
     */
    private String bankName;

    /**
     * 支行名称
     */
    private String branchName;

    /**
     * 银行卡号
     */
    private String cardNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 主键id
     * @return user_bankcard_id 主键id
     */
    public Long getUserBankcardId() {
        return userBankcardId;
    }

    /**
     * 主键id
     * @param userBankcardId 主键id
     */
    public void setUserBankcardId(Long userBankcardId) {
        this.userBankcardId = userBankcardId;
    }

    /**
     * 主键ID
     * @return user_id 主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 主键ID
     * @param userId 主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 开户省份
     * @return province 开户省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 开户省份
     * @param province 开户省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 开户城市
     * @return city 开户城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 开户城市
     * @param city 开户城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 开户地区
     * @return area 开户地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 开户地区
     * @param area 开户地区
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 银行名称
     * @return bank_name 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 银行名称
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 支行名称
     * @return branch_name 支行名称
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 支行名称
     * @param branchName 支行名称
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    /**
     * 银行卡号
     * @return card_no 银行卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 银行卡号
     * @param cardNo 银行卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}