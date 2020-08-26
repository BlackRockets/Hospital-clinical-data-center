package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.Condition;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.INTERNAL;

import java.util.List;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
 */
public interface ScheduleOfFollowUpGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ScheduleOfFollowUpGroup queryById(Integer id);

    /**
     *@description: 通过随访组id查询
     *@author: zyl
     */
    List<ScheduleOfFollowUpGroup> queryByFollowUpGroupId(Integer followUpGroupId);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> queryAll(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     * 新增数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 影响行数
     */
    int insert(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     * 修改数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 影响行数
     */
    int update(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 对象列表
     */
    List<ScheduleOfFollowUpGroup> queryAllByCondition(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);

    /**
     *
     *
     *@description: 单表条件查询
     *@author: zyl
     *
     */
    List<ScheduleOfFollowUpGroup> queryByCondition(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup);
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

    /**
     *@description:  添加根据所在科室id查询所有患者信息到随访明细
     *@author: zyl
     */
    int insertPatientSchedule(PatientSchedule patientSchedule);

    List<ScheduleOfFollowUpGroup> queryAllByConditions(@Param("list") List<Condition> list,@Param("groupId") Integer groupId);

}