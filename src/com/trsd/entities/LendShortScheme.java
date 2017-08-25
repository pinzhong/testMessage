package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_short_scheme")
public class LendShortScheme {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_short_scheme_id")
    @GeneratedValue(generator = "JDBC")
    private Long lendShortSchemeId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 方案类型（机构方案，个人方案）
     */
    private Integer type;

    /**
     * 状态（在用，失效）
     */
    private Integer status;

    /**
     * 权重顺序
     */
    @Column(name = "scheme_order")
    private Integer schemeOrder;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 必要条件个数
     */
    @Column(name = "necessary_count")
    private Integer necessaryCount;

    /**
     * 获取编号
     *
     * @return lend_short_scheme_id - 编号
     */
    public Long getLendShortSchemeId() {
        return lendShortSchemeId;
    }

    /**
     * 设置编号
     *
     * @param lendShortSchemeId 编号
     */
    public void setLendShortSchemeId(Long lendShortSchemeId) {
        this.lendShortSchemeId = lendShortSchemeId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取方案类型（机构方案，个人方案）
     *
     * @return type - 方案类型（机构方案，个人方案）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置方案类型（机构方案，个人方案）
     *
     * @param type 方案类型（机构方案，个人方案）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取状态（在用，失效）
     *
     * @return status - 状态（在用，失效）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（在用，失效）
     *
     * @param status 状态（在用，失效）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取权重顺序
     *
     * @return scheme_order - 权重顺序
     */
    public Integer getSchemeOrder() {
        return schemeOrder;
    }

    /**
     * 设置权重顺序
     *
     * @param schemeOrder 权重顺序
     */
    public void setSchemeOrder(Integer schemeOrder) {
        this.schemeOrder = schemeOrder;
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
     * 获取必要条件个数
     *
     * @return necessary_count - 必要条件个数
     */
    public Integer getNecessaryCount() {
        return necessaryCount;
    }

    /**
     * 设置必要条件个数
     *
     * @param necessaryCount 必要条件个数
     */
    public void setNecessaryCount(Integer necessaryCount) {
        this.necessaryCount = necessaryCount;
    }
}