package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_withdraw")
public class ReapalWithdraw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 提现流水id
     */
    @Column(name = "withdraw_no")
    private String withdrawNo;

    /**
     * 批量处理时的ID，一般不用
     */
    @Column(name = "batch_id")
    private String batchId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 银行卡id
     */
    @Column(name = "bankcard_id")
    private String bankcardId;

    /**
     * 提现金额
     */
    private BigDecimal amount;

    /**
     * 实际到账金额
     */
    @Column(name = "real_amount")
    private BigDecimal realAmount;

    /**
     * 手续费
     */
    private BigDecimal fee;

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
     * 同步调用code
     */
    @Column(name = "result_code")
    private String resultCode;

    /**
     * 同步消息结果
     */
    @Column(name = "result_msg")
    private String resultMsg;

    /**
     * 异步消息code
     */
    @Column(name = "notify_result_code")
    private String notifyResultCode;

    /**
     * 异步消息文本
     */
    @Column(name = "notify_result_msg")
    private String notifyResultMsg;

    /**
     * 并发版本控制
     */
    private Integer version;

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
     * 获取提现流水id
     *
     * @return withdraw_no - 提现流水id
     */
    public String getWithdrawNo() {
        return withdrawNo;
    }

    /**
     * 设置提现流水id
     *
     * @param withdrawNo 提现流水id
     */
    public void setWithdrawNo(String withdrawNo) {
        this.withdrawNo = withdrawNo == null ? null : withdrawNo.trim();
    }

    /**
     * 获取批量处理时的ID，一般不用
     *
     * @return batch_id - 批量处理时的ID，一般不用
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * 设置批量处理时的ID，一般不用
     *
     * @param batchId 批量处理时的ID，一般不用
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取银行卡id
     *
     * @return bankcard_id - 银行卡id
     */
    public String getBankcardId() {
        return bankcardId;
    }

    /**
     * 设置银行卡id
     *
     * @param bankcardId 银行卡id
     */
    public void setBankcardId(String bankcardId) {
        this.bankcardId = bankcardId == null ? null : bankcardId.trim();
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
     * 获取实际到账金额
     *
     * @return real_amount - 实际到账金额
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 设置实际到账金额
     *
     * @param realAmount 实际到账金额
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取手续费
     *
     * @return fee - 手续费
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置手续费
     *
     * @param fee 手续费
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
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
     * 获取同步调用code
     *
     * @return result_code - 同步调用code
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置同步调用code
     *
     * @param resultCode 同步调用code
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取同步消息结果
     *
     * @return result_msg - 同步消息结果
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 设置同步消息结果
     *
     * @param resultMsg 同步消息结果
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }

    /**
     * 获取异步消息code
     *
     * @return notify_result_code - 异步消息code
     */
    public String getNotifyResultCode() {
        return notifyResultCode;
    }

    /**
     * 设置异步消息code
     *
     * @param notifyResultCode 异步消息code
     */
    public void setNotifyResultCode(String notifyResultCode) {
        this.notifyResultCode = notifyResultCode == null ? null : notifyResultCode.trim();
    }

    /**
     * 获取异步消息文本
     *
     * @return notify_result_msg - 异步消息文本
     */
    public String getNotifyResultMsg() {
        return notifyResultMsg;
    }

    /**
     * 设置异步消息文本
     *
     * @param notifyResultMsg 异步消息文本
     */
    public void setNotifyResultMsg(String notifyResultMsg) {
        this.notifyResultMsg = notifyResultMsg == null ? null : notifyResultMsg.trim();
    }

    /**
     * 获取并发版本控制
     *
     * @return version - 并发版本控制
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置并发版本控制
     *
     * @param version 并发版本控制
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}