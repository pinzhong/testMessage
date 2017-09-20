package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_withdraw")
public class ReapalWithdraw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单流水
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 银行
     */
    private String bank;

    /**
     * 分行
     */
    private String branch;

    /**
     * 支行
     */
    @Column(name = "sub_branch")
    private String subBranch;

    /**
     * 账号类型
     */
    @Column(name = "account_type")
    private String accountType;

    /**
     * 提现金额
     */
    private BigDecimal amount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 预留手机号
     */
    private String phone;

    /**
     * 证件类型
     */
    @Column(name = "cert_type")
    private String certType;

    /**
     * 证件编号
     */
    @Column(name = "cert_no")
    private String certNo;

    /**
     * 协议号
     */
    @Column(name = "contract_user_code")
    private String contractUserCode;

    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 成功时间
     */
    @Column(name = "success_time")
    private Date successTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Short status;

    /**
     * 操作结果
     */
    @Column(name = "result_code")
    private String resultCode;

    /**
     * 操作结果消息
     */
    @Column(name = "result_msg")
    private String resultMsg;

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
     * 获取订单流水
     *
     * @return order_no - 订单流水
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单流水
     *
     * @param orderNo 订单流水
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取银行
     *
     * @return bank - 银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置银行
     *
     * @param bank 银行
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * 获取分行
     *
     * @return branch - 分行
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 设置分行
     *
     * @param branch 分行
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * 获取支行
     *
     * @return sub_branch - 支行
     */
    public String getSubBranch() {
        return subBranch;
    }

    /**
     * 设置支行
     *
     * @param subBranch 支行
     */
    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch == null ? null : subBranch.trim();
    }

    /**
     * 获取账号类型
     *
     * @return account_type - 账号类型
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置账号类型
     *
     * @param accountType 账号类型
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 获取提现金额
     *
     * @return amount - 提现金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置提现金额
     *
     * @param amount 提现金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取币种
     *
     * @return currency - 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取预留手机号
     *
     * @return phone - 预留手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置预留手机号
     *
     * @param phone 预留手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取证件类型
     *
     * @return cert_type - 证件类型
     */
    public String getCertType() {
        return certType;
    }

    /**
     * 设置证件类型
     *
     * @param certType 证件类型
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * 获取证件编号
     *
     * @return cert_no - 证件编号
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置证件编号
     *
     * @param certNo 证件编号
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * 获取协议号
     *
     * @return contract_user_code - 协议号
     */
    public String getContractUserCode() {
        return contractUserCode;
    }

    /**
     * 设置协议号
     *
     * @param contractUserCode 协议号
     */
    public void setContractUserCode(String contractUserCode) {
        this.contractUserCode = contractUserCode == null ? null : contractUserCode.trim();
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
     * 获取成功时间
     *
     * @return success_time - 成功时间
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置成功时间
     *
     * @param successTime 成功时间
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取操作结果
     *
     * @return result_code - 操作结果
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置操作结果
     *
     * @param resultCode 操作结果
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取操作结果消息
     *
     * @return result_msg - 操作结果消息
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 设置操作结果消息
     *
     * @param resultMsg 操作结果消息
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }
}