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
     * ������ˮid
     */
    @Column(name = "withdraw_no")
    private String withdrawNo;

    /**
     * ��������ʱ��ID��һ�㲻��
     */
    @Column(name = "batch_id")
    private String batchId;

    /**
     * �û�id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * ���п�id
     */
    @Column(name = "bankcard_id")
    private String bankcardId;

    /**
     * ���ֽ��
     */
    private BigDecimal amount;

    /**
     * ʵ�ʵ��˽��
     */
    @Column(name = "real_amount")
    private BigDecimal realAmount;

    /**
     * ������
     */
    private BigDecimal fee;

    private String remark;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * �ɹ�ʱ��
     */
    @Column(name = "success_time")
    private Date successTime;

    /**
     * ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ״̬
     */
    private Short status;

    /**
     * ͬ������code
     */
    @Column(name = "result_code")
    private String resultCode;

    /**
     * ͬ����Ϣ���
     */
    @Column(name = "result_msg")
    private String resultMsg;

    /**
     * �첽��Ϣcode
     */
    @Column(name = "notify_result_code")
    private String notifyResultCode;

    /**
     * �첽��Ϣ�ı�
     */
    @Column(name = "notify_result_msg")
    private String notifyResultMsg;

    /**
     * �����汾����
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
     * ��ȡ������ˮid
     *
     * @return withdraw_no - ������ˮid
     */
    public String getWithdrawNo() {
        return withdrawNo;
    }

    /**
     * ����������ˮid
     *
     * @param withdrawNo ������ˮid
     */
    public void setWithdrawNo(String withdrawNo) {
        this.withdrawNo = withdrawNo == null ? null : withdrawNo.trim();
    }

    /**
     * ��ȡ��������ʱ��ID��һ�㲻��
     *
     * @return batch_id - ��������ʱ��ID��һ�㲻��
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * ������������ʱ��ID��һ�㲻��
     *
     * @param batchId ��������ʱ��ID��һ�㲻��
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * ��ȡ�û�id
     *
     * @return user_id - �û�id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * �����û�id
     *
     * @param userId �û�id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ���п�id
     *
     * @return bankcard_id - ���п�id
     */
    public String getBankcardId() {
        return bankcardId;
    }

    /**
     * �������п�id
     *
     * @param bankcardId ���п�id
     */
    public void setBankcardId(String bankcardId) {
        this.bankcardId = bankcardId == null ? null : bankcardId.trim();
    }

    /**
     * ��ȡ���ֽ��
     *
     * @return amount - ���ֽ��
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * �������ֽ��
     *
     * @param amount ���ֽ��
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * ��ȡʵ�ʵ��˽��
     *
     * @return real_amount - ʵ�ʵ��˽��
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * ����ʵ�ʵ��˽��
     *
     * @param realAmount ʵ�ʵ��˽��
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * ��ȡ������
     *
     * @return fee - ������
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * ����������
     *
     * @param fee ������
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
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ�ɹ�ʱ��
     *
     * @return success_time - �ɹ�ʱ��
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * ���óɹ�ʱ��
     *
     * @param successTime �ɹ�ʱ��
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_time - ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateTime ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ״̬
     *
     * @return status - ״̬
     */
    public Short getStatus() {
        return status;
    }

    /**
     * ����״̬
     *
     * @param status ״̬
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * ��ȡͬ������code
     *
     * @return result_code - ͬ������code
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * ����ͬ������code
     *
     * @param resultCode ͬ������code
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * ��ȡͬ����Ϣ���
     *
     * @return result_msg - ͬ����Ϣ���
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * ����ͬ����Ϣ���
     *
     * @param resultMsg ͬ����Ϣ���
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }

    /**
     * ��ȡ�첽��Ϣcode
     *
     * @return notify_result_code - �첽��Ϣcode
     */
    public String getNotifyResultCode() {
        return notifyResultCode;
    }

    /**
     * �����첽��Ϣcode
     *
     * @param notifyResultCode �첽��Ϣcode
     */
    public void setNotifyResultCode(String notifyResultCode) {
        this.notifyResultCode = notifyResultCode == null ? null : notifyResultCode.trim();
    }

    /**
     * ��ȡ�첽��Ϣ�ı�
     *
     * @return notify_result_msg - �첽��Ϣ�ı�
     */
    public String getNotifyResultMsg() {
        return notifyResultMsg;
    }

    /**
     * �����첽��Ϣ�ı�
     *
     * @param notifyResultMsg �첽��Ϣ�ı�
     */
    public void setNotifyResultMsg(String notifyResultMsg) {
        this.notifyResultMsg = notifyResultMsg == null ? null : notifyResultMsg.trim();
    }

    /**
     * ��ȡ�����汾����
     *
     * @return version - �����汾����
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * ���ò����汾����
     *
     * @param version �����汾����
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}