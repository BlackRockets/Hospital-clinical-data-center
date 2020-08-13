package com.hospitaldatacenter.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 模板(Template)实体类
 *
 * @author makejava
 * @since 2020-08-12 09:40:18
 */
public class Template implements Serializable {
    private static final long serialVersionUID = 518069379604463634L;
    /**
     * 模板id
     */
    private Integer templateId;
    /**
     * 随访组Id
     */
    private Integer followUpGroupId;
    /**
     * 模板名称
     */
    private String templateName;
    /**
     * 创建日期
     */
    private Date creationDate;
    /**
     * 创建者
     */
    private String creator;
    /**
     * 更新日期
     */
    private Date updateDate;
    /**
     * 更新者
     */
    private String updatedBy;
    /**
     * 版本号
     */
    private String versionNumber;
    /**
     * 状态(1:当前版本；2：未发布；3：已发布)
     */
    private Integer templateState;

    private FollowUpGroupManagement fm;


    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getFollowUpGroupId() {
        return followUpGroupId;
    }

    public void setFollowUpGroupId(Integer followUpGroupId) {
        this.followUpGroupId = followUpGroupId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Integer getTemplateState() {
        return templateState;
    }

    public void setTemplateState(Integer templateState) {
        this.templateState = templateState;
    }

    @Override
    public String toString() {
        return "Template{" +
                "templateId=" + templateId +
                ", followUpGroupId=" + followUpGroupId +
                ", templateName='" + templateName + '\'' +
                ", creationDate=" + creationDate +
                ", creator='" + creator + '\'' +
                ", updateDate=" + updateDate +
                ", updatedBy='" + updatedBy + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", templateState=" + templateState +
                ", fm=" + fm +
                '}';
    }

    public FollowUpGroupManagement getFm() {
        return fm;
    }

    public void setFm(FollowUpGroupManagement fm) {
        this.fm = fm;
    }
}