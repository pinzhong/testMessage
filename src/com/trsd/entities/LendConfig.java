package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_config")
public class LendConfig {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_config_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendConfigId;

    /**
     * 投资计划编号
     */
    @Column(name = "lend_scheme_id")
    private Long lendSchemeId;

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
     * 大于等于，小于等于等操作
     */
    private String handle;

    /**
     * 必须条件还是非必须条件
     */
    private Integer flag;

    /**
     * 获取编号
     *
     * @return lend_config_id - 编号
     */
    public Long getLendConfigId() {
        return lendConfigId;
    }

    /**
     * 设置编号
     *
     * @param lendConfigId 编号
     */
    public void setLendConfigId(Long lendConfigId) {
        this.lendConfigId = lendConfigId;
    }

    /**
     * 获取投资计划编号
     *
     * @return lend_scheme_id - 投资计划编号
     */
    public Long getLendSchemeId() {
        return lendSchemeId;
    }

    /**
     * 设置投资计划编号
     *
     * @param lendSchemeId 投资计划编号
     */
    public void setLendSchemeId(Long lendSchemeId) {
        this.lendSchemeId = lendSchemeId;
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
     * 获取大于等于，小于等于等操作
     *
     * @return handle - 大于等于，小于等于等操作
     */
    public String getHandle() {
        return handle;
    }

    /**
     * 设置大于等于，小于等于等操作
     *
     * @param handle 大于等于，小于等于等操作
     */
    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    /**
     * 获取必须条件还是非必须条件
     *
     * @return flag - 必须条件还是非必须条件
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置必须条件还是非必须条件
     *
     * @param flag 必须条件还是非必须条件
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}