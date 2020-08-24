package com.hospitaldatacenter.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-08-17 14:58:10
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 418276653140884309L;
    /**
     * id
     */
    private Integer id;
    /**
     * 随访组组内每条数据id
     */
    private Integer teamDataId;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 角色等级
     */
    private String roleLevel;
    /**
     * 所有对应权限
     */
    private List<Menu> menus;
    /**
     * 所有用户
     */
    private List<User> users;

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    public Integer getTeamDataId() {
        return teamDataId;
    }

    public void setTeamDataId(Integer teamDataId) {
        this.teamDataId = teamDataId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Set<Permission> permission;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Set<Permission> getPermission() {
        return permission;
    }

    public void setPermission(Set<Permission> permission) {
        this.permission = permission;
    }
}