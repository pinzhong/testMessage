package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_recharge")
public class ReapalRecharge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recharge_no")
    private String rechargeNo;

    @Column(name = "trade_no")
    private String tradeNo;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "bind_id")
    private String bindId;

    private Date transtime;

    private BigDecimal amount;

    private String title;

    private String body;

    @Column(name = "terminal_type")
    private String terminalType;

    @Column(name = "terminal_info")
    private String terminalInfo;

    @Column(name = "member_ip")
    private String memberIp;

    @Column(name = "seller_email")
    private String sellerEmail;

    @Column(name = "notify_url")
    private String notifyUrl;

    @Column(name = "token_id")
    private String tokenId;

    @Column(name = "time_expire")
    private String timeExpire;

    private Integer version;

    private Short status;

    @Column(name = "result_code")
    private String resultCode;

    @Column(name = "result_msg")
    private String resultMsg;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "success_time")
    private Date successTime;

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
     * @return trade_no
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * @param tradeNo
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
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
     * @return transtime
     */
    public Date getTranstime() {
        return transtime;
    }

    /**
     * @param transtime
     */
    public void setTranstime(Date transtime) {
        this.transtime = transtime;
    }

    /**
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
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
     * @return terminal_info
     */
    public String getTerminalInfo() {
        return terminalInfo;
    }

    /**
     * @param terminalInfo
     */
    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo == null ? null : terminalInfo.trim();
    }

    /**
     * @return member_ip
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * @param memberIp
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp == null ? null : memberIp.trim();
    }

    /**
     * @return seller_email
     */
    public String getSellerEmail() {
        return sellerEmail;
    }

    /**
     * @param sellerEmail
     */
    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail == null ? null : sellerEmail.trim();
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
     * @return token_id
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * @param tokenId
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    /**
     * @return time_expire
     */
    public String getTimeExpire() {
        return timeExpire;
    }

    /**
     * @param timeExpire
     */
    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire == null ? null : timeExpire.trim();
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
     * @return success_time
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * @param successTime
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
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