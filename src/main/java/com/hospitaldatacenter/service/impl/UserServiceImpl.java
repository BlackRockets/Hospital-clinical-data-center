package com.hospitaldatacenter.service.impl;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.dao.DepartmentsDao;
import com.hospitaldatacenter.dao.FollowUpGroupMemberDao;
import com.hospitaldatacenter.dao.MenuDao;
import com.hospitaldatacenter.dao.UserDao;
import com.hospitaldatacenter.entity.Menu;
import com.hospitaldatacenter.entity.Role;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-08-12 15:56:16
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Resource
    private MenuDao menuDao;
    @Resource
    private FollowUpGroupMemberDao followUpGroupMemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer userId) {
        return this.userDao.queryById(userId);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<User> queryAll(User user) {
        return this.userDao.queryAll(user);
    }

    @Override
    public List<User> selectName() {
        return userDao.selectName();
    }


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(User user) {
        return userDao.insert(user);

    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public int update(String user) {
        JSON parse = (JSON) JSON.parse(user);
        User user1 = JSON.toJavaObject(parse, User.class);
        return this.userDao.update(user1);
    }

    @Override
    public int distribution(String[] names, Integer departmentsId) {
        return userDao.distribution(names,departmentsId);
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public int delete(Integer[] userId) {

        return this.userDao.delete(userId);
    }

    @Override
    public HashMap<String, ArrayList<User>> selectAllPeopleByOccupation() {
        List<User> users = userDao.selectUserByDoctor();
        List<User> users1 = userDao.selectUserByNurse();
        List<User> users2 = userDao.selectUserByTechnician();
        List<User> users3 = userDao.selectUserByPharmacist();
        HashMap<String, ArrayList<User>> map = new HashMap<>();
        map.put("userDoctor", (ArrayList<User>) users);
        map.put("userNurse", (ArrayList<User>) users1);
        map.put("userTechnician", (ArrayList<User>) users2);
        map.put("userPharmacist", (ArrayList<User>) users3);
        return map;
    }

    @Override
    public User queryUserByUserName(String name) {
        return userDao.getUserByName(name);
    }

    /**
     * @description: 根据名字查询所有对应的角色
     * @author: zyl
     */
    @Override
    public List<String> queryUserRoleByName(String name){
        User user = userDao.selectUserRoleByName(name);
        List<Role> role = user.getRole();
        List<String> list = new ArrayList<String>();
        for (Role role1 : role) {
            list.add(role1.getRoleName());
        }
        return list;
    }

    /**
     *@description: 设定组内用户或权限
     *@author: zyl
     */
    @Override
    public void insertTeamInUserOrPer(String[] names, String[] permissionName, Integer roleId, Integer groupId,Integer teamDataId) {
        String menuIdStr = "";
        if(permissionName.length>0){
            List<Menu> menus = menuDao.selectMenuIdByName(permissionName);

            int size = menus.size();
            for (int i = 0; i < size; i++) {
                if(i != size-1){
                    menuIdStr+=menus.get(i).getId()+",";
                }else{
                    menuIdStr+=menus.get(i).getId();
                }
            }
        }
        String nameIdStr="";
        if(names.length>0){
            List<User> users = userDao.selectUserIdByName(names);
            int usersSize = users.size();
            for (int i = 0; i < usersSize; i++) {
                if(i != usersSize-1){
                    nameIdStr+=users.get(i).getUserId()+",";
                }else{
                    nameIdStr+=users.get(i).getUserId();
                }
            }
            followUpGroupMemberDao.insertMember(groupId,nameIdStr,roleId,menuIdStr,teamDataId);
        }else{
            followUpGroupMemberDao.insertMember(groupId,nameIdStr,roleId,menuIdStr,teamDataId);
        }


    }
}