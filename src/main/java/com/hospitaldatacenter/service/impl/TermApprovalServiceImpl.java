package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.TermApprovalDao;
import com.hospitaldatacenter.entity.TermApproval;
import com.hospitaldatacenter.service.TermApprovalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 术语审批
 * (TermApproval)表服务实现类
 *
 * @author makejava
 * @since 2020-08-18 15:40:27
 */
@Service("termApprovalService")
public class TermApprovalServiceImpl implements TermApprovalService {
    @Resource
    private TermApprovalDao termApprovalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TermApproval queryById(Integer id) {
        return this.termApprovalDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TermApproval> queryAllByLimit(int offset, int limit) {
        return this.termApprovalDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param termApproval 实例对象
     * @return 实例对象
     */
    @Override
    public TermApproval insert(TermApproval termApproval) {
        this.termApprovalDao.insert(termApproval);
        return termApproval;
    }

    /**
     * 修改数据
     *
     * @param termApproval 实例对象
     * @return 实例对象
     */
    @Override
    public TermApproval update(TermApproval termApproval) {
        this.termApprovalDao.update(termApproval);
        return this.queryById(termApproval.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.termApprovalDao.deleteById(id) > 0;
    }
}