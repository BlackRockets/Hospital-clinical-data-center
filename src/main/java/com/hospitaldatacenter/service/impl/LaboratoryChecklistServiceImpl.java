package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.LaboratoryChecklistDao;
import com.hospitaldatacenter.entity.LaboratoryChecklist;
import com.hospitaldatacenter.service.LaboratoryChecklistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LaboratoryChecklist)表服务实现类
 *
 * @author makejava
 * @since 2020-08-06 17:35:06
 */
@Service("laboratoryChecklistService")
public class LaboratoryChecklistServiceImpl implements LaboratoryChecklistService {
    @Resource
    private LaboratoryChecklistDao laboratoryChecklistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LaboratoryChecklist queryById(Integer id) {
        return this.laboratoryChecklistDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LaboratoryChecklist> queryAllByLimit(int offset, int limit) {
        return this.laboratoryChecklistDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param laboratoryChecklist 实例对象
     * @return 实例对象
     */
    @Override
    public LaboratoryChecklist insert(LaboratoryChecklist laboratoryChecklist) {
        this.laboratoryChecklistDao.insert(laboratoryChecklist);
        return laboratoryChecklist;
    }

    /**
     * 修改数据
     *
     * @param laboratoryChecklist 实例对象
     * @return 实例对象
     */
    @Override
    public LaboratoryChecklist update(LaboratoryChecklist laboratoryChecklist) {
        this.laboratoryChecklistDao.update(laboratoryChecklist);
        return this.queryById(laboratoryChecklist.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.laboratoryChecklistDao.deleteById(id) > 0;
    }
}