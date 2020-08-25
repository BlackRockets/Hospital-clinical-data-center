package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.ConditionDao;
import com.hospitaldatacenter.entity.Condition;
import com.hospitaldatacenter.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionServiceImpl implements ConditionService {

    @Autowired
    private ConditionDao conditionDao;

    @Override
    public int insert(List<Condition> list) {
        int insert=1;
        for (Condition condition : list) {
            insert= conditionDao.insert(condition);
            if (insert == 0){
                return insert;
            }
        }
        return insert;
    }
}
