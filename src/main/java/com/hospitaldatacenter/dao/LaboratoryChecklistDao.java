package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.LaboratoryChecklist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LaboratoryChecklist)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-06 17:25:00
 */
public interface LaboratoryChecklistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LaboratoryChecklist queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LaboratoryChecklist> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param laboratoryChecklist 实例对象
     * @return 对象列表
     */
    List<LaboratoryChecklist> queryAll(LaboratoryChecklist laboratoryChecklist);

    /**
     * 新增数据
     *
     * @param laboratoryChecklist 实例对象
     * @return 影响行数
     */
    int insert(LaboratoryChecklist laboratoryChecklist);

    /**
     * 修改数据
     *
     * @param laboratoryChecklist 实例对象
     * @return 影响行数
     */
    int update(LaboratoryChecklist laboratoryChecklist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}