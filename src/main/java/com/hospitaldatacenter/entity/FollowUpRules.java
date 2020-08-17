package com.hospitaldatacenter.entity;

import java.io.Serializable;

/**
 * (FollowUpRules)实体类
 *
 * @author makejava
 * @since 2020-08-14 16:32:07
 */
public class FollowUpRules implements Serializable {
    private static final long serialVersionUID = 555708352160939561L;

    private Integer id;

    private Integer followupgorupid;
    /**
     * 事件
     */
    private String things;
    /**
     * 条件
     */
    private String conditions;
    /**
     * 起始时间
     */
    private String startTime;
    /**
     * 间隔时间
     */
    private String intervaltime;
    /**
     * 持续（/次）
     */
    private Integer count;
    /**
     * 提前（/天）
     */
    private Integer inadvance;
    /**
     * 规则标识
     */
    private Integer rulemark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowupgorupid() {
        return followupgorupid;
    }

    public void setFollowupgorupid(Integer followupgorupid) {
        this.followupgorupid = followupgorupid;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getIntervaltime() {
        return intervaltime;
    }

    public void setIntervaltime(String intervaltime) {
        this.intervaltime = intervaltime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getInadvance() {
        return inadvance;
    }

    public void setInadvance(Integer inadvance) {
        this.inadvance = inadvance;
    }

    public Integer getRulemark() {
        return rulemark;
    }

    public void setRulemark(Integer rulemark) {
        this.rulemark = rulemark;
    }

}