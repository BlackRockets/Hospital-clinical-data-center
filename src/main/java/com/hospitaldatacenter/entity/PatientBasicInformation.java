package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * 患者基本信息(PatientBasicInformation)实体类
 *
 * @author makejava
 * @since 2020-08-07 10:31:11
 */
public class PatientBasicInformation implements Serializable {
    private static final long serialVersionUID = 256572635564044928L;

    private Integer id;
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
     * 出生地
     */
    private String placebirth;
    /**
     * 文化程度
     */
    private String educationlevel;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 邮件
     */
    private String email;
    /**
     * 血型
     */
    private String bloodtype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPlacebirth() {
        return placebirth;
    }

    public void setPlacebirth(String placebirth) {
        this.placebirth = placebirth;
    }

    public String getEducationlevel() {
        return educationlevel;
    }

    public void setEducationlevel(String educationlevel) {
        this.educationlevel = educationlevel;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

}