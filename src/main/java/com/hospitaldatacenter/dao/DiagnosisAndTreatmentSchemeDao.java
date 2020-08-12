package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.DiagnosisAndTreatmentScheme;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 诊疗方案(DiagnosisAndTreatmentScheme)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-12 09:31:24
 */
public interface DiagnosisAndTreatmentSchemeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DiagnosisAndTreatmentScheme queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DiagnosisAndTreatmentScheme> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 对象列表
     */
    List<DiagnosisAndTreatmentScheme> queryAll(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme);

    /**
     * 新增数据
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 影响行数
     */
    int insert(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme);

    /**
     * 修改数据
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 影响行数
     */
    int update(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}