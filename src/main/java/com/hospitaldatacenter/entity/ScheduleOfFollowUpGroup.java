package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)实体类
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
 */
public class ScheduleOfFollowUpGroup implements Serializable {
    private static final long serialVersionUID = -93441326573791410L;

    private Integer id;
    /**
     * 随访组id
     */
    private Integer followUpGroupId;
    /**
     * 住院号
     */
    private String inpatientNumber;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Object age;
    /**
     * 入组日期
     */
    private String groupEntryTime;
    /**
     * 门诊号
     */
    private String outpatientNumber;
    /**
     * 下次随访日期
     */
    private String dateOfNextFollowUp;
    /**
     * 随访状态
     */
    private String followUpState;
    /**
     * 筛选条件
     * 开始时间
     */
    private String startTime;
    /**
     * 筛选条件
     * 结束时间
     */
    private String endTime;
    /**
     * 随访组对象
     */
    private FollowUpGroupManagement followUpGroupManagement;

    private HospitalPerson hp;

    private PatientSchedule ps;

    @Override
    public String toString() {
        return "ScheduleOfFollowUpGroup{" +
                "id=" + id +
                ", followUpGroupId=" + followUpGroupId +
                ", inpatientNumber='" + inpatientNumber + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", groupEntryTime='" + groupEntryTime + '\'' +
                ", outpatientNumber='" + outpatientNumber + '\'' +
                ", dateOfNextFollowUp='" + dateOfNextFollowUp + '\'' +
                ", followUpState='" + followUpState + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", followUpGroupManagement=" + followUpGroupManagement +
                '}';
    }

    public FollowUpGroupManagement getFollowUpGroupManagement() {
        return followUpGroupManagement;
    }

    public void setFollowUpGroupManagement(FollowUpGroupManagement followUpGroupManagement) {
        this.followUpGroupManagement = followUpGroupManagement;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowUpGroupId() {
        return followUpGroupId;
    }

    public void setFollowUpGroupId(Integer followUpGroupId) {
        this.followUpGroupId = followUpGroupId;
    }

    public String getInpatientNumber() {
        return inpatientNumber;
    }

    public void setInpatientNumber(String inpatientNumber) {
        this.inpatientNumber = inpatientNumber;
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

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public String getGroupEntryTime() {
        return groupEntryTime;
    }

    public void setGroupEntryTime(String groupEntryTime) {
        this.groupEntryTime = groupEntryTime;
    }

    public String getOutpatientNumber() {
        return outpatientNumber;
    }

    public void setOutpatientNumber(String outpatientNumber) {
        this.outpatientNumber = outpatientNumber;
    }

    public String getDateOfNextFollowUp() {
        return dateOfNextFollowUp;
    }

    public void setDateOfNextFollowUp(String dateOfNextFollowUp) {
        this.dateOfNextFollowUp = dateOfNextFollowUp;
    }

    public String getFollowUpState() {
        return followUpState;
    }

    public void setFollowUpState(String followUpState) {
        this.followUpState = followUpState;
    }

    public HospitalPerson getHp() {
        return hp;
    }

    public void setHp(HospitalPerson hp) {
        this.hp = hp;
    }

    public PatientSchedule getPs() {
        return ps;
    }

    public void setPs(PatientSchedule ps) {
        this.ps = ps;
    }
}