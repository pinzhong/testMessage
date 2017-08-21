package com.trsd.entities;

import java.util.Date;

public class AppBanner {
    /**
     * 编号
     */
    private Long id;

    /**
     * 位置（1：启动；2：首页横幅）
     */
    private Byte position;

    /**
     * 方向（1：竖屏；2：横屏）
     */
    private Byte direction;

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
    private Byte status;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 编号
     * @return id 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 位置（1：启动；2：首页横幅）
     * @return position 位置（1：启动；2：首页横幅）
     */
    public Byte getPosition() {
        return position;
    }

    /**
     * 位置（1：启动；2：首页横幅）
     * @param position 位置（1：启动；2：首页横幅）
     */
    public void setPosition(Byte position) {
        this.position = position;
    }

    /**
     * 方向（1：竖屏；2：横屏）
     * @return direction 方向（1：竖屏；2：横屏）
     */
    public Byte getDirection() {
        return direction;
    }

    /**
     * 方向（1：竖屏；2：横屏）
     * @param direction 方向（1：竖屏；2：横屏）
     */
    public void setDirection(Byte direction) {
        this.direction = direction;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 文件路径
     * @return filepath 文件路径
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 文件路径
     * @param filepath 文件路径
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    /**
     * 顺序
     * @return sort 顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 顺序
     * @param sort 顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 状态（0：停用；1：使用）
     * @return status 状态（0：停用；1：使用）
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态（0：停用；1：使用）
     * @param status 状态（0：停用；1：使用）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新人
     * @return update_by 更新人
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     * @param updateBy 更新人
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     * @return del_flag 逻辑删除标记（0：显示；1：隐藏）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     * @param delFlag 逻辑删除标记（0：显示；1：隐藏）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * 备注
     * @return remarks 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}