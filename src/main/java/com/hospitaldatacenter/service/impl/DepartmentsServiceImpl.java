package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.DepartmentsDao;
import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.DepartmentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Departments)表服务实现类
 *
 * @author makejava
 * @since 2020-08-13 09:11:35
 */
@Service("departmentsService")
public class DepartmentsServiceImpl implements DepartmentsService {
    @Resource
    private DepartmentsDao departmentsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Departments queryById(Integer id) {
        return this.departmentsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Departments> queryAllByLimit(int offset, int limit) {
        return this.departmentsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param departments 实例对象
     * @return 实例对象
     */
    @Override
    public Departments insert(Departments departments) {
        this.departmentsDao.insert(departments);
        return departments;
    }

    /**
     * 修改数据
     *
     * @param departments 实例对象
     * @return 实例对象
     */
    @Override
    public Departments update(Departments departments) {
        this.departmentsDao.update(departments);
        return this.queryById(departments.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.departmentsDao.deleteById(id) > 0;
    }

    @Override
    public List<Departments> queryDepartments() {
        List<Departments> departments=departmentsDao.queryDepartments();
        return departments;
    }


}