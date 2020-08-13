package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (Departments)实体类
 *
 * @author makejava
 * @since 2020-08-12 15:21:54
 */
public class Departments implements Serializable {
    private static final long serialVersionUID = 761425215567414690L;
    /**
     * id
     */
    private Integer id;
    /**
     * 科室名称
     */
    private String departmentsName;
    /**
     * 父级科室id
     */
    private Integer parentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(String departmentsName) {
        this.departmentsName = departmentsName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}