package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;

import java.util.List;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)表服务接口
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
 */
public interface ScheduleOfFollowUpGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScheduleOfFollowUpGroup queryById(Integer id);

    /**
     * 通过随访组id查询数据
     *
     * @param followUpGroupId 随访组id
     * @return 实例对象集合
     */
    List<ScheduleOfFollowUpGroup> queryByFollowUpGroupId(Integer followUpGroupId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 实例对象
     */
    ScheduleOfFollowUpGroup insert(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     * 修改数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 实例对象
     */
    ScheduleOfFollowUpGroup update(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}