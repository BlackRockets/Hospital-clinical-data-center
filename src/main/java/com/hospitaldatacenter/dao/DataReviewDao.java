package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.DataReview;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * (DataReview)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-07 11:46:14
 */
@Component
public interface DataReviewDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DataReview queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DataReview> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dataReview 实例对象
     * @return 对象列表
     */
    List<DataReview> queryAll(DataReview dataReview,@Param("reviewerTime1") Date reviewerTime1);

    /**
     * 新增数据
     *
     * @param dataReview 实例对象
     * @return 影响行数
     */
    int insert(DataReview dataReview);

    /**
     * 修改数据
     *
     * @param dataReview 实例对象
     * @return 影响行数
     */
    int update(DataReview dataReview);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}