package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_short_config")
public class LendShortConfig {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_short_config_id")
    private Long lendShortConfigId;

    /**
     * 短贷投资计划编号
     */
    @Column(name = "lend_short_scheme_id")
    private Long lendShortSchemeId;

    /**
     * 参数类型
     */
    private Integer type;

    /**
     * 参数值
     */
    private BigDecimal value;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 相关操作，大于等于等
     */
    private String handle;

    private Integer flag;

    /**
     * 获取编号
     *
     * @return lend_short_config_id - 编号
     */
    public Long getLendShortConfigId() {
        return lendShortConfigId;
    }

    /**
     * 设置编号
     *
     * @param lendShortConfigId 编号
     */
    public void setLendShortConfigId(Long lendShortConfigId) {
        this.lendShortConfigId = lendShortConfigId;
    }

    /**
     * 获取短贷投资计划编号
     *
     * @return lend_short_scheme_id - 短贷投资计划编号
     */
    public Long getLendShortSchemeId() {
        return lendShortSchemeId;
    }

    /**
     * 设置短贷投资计划编号
     *
     * @param lendShortSchemeId 短贷投资计划编号
     */
    public void setLendShortSchemeId(Long lendShortSchemeId) {
        this.lendShortSchemeId = lendShortSchemeId;
    }

    /**
     * 获取参数类型
     *
     * @return type - 参数类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置参数类型
     *
     * @param type 参数类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取参数值
     *
     * @return value - 参数值
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置参数值
     *
     * @param value 参数值
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
     * 获取相关操作，大于等于等
     *
     * @return handle - 相关操作，大于等于等
     */
    public String getHandle() {
        return handle;
    }

    /**
     * 设置相关操作，大于等于等
     *
     * @param handle 相关操作，大于等于等
     */
    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}