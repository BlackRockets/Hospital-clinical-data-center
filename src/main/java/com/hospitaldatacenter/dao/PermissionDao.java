package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Permission)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-14 16:27:58
 */
public interface PermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Permission queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Permission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param  实例对象
     * @return 对象列表
     */
    List<Permission> queryAll(Permission permission);

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 影响行数
     */
    int insert(@Param("departmentId") String departmentId,@Param("personId") String personId);

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 影响行数
     */
    int update(@Param("id")Integer id, @Param("departmentId") String departmentId,@Param("personId") String personId);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int delete(Integer[] list);

    List<String> queryPermissionNameByUserName(@Param("name") String name);

}