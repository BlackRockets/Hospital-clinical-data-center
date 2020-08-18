package com.hospitaldatacenter.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hospitaldatacenter.entity.FollowUpRules;
import com.hospitaldatacenter.dao.FollowUpRulesDao;
import com.hospitaldatacenter.service.FollowUpRulesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FollowUpRules)表服务实现类
 *
 * @author makejava
 * @since 2020-08-14 16:33:16
 */
@Service("followUpRulesService")
public class FollowUpRulesServiceImpl implements FollowUpRulesService {
    @Resource
    private FollowUpRulesDao followUpRulesDao;

    /**
     *@description: 根据随访组id 查询所有符合要求的数据
     *@author: zyl
     */
    @Override
    public List<FollowUpRules> queryByFollowUpGroupId(String followUpRules) {
        FollowUpRules followUpRules1 = JSONObject.parseObject(followUpRules, FollowUpRules.class);
        return this.followUpRulesDao.queryByFollowUpGroupId(followUpRules1);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<FollowUpRules> queryAllByLimit(int offset, int limit) {
        return this.followUpRulesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param followUpRules 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(String followUpRules) {
        FollowUpRules followUpRules1 = JSONObject.parseObject(followUpRules, FollowUpRules.class);
        this.followUpRulesDao.insert(followUpRules1);
    }

    /**
     * 修改数据
     *
     * @param followUpRules 实例对象
     * @return 实例对象
     */
    @Override
    public void update(FollowUpRules followUpRules) {
        this.followUpRulesDao.update(followUpRules);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.followUpRulesDao.deleteById(id) > 0;
    }
}