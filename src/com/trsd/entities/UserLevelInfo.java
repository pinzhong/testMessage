package com.trsd.entities;

import java.math.BigDecimal;

public class UserLevelInfo {
    /** 等级  level **/
    private Integer level;

    /** 短贷利率  short_rate **/
    private BigDecimal shortRate;

    /** 长贷利率  long_rate **/
    private BigDecimal longRate;

    /** 借款手续费费率  loan_rate **/
    private BigDecimal loanRate;

    /**   等级  level   **/
    public Integer getLevel() {
        return level;
    }

    /**   等级  level   **/
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**   短贷利率  short_rate   **/
    public BigDecimal getShortRate() {
        return shortRate;
    }

    /**   短贷利率  short_rate   **/
    public void setShortRate(BigDecimal shortRate) {
        this.shortRate = shortRate;
    }

    /**   长贷利率  long_rate   **/
    public BigDecimal getLongRate() {
        return longRate;
    }

    /**   长贷利率  long_rate   **/
    public void setLongRate(BigDecimal longRate) {
        this.longRate = longRate;
    }

    /**   借款手续费费率  loan_rate   **/
    public BigDecimal getLoanRate() {
        return loanRate;
    }

    /**   借款手续费费率  loan_rate   **/
    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }
}