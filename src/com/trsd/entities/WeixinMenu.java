package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_weixin_menu")
public class WeixinMenu {
    @Id
    @Column(name = "weixin_menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer weixinMenuId;

    /**
     * 菜单类型
     */
    private Short type;

    /**
     * 菜单文字
     */
    private String name;

    /**
     * 菜单对应关键字
     */
    private String key;

    /**
     * 跳转url
     */
    private String url;

    /**
     * 素材id
     */
    @Column(name = "media_id")
    private String mediaId;

    /**
     * 父菜单id
     */
    @Column(name = "parent_menu_id")
    private Integer parentMenuId;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * @return weixin_menu_id
     */
    public Integer getWeixinMenuId() {
        return weixinMenuId;
    }

    /**
     * @param weixinMenuId
     */
    public void setWeixinMenuId(Integer weixinMenuId) {
        this.weixinMenuId = weixinMenuId;
    }

    /**
     * 获取菜单类型
     *
     * @return type - 菜单类型
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置菜单类型
     *
     * @param type 菜单类型
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 获取菜单文字
     *
     * @return name - 菜单文字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单文字
     *
     * @param name 菜单文字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取菜单对应关键字
     *
     * @return key - 菜单对应关键字
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置菜单对应关键字
     *
     * @param key 菜单对应关键字
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * 获取跳转url
     *
     * @return url - 跳转url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置跳转url
     *
     * @param url 跳转url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取素材id
     *
     * @return media_id - 素材id
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * 设置素材id
     *
     * @param mediaId 素材id
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    /**
     * 获取父菜单id
     *
     * @return parent_menu_id - 父菜单id
     */
    public Integer getParentMenuId() {
        return parentMenuId;
    }

    /**
     * 设置父菜单id
     *
     * @param parentMenuId 父菜单id
     */
    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}