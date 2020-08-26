package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (Departments)实体类
 *
 * @author makejava
 * @since 2020-08-13 09:11:32
 */
public class Departments implements Serializable {
    private static final long serialVersionUID = -97043260170215186L;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}