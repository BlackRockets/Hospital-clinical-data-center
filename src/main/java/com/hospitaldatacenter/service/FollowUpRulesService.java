package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.FollowUpRules;

import java.util.List;

/**
 * (FollowUpRules)表服务接口
 *
 * @author makejava
 * @since 2020-08-14 16:33:16
 */
public interface FollowUpRulesService {

   /**
    *@description: 根据随访组id 查询所有符合要求的数据
    *@author: zyl
    */
    List<FollowUpRules> queryByFollowUpGroupId(String followUpRules);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FollowUpRules> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param followUpRules 实例对象
     *
     */
    void insert(String followUpRules);

    /**
     * 修改数据
     *
     * @param followUpRules 实例对象
     * @return 实例对象
     */
    void update(FollowUpRules followUpRules);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}