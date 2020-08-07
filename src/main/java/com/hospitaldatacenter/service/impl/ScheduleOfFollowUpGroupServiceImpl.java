package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.ScheduleOfFollowUpGroupDao;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ScheduleOfFollowUpGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)表服务实现类
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
 */
@Service("scheduleOfFollowUpGroupService")
public class ScheduleOfFollowUpGroupServiceImpl implements ScheduleOfFollowUpGroupService {
    @Resource
    private ScheduleOfFollowUpGroupDao scheduleOfFollowUpGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ScheduleOfFollowUpGroup queryById(Integer id) {
        return this.scheduleOfFollowUpGroupDao.queryById(id);
    }


    /**
     *@description: 通过随访组id查询数据
     *@author: zyl
     */
    @Override
    public List<ScheduleOfFollowUpGroup> queryByFollowUpGroupId(Integer followUpGroupId) {
        return scheduleOfFollowUpGroupDao.queryByFollowUpGroupId(followUpGroupId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ScheduleOfFollowUpGroup> queryAllByLimit(int offset, int limit) {
        return this.scheduleOfFollowUpGroupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 实例对象
     */
    @Override
    public ScheduleOfFollowUpGroup insert(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup) {
        this.scheduleOfFollowUpGroupDao.insert(scheduleOfFollowUpGroup);
        return scheduleOfFollowUpGroup;
    }

    /**
     * 修改数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 实例对象
     */
    @Override
    public ScheduleOfFollowUpGroup update(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup) {
        this.scheduleOfFollowUpGroupDao.update(scheduleOfFollowUpGroup);
        return this.queryById(scheduleOfFollowUpGroup.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.scheduleOfFollowUpGroupDao.deleteById(id) > 0;
    }
}