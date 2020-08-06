package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (PatientSchedule)实体类
 *
 * @author makejava
 * @since 2020-08-06 17:25:01
 */
public class PatientSchedule implements Serializable {
    private static final long serialVersionUID = 573032999363130250L;

    private Integer id;
    /**
     * 随访明细id
     */
    private Integer groupDetailId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 出生日期
     */
    private String birth;
    /**
     * 民族
     */
    private String nation;
    /**
     * 身高
     */
    private Integer height;
    /**
     * 体重
     */
    private Integer weight;
    /**
     * 白细胞
     */
    private Integer whitebloodcell;
    /**
     * 血糖
     */
    private Integer bloodsugar;
    /**
     * 症状
     */
    private String symptom;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupDetailId() {
        return groupDetailId;
    }

    public void setGroupDetailId(Integer groupDetailId) {
        this.groupDetailId = groupDetailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWhitebloodcell() {
        return whitebloodcell;
    }

    public void setWhitebloodcell(Integer whitebloodcell) {
        this.whitebloodcell = whitebloodcell;
    }

    public Integer getBloodsugar() {
        return bloodsugar;
    }

    public void setBloodsugar(Integer bloodsugar) {
        this.bloodsugar = bloodsugar;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

}