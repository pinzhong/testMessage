package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_white")
public class ReapalWhite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 订单
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 卡号
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 银行预留手机号
     */
    private String phone;

    /**
     * 证件类型
     */
    @Column(name = "cert_type")
    private String certType;

    /**
     * 证件号码
     */
    @Column(name = "cert_no")
    private String certNo;

    /**
     * 协议号
     */
    @Column(name = "contract_user_code")
    private String contractUserCode;

    /**
     * 协议开始时间
     */
    @Column(name = "contract_start")
    private Date contractStart;

    /**
     * 协议结束时间
     */
    @Column(name = "contract_end")
    private Date contractEnd;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 结果
     */
    @Column(name = "result_code")
    private String resultCode;

    /**
     * 消息
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
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取订单
     *
     * @return order_no - 订单
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单
     *
     * @param orderNo 订单
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取卡号
     *
     * @return card_no - 卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置卡号
     *
     * @param cardNo 卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取银行预留手机号
     *
     * @return phone - 银行预留手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置银行预留手机号
     *
     * @param phone 银行预留手机号
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
     * 获取证件号码
     *
     * @return cert_no - 证件号码
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置证件号码
     *
     * @param certNo 证件号码
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
     * 获取协议开始时间
     *
     * @return contract_start - 协议开始时间
     */
    public Date getContractStart() {
        return contractStart;
    }

    /**
     * 设置协议开始时间
     *
     * @param contractStart 协议开始时间
     */
    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    /**
     * 获取协议结束时间
     *
     * @return contract_end - 协议结束时间
     */
    public Date getContractEnd() {
        return contractEnd;
    }

    /**
     * 设置协议结束时间
     *
     * @param contractEnd 协议结束时间
     */
    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
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
     * 获取结果
     *
     * @return result_code - 结果
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置结果
     *
     * @param resultCode 结果
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取消息
     *
     * @return result_msg - 消息
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 设置消息
     *
     * @param resultMsg 消息
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }
}