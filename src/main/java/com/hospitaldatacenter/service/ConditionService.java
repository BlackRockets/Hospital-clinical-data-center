package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.Condition;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;

import java.util.List;

public interface ConditionService {
    List<ScheduleOfFollowUpGroup> insert(List<Condition> condition);
}
