package com.hospitaldatacenter.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-08-12 15:56:15
 */
public class User implements Serializable {
    private static final long serialVersionUID = 762744281337421592L;
    /**
     * 用户Id
     */
    private Integer userId;
    /**
     * 科室Id
     */
    private Integer departmentId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别(0:女；1：男)
     */
    private Integer sex;
    /**
     * 电话
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 盐
     */
    private String salt;
    /**
     * 职业
     */
    private Integer occupationId;

    private Departments departments;

    private Set<Role> role;


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
    public String getCredentialsSalt() {
        return name + salt + salt;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", salt='" + salt + '\'' +
                ", occupationId=" + occupationId +
                ", departments=" + departments +
                ", role=" + role +
                '}';
    }
}