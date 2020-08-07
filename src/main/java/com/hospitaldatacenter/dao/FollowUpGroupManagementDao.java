package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 随访组管理表(FollowUpGroupManagement)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-07 10:31:06
 */
public interface FollowUpGroupManagementDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FollowUpGroupManagement queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FollowUpGroupManagement> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param followUpGroupManagement 实例对象
     * @return 对象列表
     */
    List<FollowUpGroupManagement> queryAll(FollowUpGroupManagement followUpGroupManagement);

    /**
     * 新增数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 影响行数
     */
    int insert(FollowUpGroupManagement followUpGroupManagement);

    /**
     * 修改数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 影响行数
     */
    int update(FollowUpGroupManagement followUpGroupManagement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     *
     *
     *@description: 查询所有随访组数据
     *@author: zyl
     *@time: ${DATE} ${TIME}
     *
     */
    List<FollowUpGroupManagement> queryAllByPermissions();

}