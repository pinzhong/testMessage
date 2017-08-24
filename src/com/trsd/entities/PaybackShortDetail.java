package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payback_short_detail")
public class PaybackShortDetail {
    /**
     * 编号
     */
    @Id
    @Column(name = "payback_short_detail_id")
    private Long paybackShortDetailId;

    /**
     * 短贷投资编号
     */
    @Column(name = "lend_short_id")
    private Long lendShortId;

    /**
     * 还款金额
     */
    @Column(name = "payback_money")
    private BigDecimal paybackMoney;

    /**
     * 还款状态（提前还款，正常还款，逾期还款）
     */
    private Integer status;

    /**
     * 还款类型（本金，利息，违约金）
     */
    private Integer type;

    private Date createtime;

    /**
     * 获取编号
     *
     * @return payback_short_detail_id - 编号
     */
    public Long getPaybackShortDetailId() {
        return paybackShortDetailId;
    }

    /**
     * 设置编号
     *
     * @param paybackShortDetailId 编号
     */
    public void setPaybackShortDetailId(Long paybackShortDetailId) {
        this.paybackShortDetailId = paybackShortDetailId;
    }

    /**
     * 获取短贷投资编号
     *
     * @return lend_short_id - 短贷投资编号
     */
    public Long getLendShortId() {
        return lendShortId;
    }

    /**
     * 设置短贷投资编号
     *
     * @param lendShortId 短贷投资编号
     */
    public void setLendShortId(Long lendShortId) {
        this.lendShortId = lendShortId;
    }

    /**
     * 获取还款金额
     *
     * @return payback_money - 还款金额
     */
    public BigDecimal getPaybackMoney() {
        return paybackMoney;
    }

    /**
     * 设置还款金额
     *
     * @param paybackMoney 还款金额
     */
    public void setPaybackMoney(BigDecimal paybackMoney) {
        this.paybackMoney = paybackMoney;
    }

    /**
     * 获取还款状态（提前还款，正常还款，逾期还款）
     *
     * @return status - 还款状态（提前还款，正常还款，逾期还款）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置还款状态（提前还款，正常还款，逾期还款）
     *
     * @param status 还款状态（提前还款，正常还款，逾期还款）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取还款类型（本金，利息，违约金）
     *
     * @return type - 还款类型（本金，利息，违约金）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置还款类型（本金，利息，违约金）
     *
     * @param type 还款类型（本金，利息，违约金）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}