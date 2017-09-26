package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_constant")
public class Constant {
    /**
     * 编号
     */
    @Id
    @Column(name = "constant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long constantId;

    /**
     * 类型
     */
    private String type;

    @Column(name = "detail_type")
    private String detailType;

    /**
     * 常量值
     */
    private Integer value;

    /**
     * 说明
     */
    private String memo;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取编号
     *
     * @return constant_id - 编号
     */
    public Long getConstantId() {
        return constantId;
    }

    /**
     * 设置编号
     *
     * @param constantId 编号
     */
    public void setConstantId(Long constantId) {
        this.constantId = constantId;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return detail_type
     */
    public String getDetailType() {
        return detailType;
    }

    /**
     * @param detailType
     */
    public void setDetailType(String detailType) {
        this.detailType = detailType == null ? null : detailType.trim();
    }

    /**
     * 获取常量值
     *
     * @return value - 常量值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置常量值
     *
     * @param value 常量值
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取说明
     *
     * @return memo - 说明
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置说明
     *
     * @param memo 说明
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
}