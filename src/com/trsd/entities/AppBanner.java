package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_app_banner")
public class AppBanner {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 位置（1：启动；2：首页横幅）
     */
    private Integer position;

    /**
     * 方向（1：竖屏；2：横屏）
     */
    private Integer direction;

    /**
     * 标题
     */
    private String title;

    /**
     * 文件路径
     */
    private String filepath;

    /**
     * 顺序
     */
    private Integer sort;

    /**
     * 状态（0：停用；1：使用）
     */
    private Integer status;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private Long updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取位置（1：启动；2：首页横幅）
     *
     * @return position - 位置（1：启动；2：首页横幅）
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置位置（1：启动；2：首页横幅）
     *
     * @param position 位置（1：启动；2：首页横幅）
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取方向（1：竖屏；2：横屏）
     *
     * @return direction - 方向（1：竖屏；2：横屏）
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * 设置方向（1：竖屏；2：横屏）
     *
     * @param direction 方向（1：竖屏；2：横屏）
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取文件路径
     *
     * @return filepath - 文件路径
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 设置文件路径
     *
     * @param filepath 文件路径
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * 获取顺序
     *
     * @return sort - 顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置顺序
     *
     * @param sort 顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取状态（0：停用；1：使用）
     *
     * @return status - 状态（0：停用；1：使用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0：停用；1：使用）
     *
     * @param status 状态（0：停用；1：使用）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取逻辑删除标记（0：显示；1：隐藏）
     *
     * @return del_flag - 逻辑删除标记（0：显示；1：隐藏）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置逻辑删除标记（0：显示；1：隐藏）
     *
     * @param delFlag 逻辑删除标记（0：显示；1：隐藏）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}