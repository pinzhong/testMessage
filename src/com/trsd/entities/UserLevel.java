package com.trsd.entities;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_user_level")
public class UserLevel {
    /**
     * 等级
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer level;

    /**
     * 短贷利率
     */
    @Column(name = "short_rate")
    private BigDecimal shortRate;

    /**
     * 长贷利率
     */
    @Column(name = "long_rate")
    private BigDecimal longRate;

    /**
     * 借款手续费费率
     */
    @Column(name = "loan_rate")
    private BigDecimal loanRate;

    /**
     * 短贷自动投资比例
     */
    @Column(name = "auto_short_proportion")
    private BigDecimal autoShortProportion;

    /**
     * 长贷自动投资比例
     */
    @Column(name = "auto_long_proportion")
    private BigDecimal autoLongProportion;

    @Column(name = "level_score")
    private BigDecimal levelScore;

    @Column(name = "limit_score")
    private BigDecimal limitScore;

    /**
     * 获取等级
     *
     * @return level - 等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置等级
     *
     * @param level 等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取短贷利率
     *
     * @return short_rate - 短贷利率
     */
    public BigDecimal getShortRate() {
        return shortRate;
    }

    /**
     * 设置短贷利率
     *
     * @param shortRate 短贷利率
     */
    public void setShortRate(BigDecimal shortRate) {
        this.shortRate = shortRate;
    }

    /**
     * 获取长贷利率
     *
     * @return long_rate - 长贷利率
     */
    public BigDecimal getLongRate() {
        return longRate;
    }

    /**
     * 设置长贷利率
     *
     * @param longRate 长贷利率
     */
    public void setLongRate(BigDecimal longRate) {
        this.longRate = longRate;
    }

    /**
     * 获取借款手续费费率
     *
     * @return loan_rate - 借款手续费费率
     */
    public BigDecimal getLoanRate() {
        return loanRate;
    }

    /**
     * 设置借款手续费费率
     *
     * @param loanRate 借款手续费费率
     */
    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    /**
     * 获取短贷自动投资比例
     *
     * @return auto_short_proportion - 短贷自动投资比例
     */
    public BigDecimal getAutoShortProportion() {
        return autoShortProportion;
    }

    /**
     * 设置短贷自动投资比例
     *
     * @param autoShortProportion 短贷自动投资比例
     */
    public void setAutoShortProportion(BigDecimal autoShortProportion) {
        this.autoShortProportion = autoShortProportion;
    }

    /**
     * 获取长贷自动投资比例
     *
     * @return auto_long_proportion - 长贷自动投资比例
     */
    public BigDecimal getAutoLongProportion() {
        return autoLongProportion;
    }

    /**
     * 设置长贷自动投资比例
     *
     * @param autoLongProportion 长贷自动投资比例
     */
    public void setAutoLongProportion(BigDecimal autoLongProportion) {
        this.autoLongProportion = autoLongProportion;
    }

    /**
     * @return level_score
     */
    public BigDecimal getLevelScore() {
        return levelScore;
    }

    /**
     * @param levelScore
     */
    public void setLevelScore(BigDecimal levelScore) {
        this.levelScore = levelScore;
    }

    /**
     * @return limit_score
     */
    public BigDecimal getLimitScore() {
        return limitScore;
    }

    /**
     * @param limitScore
     */
    public void setLimitScore(BigDecimal limitScore) {
        this.limitScore = limitScore;
    }
}