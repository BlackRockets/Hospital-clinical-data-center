package com.hospitaldatacenter.entity;

import java.io.Serializable;

public class Condition implements Serializable {
    private Integer id;

    private String conjunction;

    private String conditionName;

    private String comparisonOperators;

    private String conditionContent;

    @Override
    public String toString() {
        return "Condition{" +
                "id=" + id +
                ", conjunction='" + conjunction + '\'' +
                ", conditionName='" + conditionName + '\'' +
                ", comparisonOperators='" + comparisonOperators + '\'' +
                ", conditionContent='" + conditionContent + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConjunction() {
        return conjunction;
    }

    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getComparisonOperators() {
        return comparisonOperators;
    }

    public void setComparisonOperators(String comparisonOperators) {
        this.comparisonOperators = comparisonOperators;
    }

    public String getConditionContent() {
        return conditionContent;
    }

    public void setConditionContent(String conditionContent) {
        this.conditionContent = conditionContent;
    }
}
