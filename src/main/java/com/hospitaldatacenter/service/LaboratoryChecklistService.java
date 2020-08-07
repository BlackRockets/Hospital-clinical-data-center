package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.LaboratoryChecklist;

import java.util.List;

/**
 * 实验室检查表(LaboratoryChecklist)表服务接口
 *
 * @author makejava
 * @since 2020-08-07 10:35:04
 */
public interface LaboratoryChecklistService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LaboratoryChecklist queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LaboratoryChecklist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param laboratoryChecklist 实例对象
     * @return 实例对象
     */
    LaboratoryChecklist insert(LaboratoryChecklist laboratoryChecklist);

    /**
     * 修改数据
     *
     * @param laboratoryChecklist 实例对象
     * @return 实例对象
     */
    LaboratoryChecklist update(LaboratoryChecklist laboratoryChecklist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}