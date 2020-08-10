package com.hospitaldatacenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (DataReview)实体类
 *
 * @author makejava
 * @since 2020-08-07 11:46:12
 */
public class DataReview implements Serializable {
    private static final long serialVersionUID = -44732325666906952L;
    /**
     * id
     */
    private Integer id;
    /**
     * 随访组Id
     */
    private Integer followUpGroupId;
    /**
     * 患者Id
     */
    private Integer patientId;
    /**
     * 复核者
     */
    private String reviewer;
    /**
     * 复核时间
     */
    private Date reviewerTime;
    /**
     * 状态(1：待复核；2：已修正；3：已撤回)
     */
    private Integer state;
    /**
     * 数据项
     */
    private String dataItem;
    /**
     * 数据值
     */
    private Integer dataValue;
    /**
     * 表单(1:基本信息；2；检查信息)
     */

    private Integer form;
    /**
     * 质疑者
     */
    private String doubter;
    /**
     * 提出时间
     */
    private Date proposedTime;

    /**
     * 修改意见
     */
    private String revisionComments;

    private PatientSchedule ps;

    private ScheduleOfFollowUpGroup sofu;

    private FollowUpGroupManagement fugm;

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

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Date getReviewerTime() {
        return reviewerTime;
    }

    public void setReviewerTime(Date reviewerTime) {
        this.reviewerTime = reviewerTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public Integer getDataValue() {
        return dataValue;
    }

    public void setDataValue(Integer dataValue) {
        this.dataValue = dataValue;
    }

    public Integer getForm() {
        return form;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public PatientSchedule getPs() {
        return ps;
    }

    public void setPs(PatientSchedule ps) {
        this.ps = ps;
    }

    public ScheduleOfFollowUpGroup getSofu() {
        return sofu;
    }


    public String getDoubter() {
        return doubter;
    }

    public void setDoubter(String doubter) {
        this.doubter = doubter;
    }

    public Date getProposedTime() {
        return proposedTime;
    }

    public void setProposedTime(Date proposedTime) {
        this.proposedTime = proposedTime;
    }

    public String getRevisionComments() {
        return revisionComments;
    }

    public void setRevisionComments(String revisionComments) {
        this.revisionComments = revisionComments;
    }

    public void setSofu(ScheduleOfFollowUpGroup sofu) {
        this.sofu = sofu;
    }

    public FollowUpGroupManagement getFugm() {
        return fugm;
    }

    public void setFugm(FollowUpGroupManagement fugm) {
        this.fugm = fugm;
    }
}