package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.TermApproval;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 术语审批
 * (TermApproval)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-18 15:40:27
 */
public interface TermApprovalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param name
     * @return 实例对象
     */
    TermApproval queryOne(String name);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TermApproval> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param termApproval 实例对象
     * @return 对象列表
     */
    List<TermApproval> queryAll();

    /**
     * 新增数据
     *
     * @param termApproval 实例对象
     * @return 影响行数
     */
    int insert(TermApproval termApproval);

    /**
     * 修改数据
     *
     * @param termApproval 实例对象
     * @return 影响行数
     */
    int update(TermApproval termApproval);

    int approval(Integer id);

    int refuse(Integer id);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<TermApproval> selectClassification();
    List<TermApproval> selectType();


}