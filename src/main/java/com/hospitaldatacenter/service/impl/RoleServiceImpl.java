package com.hospitaldatacenter.service.impl;
import com.alibaba.fastjson.JSONObject;
import com.hospitaldatacenter.dao.FollowUpGroupMemberDao;
import com.hospitaldatacenter.dao.MenuDao;
import com.hospitaldatacenter.dao.RoleDao;
import com.hospitaldatacenter.dao.UserDao;
import com.hospitaldatacenter.entity.FollowUpGroupMember;
import com.hospitaldatacenter.entity.Menu;
import com.hospitaldatacenter.entity.Role;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Role)表服务实现类
 *
 * @author makejava
 * @since 2020-08-17 16:21:01
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;
    @Resource
    private UserDao userDao;
    @Resource
    private MenuDao menuDao;
    @Resource
    private FollowUpGroupMemberDao followUpGroupMemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Role queryById(Integer id) {
        return this.roleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Role> queryAllByLimit(int offset, int limit) {
        return this.roleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role insert(Role role) {
        this.roleDao.insert(role);
        return role;
    }

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role update(Role role) {
        this.roleDao.update(role);
        return this.queryById(role.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roleDao.deleteById(id) > 0;
    }

    @Override
    public List<String> queryRoleNameByUsername(String name) {
        return roleDao.queryRoleNameByUsername(name);
    }

    /**
     *@description: 根据角色查询所有权限
     *@author: zyl
     */
    @Override
    public List<String> selectMenuByRoleId(String name) {
        User user = userDao.selectUserRoleByName(name);
        List<Role> role = user.getRole();
        ArrayList<String> list = new ArrayList<>();
        for (Role role1 : role) {
            Role rolemenu = roleDao.selectMenuByRoleId(role1.getId());
            if(rolemenu!=null){
                List<Menu> menus = rolemenu.getMenus();
                for (Menu menu : menus) {
                    list.add(menu.getPermission());
                }
            }
        }
        return list;
    }

    /**
     *@description: 根据随访组id查询组内角色，成员以及权限
     *@author: zyl
     */
    @Override
    public List<Role> queryMenuByFollowUpGroupId(Integer followUpGroupId) {
        List<Role> roles = new ArrayList<>();
        List<FollowUpGroupMember> followUpGroupMembers = followUpGroupMemberDao.queryAllByFollowUpGroupId(followUpGroupId);
        for (FollowUpGroupMember followUpGroupMember : followUpGroupMembers) {
            Role role = roleDao.queryById(followUpGroupMember.getRoleId());
            String userId = followUpGroupMember.getUserId();
            String menuId = followUpGroupMember.getMenuId();
            String[] userIdArr = {};
            String[] menuIdArr = {};
            if(userId!=null && userId!=""){
                userIdArr = userId.split(",");
            }
            if(menuId!=null && menuId!=""){
                menuIdArr = menuId.split(",");
            }

            List<User> users = null;
            List<Menu> menus = null;
            if(userIdArr.length>0){
                users = userDao.selectUserByUserId(userIdArr);
            }
            if(menuIdArr.length>0){
                menus = menuDao.selectMenuByMenuId(menuIdArr);
            }


            role.setUsers(users);
            role.setMenus(menus);
            role.setTeamDataId(followUpGroupMember.getId());
            roles.add(role);
        }
        

        return roles;
    }
}