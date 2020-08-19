package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.TermApproval;

import java.util.List;

/**
 * 术语审批
 * (TermApproval)表服务接口
 *
 * @author makejava
 * @since 2020-08-18 15:40:27
 */
public interface TermApprovalService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TermApproval queryOne(String name);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TermApproval> queryAll();

    /**
     * 新增数据
     *
     * @param termApproval 实例对象
     * @return 实例对象
     */
    TermApproval insert(TermApproval termApproval);

    /**
     * 修改数据
     *
     * @param termApproval 实例对象
     * @return 实例对象
     */
    int update(TermApproval termApproval);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<TermApproval> selectClassification();

    List<TermApproval> selectType();

}