package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 实验室检查表(LaboratoryChecklist)实体类
 *
 * @author makejava
 * @since 2020-08-07 10:35:04
 */
public class LaboratoryChecklist implements Serializable {
    private static final long serialVersionUID = -43327152834374105L;

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
    private Object whitebloodcell;
    /**
     * 血糖
     */
    private Object bloodsugar;
    /**
     * 检查名称
     */
    private String checkname;
    /**
     * 患者信息id
     */
    private Integer patientInfoId;


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

    public Object getWhitebloodcell() {
        return whitebloodcell;
    }

    public void setWhitebloodcell(Object whitebloodcell) {
        this.whitebloodcell = whitebloodcell;
    }

    public Object getBloodsugar() {
        return bloodsugar;
    }

    public void setBloodsugar(Object bloodsugar) {
        this.bloodsugar = bloodsugar;
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname;
    }

    public Integer getPatientInfoId() {
        return patientInfoId;
    }

    public void setPatientInfoId(Integer patientInfoId) {
        this.patientInfoId = patientInfoId;
    }

}