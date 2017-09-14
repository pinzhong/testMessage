package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_weixin_reply")
public class WeixinReply {
    @Id
    @Column(name = "weixin_reply_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer weixinReplyId;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 匹配类型
     */
    @Column(name = "match_type")
    private Short matchType;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 床时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return weixin_reply_id
     */
    public Integer getWeixinReplyId() {
        return weixinReplyId;
    }

    /**
     * @param weixinReplyId
     */
    public void setWeixinReplyId(Integer weixinReplyId) {
        this.weixinReplyId = weixinReplyId;
    }

    /**
     * 获取关键字
     *
     * @return keyword - 关键字
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置关键字
     *
     * @param keyword 关键字
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * 获取匹配类型
     *
     * @return match_type - 匹配类型
     */
    public Short getMatchType() {
        return matchType;
    }

    /**
     * 设置匹配类型
     *
     * @param matchType 匹配类型
     */
    public void setMatchType(Short matchType) {
        this.matchType = matchType;
    }

    /**
     * 获取回复内容
     *
     * @return content - 回复内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置回复内容
     *
     * @param content 回复内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取床时间
     *
     * @return create_time - 床时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置床时间
     *
     * @param createTime 床时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}