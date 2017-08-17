package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;

public class PaybackShortDetail {
    /** 编号  payback_short_detail_id **/
    private Long paybackShortDetailId;

    /** 短贷投资编号  lend_short_id **/
    private Long lendShortId;

    /** 还款金额  payback_money **/
    private BigDecimal paybackMoney;

    /** 还款状态（提前还款，正常还款，逾期还款）  status **/
    private Integer status;

    /** 还款类型（本金，利息，违约金）  type **/
    private Integer type;

    /**   createtime **/
    private Date createtime;

    /**   编号  payback_short_detail_id   **/
    public Long getPaybackShortDetailId() {
        return paybackShortDetailId;
    }

    /**   编号  payback_short_detail_id   **/
    public void setPaybackShortDetailId(Long paybackShortDetailId) {
        this.paybackShortDetailId = paybackShortDetailId;
    }

    /**   短贷投资编号  lend_short_id   **/
    public Long getLendShortId() {
        return lendShortId;
    }

    /**   短贷投资编号  lend_short_id   **/
    public void setLendShortId(Long lendShortId) {
        this.lendShortId = lendShortId;
    }

    /**   还款金额  payback_money   **/
    public BigDecimal getPaybackMoney() {
        return paybackMoney;
    }

    /**   还款金额  payback_money   **/
    public void setPaybackMoney(BigDecimal paybackMoney) {
        this.paybackMoney = paybackMoney;
    }

    /**   还款状态（提前还款，正常还款，逾期还款）  status   **/
    public Integer getStatus() {
        return status;
    }

    /**   还款状态（提前还款，正常还款，逾期还款）  status   **/
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**   还款类型（本金，利息，违约金）  type   **/
    public Integer getType() {
        return type;
    }

    /**   还款类型（本金，利息，违约金）  type   **/
    public void setType(Integer type) {
        this.type = type;
    }

    /**     createtime   **/
    public Date getCreatetime() {
        return createtime;
    }

    /**     createtime   **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}