package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.PermissionDao;
import com.hospitaldatacenter.entity.Permission;
import com.hospitaldatacenter.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author makejava
 * @since 2020-08-14 16:27:59
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Resource
    private PermissionDao permissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Permission queryById(Integer id) {
        return this.permissionDao.queryById(id);
    }



    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Permission> queryAll(Permission permission) {
        return this.permissionDao.queryAll(permission);
    }

    /**
     * 新增数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(String departmentId,String personId) {

        return permissionDao.insert(departmentId,personId);
    }

    /**
     * 修改数据
     *
     * @param permission 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Integer id, String departmentId,String personId) {
        return permissionDao.update(id,departmentId,personId);
    }

    @Override
    public int delete(Integer[] ids) {
        return permissionDao.delete(ids);
    }

    @Override
    public List<String> queryPermissionNameByUserName(String name) {
        return permissionDao.queryPermissionNameByUserName(name);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */

}