package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.FollowUpRules;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (FollowUpRules)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-14 16:33:16
 */
public interface FollowUpRulesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    List<FollowUpRules> queryByFollowUpGroupId(FollowUpRules followUpRules);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FollowUpRules> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param followUpRules 实例对象
     * @return 对象列表
     */
    List<FollowUpRules> queryAll(FollowUpRules followUpRules);

    /**
     * 新增数据
     *
     * @param followUpRules 实例对象
     * @return 影响行数
     */
    int insert(FollowUpRules followUpRules);

    /**
     * 修改数据
     *
     * @param followUpRules 实例对象
     * @return 影响行数
     */
    int update(FollowUpRules followUpRules);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}