package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 角色权限表(RoleMenu)实体类
 *
 * @author makejava
 * @since 2020-08-19 14:35:07
 */
public class RoleMenu implements Serializable {
    private static final long serialVersionUID = 314156500477918262L;

    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 权限id
     */
    private Integer menuId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}