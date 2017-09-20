package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_white")
public class ReapalWhite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "white_no")
    private String whiteNo;

    @Column(name = "bankcard_id")
    private String bankcardId;

    @Column(name = "contract_user_code")
    private String contractUserCode;

    @Column(name = "contract_start")
    private Date contractStart;

    @Column(name = "contract_end")
    private Date contractEnd;

    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Short status;

    @Column(name = "result_code")
    private String resultCode;

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
     * @return white_no
     */
    public String getWhiteNo() {
        return whiteNo;
    }

    /**
     * @param whiteNo
     */
    public void setWhiteNo(String whiteNo) {
        this.whiteNo = whiteNo == null ? null : whiteNo.trim();
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
     * @return contract_start
     */
    public Date getContractStart() {
        return contractStart;
    }

    /**
     * @param contractStart
     */
    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    /**
     * @return contract_end
     */
    public Date getContractEnd() {
        return contractEnd;
    }

    /**
     * @param contractEnd
     */
    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
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
}