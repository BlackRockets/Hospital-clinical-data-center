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
                '}';
    }

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