package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.HospitalPerson;

import java.util.List;

/**
 * (HospitalPerson)表服务接口
 *
 * @author makejava
 * @since 2020-08-14 16:27:36
 */
public interface HospitalPersonService {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    List<HospitalPerson> queryByName();

    String queryName(String personName);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<HospitalPerson> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hospitalPerson 实例对象
     * @return 实例对象
     */
    HospitalPerson insert(HospitalPerson hospitalPerson);

    /**
     * 修改数据
     *
     * @param hospitalPerson 实例对象
     * @return 实例对象
     */

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById();

}