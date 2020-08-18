package com.hospitaldatacenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 术语审批
 * (TermApproval)实体类
 *
 * @author makejava
 * @since 2020-08-18 15:40:27
 */
public class TermApproval implements Serializable {
    private static final long serialVersionUID = -86268859362368409L;
    /**
     * id
     */
    private Integer id;
    /**
     * 随访组id
     */
    private Integer followUpGroupId;
    /**
     * 科室id
     */
    private Integer departmentId;
    /**
     * 分类
     */
    private String classification;
    /**
     * 名称
     */
    private String name;
    /**
     * 提交人
     */
    private String submitter;
    /**
     * 提交时间
     */
    private Date submissionTime;
    /**
     * 审批状态(0:未审批；1：通过；2：拒绝)
     */
    private Integer state;


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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}