package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-08-12 15:56:15
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    User queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<User> queryAll(User user);

    List<User> selectName();

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    int insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    int update(String user);

    int distribution(String[] list,Integer departmentsId);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    int delete(Integer[] userId);

    /**
     * @return
     * @description: 查询四种职业的人
     * @author: zyl
     */
    HashMap<String, ArrayList<User>> selectAllPeopleByOccupation();

    /**
     * @description: 根据名字查询所有对应的角色
     * @author: zyl
     */
    List<String> queryUserRoleByName(String name);

    /**
     * @description: 设定组内用户或权限
     * @author: zyl
     */
    void insertTeamInUserOrPer(String[] names,String[] permissionName,Integer roleId,Integer groupId,Integer teamDataId);



    User queryUserByUserName(String name);

    int updatePassword(User user);
}