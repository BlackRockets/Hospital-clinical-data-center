package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 诊疗方案(DiagnosisAndTreatmentScheme)实体类
 *
 * @author makejava
 * @since 2020-08-12 09:31:23
 */
public class DiagnosisAndTreatmentScheme implements Serializable {
    private static final long serialVersionUID = -67987860381293002L;

    /**
     * id
     */
    private Integer id;
    /**
     * 用药
     */
    private String pharmacy;
    /**
     * 检验
     */
    private String checkout;
    /**
     * 检查
     */
    private String examine;
    /**
     * 治疗
     */
    private String treat;
    /**
     * 手术
     */
    private String operation;
    /**
     * 通知
     */
    private String inform;
    /**
     * 随访组id
     */
    private int followUpGroupId;
    /**
     * 方案标识
     */
    private int diagId;

    @Override
    public String toString() {
        return "DiagnosisAndTreatmentScheme{" +
                "id=" + id +
                ", pharmacy='" + pharmacy + '\'' +
                ", checkout='" + checkout + '\'' +
                ", examine='" + examine + '\'' +
                ", treat='" + treat + '\'' +
                ", operation='" + operation + '\'' +
                ", inform='" + inform + '\'' +
                ", followUpGroupId=" + followUpGroupId +
                ", diagId=" + diagId +
                '}';
    }

    public int getDiagId() {
        return diagId;
    }

    public void setDiagId(int diagId) {
        this.diagId = diagId;
    }

    public int getFollowUpGroupId() {
        return followUpGroupId;
    }

    public void setFollowUpGroupId(int followUpGroupId) {
        this.followUpGroupId = followUpGroupId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

}