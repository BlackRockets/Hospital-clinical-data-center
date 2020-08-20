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
    private Integer userId;
    /**
     * 角色id
     */
    private String roleId;


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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}