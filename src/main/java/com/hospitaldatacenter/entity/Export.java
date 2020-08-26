package com.hospitaldatacenter.entity;

public class Export {
    private Integer id;

    /**
     * 入组日期
     */
    private String groupEntryTime;
    /**
     * 随访组名称
     */
    private String groupName;
    /**
     * 责任科室
     */
    private String responsibilityDepartments;
    /**
     * 随访状态
     */
    private String followUpState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupEntryTime() {
        return groupEntryTime;
    }

    public void setGroupEntryTime(String groupEntryTime) {
        this.groupEntryTime = groupEntryTime;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getResponsibilityDepartments() {
        return responsibilityDepartments;
    }

    public void setResponsibilityDepartments(String responsibilityDepartments) {
        this.responsibilityDepartments = responsibilityDepartments;
    }

    public String getFollowUpState() {
        return followUpState;
    }

    public void setFollowUpState(String followUpState) {
        this.followUpState = followUpState;
    }
}
