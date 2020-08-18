package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.HospitalPerson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (HospitalPerson)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-14 16:27:35
 */
public interface HospitalPersonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    List<HospitalPerson> queryByName();

    String queryName(@Param("personName") String personName);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HospitalPerson> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param hospitalPerson 实例对象
     * @return 对象列表
     */
    List<HospitalPerson> queryAll(HospitalPerson hospitalPerson);

    /**
     * 新增数据
     *
     * @param hospitalPerson 实例对象
     * @return 影响行数
     */
    int insert(HospitalPerson hospitalPerson);

    /**
     * 修改数据
     *
     * @param hospitalPerson 实例对象
     * @return 影响行数
     */
    int update(HospitalPerson hospitalPerson);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 影响行数
     */
    int deleteById();

}