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

}