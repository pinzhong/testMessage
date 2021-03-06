package com.trsd.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_lend_scheme")
public class LendScheme {
    /**
     * 编号
     */
    @Id
    @Column(name = "lend_scheme_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendSchemeId;

    /**
     * 业务编号
     */
    @Column(name = "lend_scheme_key")
    private String lendSchemeKey;

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
     * 投资类型（长贷，短贷）
     */
    @Column(name = "lend_type")
    private Integer lendType;

    /**
     * 当日投资限额
     */
    @Column(name = "day_limit_account")
    private BigDecimal dayLimitAccount;

    /**
     * 单笔投资限额
     */
    @Column(name = "single_limit_account")
    private BigDecimal singleLimitAccount;

    /**
     * 今日已投资金额
     */
    @Column(name = "today_lend_money")
    private BigDecimal todayLendMoney;

    /**
     * 获取编号
     *
     * @return lend_scheme_id - 编号
     */
    public Long getLendSchemeId() {
        return lendSchemeId;
    }

    /**
     * 设置编号
     *
     * @param lendSchemeId 编号
     */
    public void setLendSchemeId(Long lendSchemeId) {
        this.lendSchemeId = lendSchemeId;
    }

    /**
     * 获取业务编号
     *
     * @return lend_scheme_key - 业务编号
     */
    public String getLendSchemeKey() {
        return lendSchemeKey;
    }

    /**
     * 设置业务编号
     *
     * @param lendSchemeKey 业务编号
     */
    public void setLendSchemeKey(String lendSchemeKey) {
        this.lendSchemeKey = lendSchemeKey == null ? null : lendSchemeKey.trim();
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

    /**
     * 获取投资类型（长贷，短贷）
     *
     * @return lend_type - 投资类型（长贷，短贷）
     */
    public Integer getLendType() {
        return lendType;
    }

    /**
     * 设置投资类型（长贷，短贷）
     *
     * @param lendType 投资类型（长贷，短贷）
     */
    public void setLendType(Integer lendType) {
        this.lendType = lendType;
    }

    /**
     * 获取当日投资限额
     *
     * @return day_limit_account - 当日投资限额
     */
    public BigDecimal getDayLimitAccount() {
        return dayLimitAccount;
    }

    /**
     * 设置当日投资限额
     *
     * @param dayLimitAccount 当日投资限额
     */
    public void setDayLimitAccount(BigDecimal dayLimitAccount) {
        this.dayLimitAccount = dayLimitAccount;
    }

    /**
     * 获取单笔投资限额
     *
     * @return single_limit_account - 单笔投资限额
     */
    public BigDecimal getSingleLimitAccount() {
        return singleLimitAccount;
    }

    /**
     * 设置单笔投资限额
     *
     * @param singleLimitAccount 单笔投资限额
     */
    public void setSingleLimitAccount(BigDecimal singleLimitAccount) {
        this.singleLimitAccount = singleLimitAccount;
    }

    /**
     * 获取今日已投资金额
     *
     * @return today_lend_money - 今日已投资金额
     */
    public BigDecimal getTodayLendMoney() {
        return todayLendMoney;
    }

    /**
     * 设置今日已投资金额
     *
     * @param todayLendMoney 今日已投资金额
     */
    public void setTodayLendMoney(BigDecimal todayLendMoney) {
        this.todayLendMoney = todayLendMoney;
    }
}