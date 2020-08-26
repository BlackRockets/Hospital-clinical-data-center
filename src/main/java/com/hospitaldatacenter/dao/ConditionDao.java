package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.Condition;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;

import java.util.List;

public interface ConditionDao {
    int insert(Condition condition);

    int delete();

    List<Condition> selectAll();



}
