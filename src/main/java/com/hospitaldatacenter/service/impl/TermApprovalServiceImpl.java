package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.TermApprovalDao;
import com.hospitaldatacenter.entity.TermApproval;
import com.hospitaldatacenter.service.TermApprovalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
     * @return 实例对象
     */
    @Override
    public TermApproval queryOne(String name) {
        return this.termApprovalDao.queryOne(name);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<TermApproval> queryAll() {
        return this.termApprovalDao.queryAll();
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
    public int update(TermApproval termApproval) {

        return termApprovalDao.update(termApproval);
    }

    @Override
    public int approval(Integer id) {

        return termApprovalDao.approval(id);
    }

    @Override
    public int refuse(Integer id) {
        return termApprovalDao.refuse(id);
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

    @Override
    public List<TermApproval> selectClassification() {
        return termApprovalDao.selectClassification();
    }

    @Override
    public List<TermApproval> selectType() {
        return termApprovalDao.selectType();
    }

}