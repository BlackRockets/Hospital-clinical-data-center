package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.PatientSchedule;

import java.io.IOException;
import java.util.List;

/**
 * 患者明细表(PatientSchedule)表服务接口
 *
 * @author makejava
 * @since 2020-08-07 10:31:12
 */
public interface PatientScheduleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PatientSchedule queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<PatientSchedule> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param patientSchedule 实例对象
     * @return 实例对象
     */
    PatientSchedule insert(PatientSchedule patientSchedule);

    /**
     * 修改数据
     *
     * @param patientSchedule 实例对象
     * @return 实例对象
     */
    PatientSchedule update(PatientSchedule patientSchedule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    /**
     * 通过id查询
     *
     * @return 影响行数
     */
    List<PatientSchedule> selectByName(String name);
    /**
     * 通过条件查询
     *首次
     * @return 影响行数
     */

    List<PatientSchedule> selectAllByCondition(String patientSchedule);


    /**
     *
     * @return 所有科室
     */

    List<Departments> queryAllDepartments();

    List findPatientScheduleIds(Integer[] ids,String name) throws IOException;

}