package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (UserMenu)实体类
 *
 * @author makejava
 * @since 2020-08-21 14:28:05
 */
public class UserMenu implements Serializable {
    private static final long serialVersionUID = -72831406475194560L;

    private Integer id;
    /**
     * 随访组id
     */
    private Integer followUpGroupId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 权限id
     */
    private Integer menuId;

    public Integer getFollowUpGroupId() {
        return followUpGroupId;
    }

    public void setFollowUpGroupId(Integer followUpGroupId) {
        this.followUpGroupId = followUpGroupId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}