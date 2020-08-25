package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.Condition;

import java.util.List;

public interface ConditionService {
    int insert(List<Condition> condition);
}
