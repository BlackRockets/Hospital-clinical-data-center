package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 随访组管理表(FollowUpGroupManagement)实体类
 *
 * @author makejava
 * @since 2020-08-07 10:31:05
 */
public class FollowUpGroupManagement implements Serializable {
    private static final long serialVersionUID = -99614881521124655L;
    /**
     * id
     */
    private Integer id;
    /**
     * 随访组名称
     */
    private String groupName;
    /**
     * 入组率
     */
    private String enrolmentRate;
    /**
     * 负责人
     */
    private String personInCharge;
    /**
     * 级别
     */
    private String level;
    /**
     * 状态
     */
    private String state;
    /**
     * 责任医院
     */
    private String responsibilityHospital;
    /**
     * 责任科室
     */
    private String responsibilityDepartments;
    /**
     * 创建人
     */
    private String createPeople;
    /**
     * 创建日期
     */
    private String createTime;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 课题编号
     */
    private String courseNumber;
    /**
     * 患者数量
     */
    private Integer numberOfPatients;
    /**
     * 背景
     */
    private String background;
    /**
     * 备用字段1
     */
    private String standbyFiled1;
    /**
     * 备用字段2
     */
    private String standbyFiled2;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getEnrolmentRate() {
        return enrolmentRate;
    }

    public void setEnrolmentRate(String enrolmentRate) {
        this.enrolmentRate = enrolmentRate;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResponsibilityHospital() {
        return responsibilityHospital;
    }

    public void setResponsibilityHospital(String responsibilityHospital) {
        this.responsibilityHospital = responsibilityHospital;
    }

    public String getResponsibilityDepartments() {
        return responsibilityDepartments;
    }

    public void setResponsibilityDepartments(String responsibilityDepartments) {
        this.responsibilityDepartments = responsibilityDepartments;
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Integer getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(Integer numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getStandbyFiled1() {
        return standbyFiled1;
    }

    public void setStandbyFiled1(String standbyFiled1) {
        this.standbyFiled1 = standbyFiled1;
    }

    public String getStandbyFiled2() {
        return standbyFiled2;
    }

    public void setStandbyFiled2(String standbyFiled2) {
        this.standbyFiled2 = standbyFiled2;
    }

}