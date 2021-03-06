package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.FollowUpGroupMember;
import com.hospitaldatacenter.entity.User;

import java.util.List;
import java.util.Set;

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
    int insert(String followUpGroupManagement);

    /**
     *@description: 新增数据
     *@author: zyl
     */
    int newGroupRole(String followUpGroupMember);

    /**
     * 修改数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 实例对象
     */
    int update(String followUpGroupManagement);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    /**
     *
     *
     *@description: 查询所有随访组
     *@author: zyl
     *
     */
    List<FollowUpGroupManagement> queryAll();

    /**
     *
     *
     *@description: 条件查询所有随访组
     *@author: zyl
     *
     */
    List<FollowUpGroupManagement> queryAllCondition(String followUpGroupManagement);

    /**
     *
     *
     *@description: 批量删除根据id
     *@author: zyl
     *
     */
    void deleteById(Integer[] ids);
    /**
     *
     *查询所有科室
     *
     */
    List<FollowUpGroupManagement> queryAllDep();
    /**
     *
     *查询所有科随访组
     *
     */
    List<FollowUpGroupManagement> queryAllGroupName();
    /**
     *@description: 根据随访组id所有（非患者）成员
     *@author: zyl
     */
    Set<User> queryByfollowUpGroupId(String followUpGroupMember);
    /**
     *@description: 删除某个随访组中的某个角色权限
     *@author: zyl
     */
    void delById(Integer[] ids);
}