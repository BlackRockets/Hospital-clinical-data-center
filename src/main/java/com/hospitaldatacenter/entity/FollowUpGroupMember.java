package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 随访组组员(FollowUpGroupMember)实体类
 *
 * @author makejava
 * @since 2020-08-20 16:03:25
 */
public class FollowUpGroupMember implements Serializable {
    private static final long serialVersionUID = -83444102836745064L;

    private Integer id;
    /**
     * 随访组id
     */
    private Integer followUpGroupId;
    /**
     * 成员id
     */
    private String userId;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 权限id集合
     */
    private String menuId;
    /**
     * 用户名
     */
    private String name;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowUpGroupId() {
        return followUpGroupId;
    }

    public void setFollowUpGroupId(Integer followUpGroupId) {
        this.followUpGroupId = followUpGroupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}