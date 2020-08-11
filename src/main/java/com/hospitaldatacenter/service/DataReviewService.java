package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.DataReview;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * (DataReview)表服务接口
 *
 * @author makejava
 * @since 2020-08-07 14:11:54
 */
public interface DataReviewService {
    List<DataReview> findAllDataReviewService(DataReview dataReview,Date reviewerTime1);
    int update(DataReview dataReview);
}