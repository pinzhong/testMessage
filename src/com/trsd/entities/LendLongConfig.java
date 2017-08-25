package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_long_config")
public class LendLongConfig {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_long_config_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendLongConfigId;

    /**
     * 长贷借款计划编号
     */
    @Column(name = "lend_long_scheme_id")
    private Long lendLongSchemeId;

    /**
     * 参数类型
     */
    private Integer type;

    /**
     * 参数值
     */
    private String value;

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
     * @return lend_long_config_id - 编号
     */
    public Long getLendLongConfigId() {
        return lendLongConfigId;
    }

    /**
     * 设置编号
     *
     * @param lendLongConfigId 编号
     */
    public void setLendLongConfigId(Long lendLongConfigId) {
        this.lendLongConfigId = lendLongConfigId;
    }

    /**
     * 获取长贷借款计划编号
     *
     * @return lend_long_scheme_id - 长贷借款计划编号
     */
    public Long getLendLongSchemeId() {
        return lendLongSchemeId;
    }

    /**
     * 设置长贷借款计划编号
     *
     * @param lendLongSchemeId 长贷借款计划编号
     */
    public void setLendLongSchemeId(Long lendLongSchemeId) {
        this.lendLongSchemeId = lendLongSchemeId;
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
    public String getValue() {
        return value;
    }

    /**
     * 设置参数值
     *
     * @param value 参数值
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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