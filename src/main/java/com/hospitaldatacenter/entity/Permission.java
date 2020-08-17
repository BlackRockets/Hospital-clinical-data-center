package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2020-08-14 16:27:58
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 560916193964665544L;
    /**
     * id
     */
    private Integer id;
    /**
     * 科室id
     */
    private Integer departmentId;
    /**
     * 人员id
     */
    private Integer personId;

    private HospitalPerson hp;

    private Departments departments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public HospitalPerson getHp() {
        return hp;
    }

    public void setHp(HospitalPerson hp) {
        this.hp = hp;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }
}