package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.HospitalPersonDao;
import com.hospitaldatacenter.entity.HospitalPerson;
import com.hospitaldatacenter.service.HospitalPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (HospitalPerson)表服务实现类
 *
 * @author makejava
 * @since 2020-08-14 16:27:36
 */
@Service("hospitalPersonService")
public class HospitalPersonServiceImpl implements HospitalPersonService {
    @Resource
    private HospitalPersonDao hospitalPersonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public List<HospitalPerson> queryByName() {
        return this.hospitalPersonDao.queryByName();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<HospitalPerson> queryAllByLimit(int offset, int limit) {
        return this.hospitalPersonDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hospitalPerson 实例对象
     * @return 实例对象
     */
    @Override
    public HospitalPerson insert(HospitalPerson hospitalPerson) {
        this.hospitalPersonDao.insert(hospitalPerson);
        return hospitalPerson;
    }

    /**
     * 修改数据
     *
     * @param hospitalPerson 实例对象
     * @return 实例对象
     */
    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.hospitalPersonDao.deleteById() > 0;
    }
}