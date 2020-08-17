package com.hospitaldatacenter.entity;

import java.io.Serializable;
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
     * 角色名
     */
    private String roleName;

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