package com.hospitaldatacenter.service.impl;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.dao.FollowUpGroupManagementDao;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.service.FollowUpGroupManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 随访组管理表(FollowUpGroupManagement)表服务实现类
 *
 * @author makejava
 * @since 2020-08-07 10:31:08
 */
@Service("followUpGroupManagementService")
public class FollowUpGroupManagementServiceImpl implements FollowUpGroupManagementService {
    @Autowired
    private FollowUpGroupManagementDao followUpGroupManagementDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FollowUpGroupManagement queryById(Integer id) {
        return this.followUpGroupManagementDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FollowUpGroupManagement> queryAllByLimit(int offset, int limit) {
        return this.followUpGroupManagementDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(String followUpGroupManagement) {
        JSON parse = (JSON) JSON.parse(followUpGroupManagement);
        FollowUpGroupManagement followUpGroupManagement1 = JSON.toJavaObject(parse, FollowUpGroupManagement.class);
        int insertRow = this.followUpGroupManagementDao.insert(followUpGroupManagement1);
        return insertRow;
    }

    /**
     * 修改数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 实例对象
     */
    @Override
    public int update(String followUpGroupManagement) {
        JSON parse = (JSON) JSON.parse(followUpGroupManagement);
        FollowUpGroupManagement followUpGroupManagement1 = JSON.toJavaObject(parse, FollowUpGroupManagement.class);
        return this.followUpGroupManagementDao.update(followUpGroupManagement1);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.followUpGroupManagementDao.deleteById(id) > 0;
    }

    /**
     *
     *
     *@description: 查询所有随访组
     *@author: zyl
     *
     */
    @Override
    public List<FollowUpGroupManagement> queryAll() {
        List<FollowUpGroupManagement> followUpGroupManagements = followUpGroupManagementDao.queryAllByPermissions();
        return followUpGroupManagements;
    }

    @Override
    public List<FollowUpGroupManagement> queryAllCondition(String followUpGroupManagement) {
        JSON parse = (JSON) JSON.parse(followUpGroupManagement);
        FollowUpGroupManagement followUpGroupManagement1 = JSON.toJavaObject(parse, FollowUpGroupManagement.class);
        return followUpGroupManagementDao.queryAll(followUpGroupManagement1);
    }

    @Override
    public void deleteById(Integer[] ids) {
        for (int i = 0; i < ids.length; i++) {
            followUpGroupManagementDao.deleteById(ids[i]);
        }
    }
}