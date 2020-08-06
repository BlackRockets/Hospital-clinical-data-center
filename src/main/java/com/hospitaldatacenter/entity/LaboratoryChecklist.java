package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (LaboratoryChecklist)实体类
 *
 * @author makejava
 * @since 2020-08-06 17:25:00
 */
public class LaboratoryChecklist implements Serializable {
    private static final long serialVersionUID = 329252356322200132L;

    private Integer id;
    /**
     * 体检者
     */
    private String medicalexaminer;
    /**
     * 科室
     */
    private String departments;
    /**
     * 检查时间
     */
    private String checktime;
    /**
     * 白细胞含量
     */
    private String whiteblood
    cell
    /**
     * 血糖
     */
    private String bloodsugar;
    /**
     * 检查名称
     */
    private String checkname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicalexaminer() {
        return medicalexaminer;
    }

    public void setMedicalexaminer(String medicalexaminer) {
        this.medicalexaminer = medicalexaminer;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getWhiteblood

    cell() {
        return whiteblood cell;
    }

    public void setWhiteblood

    cell(String whiteblood cell) {
        this.whiteblood cell = whiteblood cell;
    }

    public String getBloodsugar() {
        return bloodsugar;
    }

    public void setBloodsugar(String bloodsugar) {
        this.bloodsugar = bloodsugar;
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname;
    }

}