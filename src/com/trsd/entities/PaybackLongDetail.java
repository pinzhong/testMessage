package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payback_long_detail")
public class PaybackLongDetail {
    /**
     * 编号
     */
    @Id
    @Column(name = "payback_long_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paybackLongDetailId;

    /**
     * 长贷还款计划编号
     */
    @Column(name = "payback_long_id")
    private Long paybackLongId;

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
     * @return payback_long_detail_id - 编号
     */
    public Long getPaybackLongDetailId() {
        return paybackLongDetailId;
    }

    /**
     * 设置编号
     *
     * @param paybackLongDetailId 编号
     */
    public void setPaybackLongDetailId(Long paybackLongDetailId) {
        this.paybackLongDetailId = paybackLongDetailId;
    }

    /**
     * 获取长贷还款计划编号
     *
     * @return payback_long_id - 长贷还款计划编号
     */
    public Long getPaybackLongId() {
        return paybackLongId;
    }

    /**
     * 设置长贷还款计划编号
     *
     * @param paybackLongId 长贷还款计划编号
     */
    public void setPaybackLongId(Long paybackLongId) {
        this.paybackLongId = paybackLongId;
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