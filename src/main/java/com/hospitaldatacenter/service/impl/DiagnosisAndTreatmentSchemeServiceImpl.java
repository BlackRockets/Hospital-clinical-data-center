package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.DiagnosisAndTreatmentSchemeDao;
import com.hospitaldatacenter.entity.DiagnosisAndTreatmentScheme;
import com.hospitaldatacenter.service.DiagnosisAndTreatmentSchemeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 诊疗方案(DiagnosisAndTreatmentScheme)表服务实现类
 *
 * @author makejava
 * @since 2020-08-12 09:31:24
 */
@Service("diagnosisAndTreatmentSchemeService")
public class DiagnosisAndTreatmentSchemeServiceImpl implements DiagnosisAndTreatmentSchemeService {
    @Resource
    private DiagnosisAndTreatmentSchemeDao diagnosisAndTreatmentSchemeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DiagnosisAndTreatmentScheme queryById(Integer id) {
        return this.diagnosisAndTreatmentSchemeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DiagnosisAndTreatmentScheme> queryAllByLimit(int offset, int limit) {
        return this.diagnosisAndTreatmentSchemeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 实例对象
     */
    @Override
    public DiagnosisAndTreatmentScheme insert(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme) {
        this.diagnosisAndTreatmentSchemeDao.insert(diagnosisAndTreatmentScheme);
        return diagnosisAndTreatmentScheme;
    }

    /**
     * 修改数据
     *
     * @param diagnosisAndTreatmentScheme 实例对象
     * @return 实例对象
     */
    @Override
    public DiagnosisAndTreatmentScheme update(DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme) {
        this.diagnosisAndTreatmentSchemeDao.update(diagnosisAndTreatmentScheme);
        return this.queryById(diagnosisAndTreatmentScheme.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.diagnosisAndTreatmentSchemeDao.deleteById(id) > 0;
    }
}