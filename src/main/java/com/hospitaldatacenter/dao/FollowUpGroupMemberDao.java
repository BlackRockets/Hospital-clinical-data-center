package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.FollowUpGroupMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 随访组组员(FollowUpGroupMember)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-20 14:04:08
 */
public interface FollowUpGroupMemberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param followUpGroupId
     * @return 实例对象
     */
    List<FollowUpGroupMember> queryByfollowUpGroupId(Integer followUpGroupId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FollowUpGroupMember> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param followUpGroupMember 实例对象
     * @return 对象列表
     */
    List<FollowUpGroupMember> queryAll(FollowUpGroupMember followUpGroupMember);

    /**
     * 新增数据
     *
     * @param followUpGroupMember 实例对象
     * @return 影响行数
     */
    int insert(FollowUpGroupMember followUpGroupMember);

    /**
     * 修改数据
     *
     * @param followUpGroupMember 实例对象
     * @return 影响行数
     */
    int update(FollowUpGroupMember followUpGroupMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}