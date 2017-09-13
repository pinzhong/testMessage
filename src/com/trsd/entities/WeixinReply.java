package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_weixin_reply")
public class WeixinReply {
    @Id
    @Column(name = "weixin_reply_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer weixinReplyId;

    private String keyword;

    @Column(name = "match_type")
    private Short matchType;

    private String content;

    @Column(name = "create_time")
    private Date createTime;

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
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * @return match_type
     */
    public Short getMatchType() {
        return matchType;
    }

    /**
     * @param matchType
     */
    public void setMatchType(Short matchType) {
        this.matchType = matchType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}