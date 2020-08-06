package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.FollowUpGroupManagementDao;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.service.FollowUpGroupManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 随访组管理表(FollowUpGroupManagement)表服务实现类
 *
 * @author makejava
 * @since 2020-08-06 17:33:38
 */
@Service("followUpGroupManagementService")
public class FollowUpGroupManagementServiceImpl implements FollowUpGroupManagementService {
    @Resource
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
    public FollowUpGroupManagement insert(FollowUpGroupManagement followUpGroupManagement) {
        this.followUpGroupManagementDao.insert(followUpGroupManagement);
        return followUpGroupManagement;
    }

    /**
     * 修改数据
     *
     * @param followUpGroupManagement 实例对象
     * @return 实例对象
     */
    @Override
    public FollowUpGroupManagement update(FollowUpGroupManagement followUpGroupManagement) {
        this.followUpGroupManagementDao.update(followUpGroupManagement);
        return this.queryById(followUpGroupManagement.getId());
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
}