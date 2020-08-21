package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (Menu)实体类
 *
 * @author makejava
 * @since 2020-08-20 16:03:47
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = -97740323537255119L;

    private Integer id;
    /**
     * 名称
     */
    private String mname;
    /**
     * 资源类型
     */
    private String resourceType;
    /**
     * 资源路径
     */
    private String url;
    /**
     * 权限字符串
     */
    private String permission;

    private FollowUpGroupManagement fugm;

    private Role role;

    private RoleMenu rm;

    private User user;

    private User ur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public FollowUpGroupManagement getFugm() {
        return fugm;
    }

    public void setFugm(FollowUpGroupManagement fugm) {
        this.fugm = fugm;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RoleMenu getRm() {
        return rm;
    }

    public void setRm(RoleMenu rm) {
        this.rm = rm;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUr() {
        return ur;
    }

    public void setUr(User ur) {
        this.ur = ur;
    }
}