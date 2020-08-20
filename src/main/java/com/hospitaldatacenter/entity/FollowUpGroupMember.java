package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 随访组组员(FollowUpGroupMember)实体类
 *
 * @author makejava
 * @since 2020-08-20 14:04:06
 */
public class FollowUpGroupMember implements Serializable {
    private static final long serialVersionUID = -80806540217074710L;

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
    /**
     * 姓名
     */
    private String name;

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