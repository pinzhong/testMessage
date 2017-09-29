package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_credit_bodyguard")
public class CreditBodyguard {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authid;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 认证时间
     */
    private Date authtime;

    /**
     * 业务凭证号
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 风险评分
     */
    @Column(name = "risk_score")
    private BigDecimal riskScore;

    /**
     * 风险项目数
     */
    @Column(name = "risk_items")
    private Integer riskItems;

    /**
     * 审查结果
     */
    private String decision;

    /**
     * 上次认证时间
     */
    @Column(name = "last_authtime")
    private Date lastAuthtime;

    /**
     * 上次认证分数
     */
    @Column(name = "last_score")
    private BigDecimal lastScore;

    /**
     * 上次审查结果
     */
    @Column(name = "last_decision")
    private String lastDecision;

    /**
     * 费用
     */
    private BigDecimal cost;

    /**
     * 积分
     */
    private BigDecimal score;

    /**
     * 状态（-1：失败；0：进行中；1：成功）
     */
    private Integer status;

    /**
     * 扣费状态（0：未扣费；1：已扣费）
     */
    @Column(name = "charge_status")
    private Integer chargeStatus;

    /**
     * 积分状态（0：未加积分；1：已加积分）
     */
    @Column(name = "score_status")
    private Integer scoreStatus;

    /**
     * 人工审核状态（0：不需要；1：需要）
     */
    @Column(name = "manual_status")
    private Integer manualStatus;

    /**
     * 人工审核结果（0：不通过；1：通过）
     */
    @Column(name = "manual_result")
    private Integer manualResult;

    /**
     * 人工审核时间
     */
    @Column(name = "manual_time")
    private Date manualTime;

    /**
     * 人工审核人员
     */
    @Column(name = "manual_by")
    private String manualBy;

    /**
     * 获取编号
     *
     * @return authid - 编号
     */
    public Long getAuthid() {
        return authid;
    }

    /**
     * 设置编号
     *
     * @param authid 编号
     */
    public void setAuthid(Long authid) {
        this.authid = authid;
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
     * 获取认证时间
     *
     * @return authtime - 认证时间
     */
    public Date getAuthtime() {
        return authtime;
    }

    /**
     * 设置认证时间
     *
     * @param authtime 认证时间
     */
    public void setAuthtime(Date authtime) {
        this.authtime = authtime;
    }

    /**
     * 获取业务凭证号
     *
     * @return transaction_id - 业务凭证号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置业务凭证号
     *
     * @param transactionId 业务凭证号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取风险评分
     *
     * @return risk_score - 风险评分
     */
    public BigDecimal getRiskScore() {
        return riskScore;
    }

    /**
     * 设置风险评分
     *
     * @param riskScore 风险评分
     */
    public void setRiskScore(BigDecimal riskScore) {
        this.riskScore = riskScore;
    }

    /**
     * 获取风险项目数
     *
     * @return risk_items - 风险项目数
     */
    public Integer getRiskItems() {
        return riskItems;
    }

    /**
     * 设置风险项目数
     *
     * @param riskItems 风险项目数
     */
    public void setRiskItems(Integer riskItems) {
        this.riskItems = riskItems;
    }

    /**
     * 获取审查结果
     *
     * @return decision - 审查结果
     */
    public String getDecision() {
        return decision;
    }

    /**
     * 设置审查结果
     *
     * @param decision 审查结果
     */
    public void setDecision(String decision) {
        this.decision = decision == null ? null : decision.trim();
    }

    /**
     * 获取上次认证时间
     *
     * @return last_authtime - 上次认证时间
     */
    public Date getLastAuthtime() {
        return lastAuthtime;
    }

    /**
     * 设置上次认证时间
     *
     * @param lastAuthtime 上次认证时间
     */
    public void setLastAuthtime(Date lastAuthtime) {
        this.lastAuthtime = lastAuthtime;
    }

    /**
     * 获取上次认证分数
     *
     * @return last_score - 上次认证分数
     */
    public BigDecimal getLastScore() {
        return lastScore;
    }

    /**
     * 设置上次认证分数
     *
     * @param lastScore 上次认证分数
     */
    public void setLastScore(BigDecimal lastScore) {
        this.lastScore = lastScore;
    }

    /**
     * 获取上次审查结果
     *
     * @return last_decision - 上次审查结果
     */
    public String getLastDecision() {
        return lastDecision;
    }

    /**
     * 设置上次审查结果
     *
     * @param lastDecision 上次审查结果
     */
    public void setLastDecision(String lastDecision) {
        this.lastDecision = lastDecision == null ? null : lastDecision.trim();
    }

    /**
     * 获取费用
     *
     * @return cost - 费用
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * 设置费用
     *
     * @param cost 费用
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * 获取积分
     *
     * @return score - 积分
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * 设置积分
     *
     * @param score 积分
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * 获取状态（-1：失败；0：进行中；1：成功）
     *
     * @return status - 状态（-1：失败；0：进行中；1：成功）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（-1：失败；0：进行中；1：成功）
     *
     * @param status 状态（-1：失败；0：进行中；1：成功）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取扣费状态（0：未扣费；1：已扣费）
     *
     * @return charge_status - 扣费状态（0：未扣费；1：已扣费）
     */
    public Integer getChargeStatus() {
        return chargeStatus;
    }

    /**
     * 设置扣费状态（0：未扣费；1：已扣费）
     *
     * @param chargeStatus 扣费状态（0：未扣费；1：已扣费）
     */
    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    /**
     * 获取积分状态（0：未加积分；1：已加积分）
     *
     * @return score_status - 积分状态（0：未加积分；1：已加积分）
     */
    public Integer getScoreStatus() {
        return scoreStatus;
    }

    /**
     * 设置积分状态（0：未加积分；1：已加积分）
     *
     * @param scoreStatus 积分状态（0：未加积分；1：已加积分）
     */
    public void setScoreStatus(Integer scoreStatus) {
        this.scoreStatus = scoreStatus;
    }

    /**
     * 获取人工审核状态（0：不需要；1：需要）
     *
     * @return manual_status - 人工审核状态（0：不需要；1：需要）
     */
    public Integer getManualStatus() {
        return manualStatus;
    }

    /**
     * 设置人工审核状态（0：不需要；1：需要）
     *
     * @param manualStatus 人工审核状态（0：不需要；1：需要）
     */
    public void setManualStatus(Integer manualStatus) {
        this.manualStatus = manualStatus;
    }

    /**
     * 获取人工审核结果（0：不通过；1：通过）
     *
     * @return manual_result - 人工审核结果（0：不通过；1：通过）
     */
    public Integer getManualResult() {
        return manualResult;
    }

    /**
     * 设置人工审核结果（0：不通过；1：通过）
     *
     * @param manualResult 人工审核结果（0：不通过；1：通过）
     */
    public void setManualResult(Integer manualResult) {
        this.manualResult = manualResult;
    }

    /**
     * 获取人工审核时间
     *
     * @return manual_time - 人工审核时间
     */
    public Date getManualTime() {
        return manualTime;
    }

    /**
     * 设置人工审核时间
     *
     * @param manualTime 人工审核时间
     */
    public void setManualTime(Date manualTime) {
        this.manualTime = manualTime;
    }

    /**
     * 获取人工审核人员
     *
     * @return manual_by - 人工审核人员
     */
    public String getManualBy() {
        return manualBy;
    }

    /**
     * 设置人工审核人员
     *
     * @param manualBy 人工审核人员
     */
    public void setManualBy(String manualBy) {
        this.manualBy = manualBy == null ? null : manualBy.trim();
    }
}