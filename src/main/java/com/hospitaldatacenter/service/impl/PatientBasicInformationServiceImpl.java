package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.PatientBasicInformationDao;
import com.hospitaldatacenter.entity.PatientBasicInformation;
import com.hospitaldatacenter.service.PatientBasicInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 患者基本信息(PatientBasicInformation)表服务实现类
 *
 * @author makejava
 * @since 2020-08-07 10:31:11
 */
@Service("patientBasicInformationService")
public class PatientBasicInformationServiceImpl implements PatientBasicInformationService {
    @Resource
    private PatientBasicInformationDao patientBasicInformationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PatientBasicInformation queryById(Integer id) {
        return this.patientBasicInformationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<PatientBasicInformation> queryAllByLimit(int offset, int limit) {
        return this.patientBasicInformationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param patientBasicInformation 实例对象
     * @return 实例对象
     */
    @Override
    public PatientBasicInformation insert(PatientBasicInformation patientBasicInformation) {
        this.patientBasicInformationDao.insert(patientBasicInformation);
        return patientBasicInformation;
    }

    /**
     * 修改数据
     *
     * @param patientBasicInformation 实例对象
     * @return 实例对象
     */
    @Override
    public PatientBasicInformation update(PatientBasicInformation patientBasicInformation) {
        this.patientBasicInformationDao.update(patientBasicInformation);
        return this.queryById(patientBasicInformation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.patientBasicInformationDao.deleteById(id) > 0;
    }
}