package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.ConditionDao;
import com.hospitaldatacenter.dao.ScheduleOfFollowUpGroupDao;
import com.hospitaldatacenter.entity.Condition;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionServiceImpl implements ConditionService {

    @Autowired
    private ConditionDao conditionDao;

    @Autowired
    protected ScheduleOfFollowUpGroupDao scheduleOfFollowUpGroupDao;


    @Override
    public List<ScheduleOfFollowUpGroup> insert(List<Condition> list) {
        Integer groupId = list.get(0).getGroupId();
        int insert=1;
        int delete = conditionDao.delete();
        for (Condition condition : list) {
            insert= conditionDao.insert(condition);
        }
        List<Condition> conditions = conditionDao.selectAll();
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupDao.queryAllByConditions(conditions,groupId);
        System.out.println(scheduleOfFollowUpGroups.size());
        return scheduleOfFollowUpGroups;
    }
}
