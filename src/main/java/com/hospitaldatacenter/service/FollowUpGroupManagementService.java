package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.FollowUpGroupManagement;

import java.util.List;

/**
 * 随访组管理表(FollowUpGroupManagement)表服务接口
 *
 * @author makejava
 * @since 2020-08-07 10:31:07
 */
public interface FollowUpGroupManagementService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FollowUpGroupManagement queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FollowUpGroupManagement> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 实例对象
     */
    FollowUpGroupManagement insert(FollowUpGroupManagement followUpGroupManagement);

    /**
     * 修改数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 实例对象
     */
    FollowUpGroupManagement update(FollowUpGroupManagement followUpGroupManagement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}