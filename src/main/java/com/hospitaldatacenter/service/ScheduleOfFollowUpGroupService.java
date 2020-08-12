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
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> queryAll(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     * 新增数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 实例对象
     */
    int insert(String scheduleOfFollowUpGroup);

    /**
     * 修改数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return
     */
    int update(String scheduleOfFollowUpGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(Integer[] ids);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> queryAllByCondition(String scheduleOfFollowUpGroup);
    /**
     * 已随访
     *
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> selectAllByFollowUpState();
    /**
     * 未随访
     *
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> selectAllByNoFollowUpState();


}