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
     * 随访组id
     */
    private Integer followUpGroupId;
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
    /**
     * 疾病名称
     */
    private String diseaseName;
    /**
     * 疾病代码
     */
    private String diseaseCode;
    /**
     * 疾病代码1
     */
    private String diseaseCode1;
    /**
     * 疾病代码2
     */
    private String diseaseCode2;
    /**
     * 所在科室id
     */
    private Integer departmentsId;
    /**
     * 住院号
     */
    private Integer inpatientNumber;
    /**
     * 门诊号
     */
    private Integer outpatientNumber;
    /**
     * 入组日期
     */
    private String groupEntryTime;
    /**
     * 随访状态
     */
    private String followUpState;
    /**
     * 医生id
     */
    private Integer doctorId;
    /**
     * 护士id
     */
    private Integer nurseId;
    /**
     * 技师id
     */
    private Integer technicianId;
    /**
     * 药师id
     */
    private Integer pharmacistId;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getNurseId() {
        return nurseId;
    }

    public void setNurseId(Integer nurseId) {
        this.nurseId = nurseId;
    }

    public Integer getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(Integer technicianId) {
        this.technicianId = technicianId;
    }

    public Integer getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(Integer pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public String getDiseaseCode1() {
        return diseaseCode1;
    }

    public void setDiseaseCode1(String diseaseCode1) {
        this.diseaseCode1 = diseaseCode1;
    }

    public String getDiseaseCode2() {
        return diseaseCode2;
    }

    public void setDiseaseCode2(String diseaseCode2) {
        this.diseaseCode2 = diseaseCode2;
    }

    public Integer getFollowUpGroupId() {
        return followUpGroupId;
    }

    public void setFollowUpGroupId(Integer followUpGroupId) {
        this.followUpGroupId = followUpGroupId;
    }

    public String getFollowUpState() {
        return followUpState;
    }

    public void setFollowUpState(String followUpState) {
        this.followUpState = followUpState;
    }

    public String getGroupEntryTime() {
        return groupEntryTime;
    }

    public void setGroupEntryTime(String groupEntryTime) {
        this.groupEntryTime = groupEntryTime;
    }

    public Integer getInpatientNumber() {
        return inpatientNumber;
    }

    public void setInpatientNumber(Integer inpatientNumber) {
        this.inpatientNumber = inpatientNumber;
    }

    public Integer getOutpatientNumber() {
        return outpatientNumber;
    }

    public void setOutpatientNumber(Integer outpatientNumber) {
        this.outpatientNumber = outpatientNumber;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public Integer getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(Integer departmentsId) {
        this.departmentsId = departmentsId;
    }

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