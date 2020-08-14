package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.DiagnosisAndTreatmentScheme;

import java.util.List;

/**
 * 诊疗方案(DiagnosisAndTreatmentScheme)表服务接口
 *
 * @author makejava
 * @since 2020-08-12 09:31:24
 */
public interface DiagnosisAndTreatmentSchemeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DiagnosisAndTreatmentScheme queryById(Integer id,Integer groupId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DiagnosisAndTreatmentScheme> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 实例对象
     */
    int insert(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme);

    /**
     * 修改数据
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 实例对象
     */
    DiagnosisAndTreatmentScheme update(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    /**
     * 查询所有id
     *
     * @return 对象列表
     */
    List<DiagnosisAndTreatmentScheme> queryAllId(Integer groupId);

}