package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (HospitalPerson)实体类
 *
 * @author makejava
 * @since 2020-08-14 16:43:31
 */
public class HospitalPerson implements Serializable {
    private static final long serialVersionUID = 937945705588602630L;
    /**
     * id
     */
    private Integer id;
    /**
     * 人员名称
     */
    private String personName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}