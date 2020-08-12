package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.DataReviewDao;
import com.hospitaldatacenter.entity.DataReview;
import com.hospitaldatacenter.service.DataReviewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (DataReview)表服务实现类
 *
 * @author makejava
 * @since 2020-08-07 14:12:19
 */
@Service("dataReviewService")
public class DataReviewServiceImpl implements DataReviewService {
    @Resource
    private DataReviewDao dataReviewDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
   /* @Override
    public DataReview queryById(Integer id) {
        return this.dataReviewDao.queryById(id);
    }*/

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    /*@Override
    public List<DataReview> queryAllByLimit(int offset, int limit) {
        return this.dataReviewDao.queryAllByLimit(offset, limit);
    }*/

    /**
     * 新增数据
     *
     * @param dataReview 实例对象
     * @return 实例对象
     */
   /* @Override
    public DataReview insert(DataReview dataReview) {
        this.dataReviewDao.insert(dataReview);
        return dataReview;
    }*/

    /**
     * 修改数据
     *
     * @param dataReview 实例对象
     * @return 实例对象
     */
   /* @Override
    public DataReview update(DataReview dataReview) {
        this.dataReviewDao.update(dataReview);
        return this.queryById(dataReview.getId());
    }*/

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
   /* @Override
    public boolean deleteById(Integer id) {
        return this.dataReviewDao.deleteById(id) > 0;
    }*/

    @Override
    public List<DataReview> findAllDataReviewService(DataReview dataReview,Date reviewerTime1) {
        return dataReviewDao.queryAll(dataReview,reviewerTime1);
    }

    @Override
    public int update(DataReview dataReview) {
        return dataReviewDao.update(dataReview);
    }
}