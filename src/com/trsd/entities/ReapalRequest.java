package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reapal_request")
public class ReapalRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 流水号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * api类型
     */
    @Column(name = "api_url")
    private String apiUrl;

    /**
     * 摘要
     */
    private String summary;
    /**
     * 加密后的字符串信息
     */
    @Column(name = "encypt_info")
    private String encyptInfo;
    
    /**
     * 解密后的字符串信息
     */
    private String info;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取流水号
     *
     * @return order_no - 流水号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置流水号
     *
     * @param orderNo 流水号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取api类型
     *
     * @return api_url - api类型
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * 设置api类型
     *
     * @param apiUrl api类型
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl == null ? null : apiUrl.trim();
    }

    /**
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getEncyptInfo() {
		return encyptInfo;
	}

	public void setEncyptInfo(String encyptInfo) {
		this.encyptInfo = encyptInfo;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	/**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}