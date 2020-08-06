package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.PatientScheduleDao;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.service.PatientScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PatientSchedule)表服务实现类
 *
 * @author makejava
 * @since 2020-08-06 17:35:07
 */
@Service("patientScheduleService")
public class PatientScheduleServiceImpl implements PatientScheduleService {
    @Resource
    private PatientScheduleDao patientScheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PatientSchedule queryById(Integer id) {
        return this.patientScheduleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<PatientSchedule> queryAllByLimit(int offset, int limit) {
        return this.patientScheduleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param patientSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public PatientSchedule insert(PatientSchedule patientSchedule) {
        this.patientScheduleDao.insert(patientSchedule);
        return patientSchedule;
    }

    /**
     * 修改数据
     *
     * @param patientSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public PatientSchedule update(PatientSchedule patientSchedule) {
        this.patientScheduleDao.update(patientSchedule);
        return this.queryById(patientSchedule.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.patientScheduleDao.deleteById(id) > 0;
    }
}