package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Role)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-17 16:29:47
 */
public interface RoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Role queryById(Integer id);

    /**
     * 通过名称查询单条数据
     *
     * @param description
     * @return 实例对象
     */
    Role queryByDescription(String description);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Role> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param role 实例对象
     * @return 对象列表
     */
    List<Role> queryAll(Role role);

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 影响行数
     */
    int insert(Role role);

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 影响行数
     */
    int update(Role role);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     *@description: 根据角色查询所有权限
     *@author: zyl
     */
    Role selectMenuByRoleId(Integer id);

    /**
     *@description: 根据角色id查询
     *@author: zyl
     */
    Role selectByRoleId(Integer id);

    /**
     *@description: 根据随访组id查询组内角色，成员以及权限
     *@author: zyl
     */
    List<Role> selectMenuByFollowUpGroupId(Integer followUpGroupId);

    List<String> queryRoleNameByUsername(@Param("name") String name);

}