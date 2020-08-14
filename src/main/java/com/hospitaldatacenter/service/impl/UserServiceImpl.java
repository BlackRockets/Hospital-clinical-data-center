package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.DepartmentsDao;
import com.hospitaldatacenter.dao.UserDao;
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
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private DepartmentsDao departmentsDao;

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
    public int update(User user) {
        return userDao.update(user);
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public int delete(Integer userId) {

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
}