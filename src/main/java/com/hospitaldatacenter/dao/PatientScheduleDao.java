package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.PatientSchedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 患者明细表(PatientSchedule)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-07 10:31:12
 */
public interface PatientScheduleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PatientSchedule queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<PatientSchedule> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param patientSchedule 实例对象
     * @return 对象列表
     */
    List<PatientSchedule> queryAll(PatientSchedule patientSchedule);

    /**
     * 新增数据
     *
     * @param patientSchedule 实例对象
     * @return 影响行数
     */
    int insert(PatientSchedule patientSchedule);

    /**
     * 修改数据
     *
     * @param patientSchedule 实例对象
     * @return 影响行数
     */
    int update(PatientSchedule patientSchedule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    /**
     * 通过id查询
     *
     * @return 影响行数
     */
    List<PatientSchedule> selectByName(String name);
    /**
     * 通过条件查询
     *
     * @return 影响行数
     */

    List<PatientSchedule> selectAllByCondition(PatientSchedule patientSchedule);
    /**
     * 通过条件查询
     *末次
     * @return 影响行数
     * @param patientSchedule
     */

    List<PatientSchedule> selectAllByConditionEnd(PatientSchedule patientSchedule);
    /**
     * 通过条件查询
     *最大值
     * @return 影响行数
     * @param patientSchedule
     */

    List<PatientSchedule> selectAllByConditionMax(PatientSchedule patientSchedule);
    /**
     * 通过条件查询
     *最小值
     * @return 影响行数
     * @param patientSchedule
     */

    List<PatientSchedule> selectAllByConditionMin(PatientSchedule patientSchedule);

}