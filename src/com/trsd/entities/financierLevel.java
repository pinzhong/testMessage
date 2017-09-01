package com.trsd.entities;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_financier_level")
public class financierLevel {
    /**
     * 等级
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer level;

    /**
     * 短贷投资利率
     */
    @Column(name = "short_rate")
    private BigDecimal shortRate;

    /**
     * 长贷投资利率
     */
    @Column(name = "long_rate")
    private BigDecimal longRate;

    /**
     * 收益费率
     */
    @Column(name = "payback_rate")
    private BigDecimal paybackRate;

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
     * 获取短贷投资利率
     *
     * @return short_rate - 短贷投资利率
     */
    public BigDecimal getShortRate() {
        return shortRate;
    }

    /**
     * 设置短贷投资利率
     *
     * @param shortRate 短贷投资利率
     */
    public void setShortRate(BigDecimal shortRate) {
        this.shortRate = shortRate;
    }

    /**
     * 获取长贷投资利率
     *
     * @return long_rate - 长贷投资利率
     */
    public BigDecimal getLongRate() {
        return longRate;
    }

    /**
     * 设置长贷投资利率
     *
     * @param longRate 长贷投资利率
     */
    public void setLongRate(BigDecimal longRate) {
        this.longRate = longRate;
    }

    /**
     * 获取收益费率
     *
     * @return payback_rate - 收益费率
     */
    public BigDecimal getPaybackRate() {
        return paybackRate;
    }

    /**
     * 设置收益费率
     *
     * @param paybackRate 收益费率
     */
    public void setPaybackRate(BigDecimal paybackRate) {
        this.paybackRate = paybackRate;
    }
}