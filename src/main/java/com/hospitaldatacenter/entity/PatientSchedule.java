package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 患者明细表(PatientSchedule)实体类
 *
 * @author makejava
 * @since 2020-08-07 10:31:12
 */
public class PatientSchedule implements Serializable {
    private static final long serialVersionUID = -19872829512905186L;

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
    private Object whitebloodcell;
    /**
     * 血糖
     */
    private Object bloodsugar;
    /**
     * 症状
     */
    private String symptom;
    /**
     * 患者基本信息id
     */
    private Integer patientInfoId;

    private String  condition;

    @Override
    public String toString() {
        return "PatientSchedule{" +
                "id=" + id +
                ", groupDetailId=" + groupDetailId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", nation='" + nation + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", whitebloodcell=" + whitebloodcell +
                ", bloodsugar=" + bloodsugar +
                ", symptom='" + symptom + '\'' +
                ", patientInfoId=" + patientInfoId +
                ", condition='" + condition + '\'' +
                ", followUpGroupManagement=" + followUpGroupManagement +
                ", scheduleOfFollowUpGroup=" + scheduleOfFollowUpGroup +
                '}';
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    private FollowUpGroupManagement followUpGroupManagement;

    private ScheduleOfFollowUpGroup scheduleOfFollowUpGroup;

    public ScheduleOfFollowUpGroup getScheduleOfFollowUpGroup() {
        return scheduleOfFollowUpGroup;
    }

    public void setScheduleOfFollowUpGroup(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup) {
        this.scheduleOfFollowUpGroup = scheduleOfFollowUpGroup;
    }

    public FollowUpGroupManagement getFollowUpGroupManagement() {
        return followUpGroupManagement;
    }

    public void setFollowUpGroupManagement(FollowUpGroupManagement followUpGroupManagement) {
        this.followUpGroupManagement = followUpGroupManagement;
    }

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

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Integer getPatientInfoId() {
        return patientInfoId;
    }

    public void setPatientInfoId(Integer patientInfoId) {
        this.patientInfoId = patientInfoId;
    }

}