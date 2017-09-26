package com.trsd.entities;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_push_login")
public class PushLogin {
    /**
     * 编号
     */
    @Id
    @Column(name = "push_login_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pushLoginId;

    /**
     * 主键ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 变动后的cid
     */
    @Column(name = "push_cid")
    private String pushCid;

    /**
     * 变动后的token
     */
    @Column(name = "push_token")
    private String pushToken;

    /**
     * create_time
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取编号
     *
     * @return push_login_id - 编号
     */
    public Long getPushLoginId() {
        return pushLoginId;
    }

    /**
     * 设置编号
     *
     * @param pushLoginId 编号
     */
    public void setPushLoginId(Long pushLoginId) {
        this.pushLoginId = pushLoginId;
    }

    /**
     * 获取主键ID
     *
     * @return user_id - 主键ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键ID
     *
     * @param userId 主键ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取变动后的cid
     *
     * @return push_cid - 变动后的cid
     */
    public String getPushCid() {
        return pushCid;
    }

    /**
     * 设置变动后的cid
     *
     * @param pushCid 变动后的cid
     */
    public void setPushCid(String pushCid) {
        this.pushCid = pushCid == null ? null : pushCid.trim();
    }

    /**
     * 获取变动后的token
     *
     * @return push_token - 变动后的token
     */
    public String getPushToken() {
        return pushToken;
    }

    /**
     * 设置变动后的token
     *
     * @param pushToken 变动后的token
     */
    public void setPushToken(String pushToken) {
        this.pushToken = pushToken == null ? null : pushToken.trim();
    }

    /**
     * 获取create_time
     *
     * @return create_time - create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time
     *
     * @param createTime create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}