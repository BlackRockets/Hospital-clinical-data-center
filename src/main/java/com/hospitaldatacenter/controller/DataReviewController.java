package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.DataReview;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.DataReviewService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * (DataReview)表控制层
 *
 * @author makejava
 * @since 2020-08-07 14:12:21
 */
@Controller
@RequestMapping("dataReview")
public class DataReviewController {
    /**
     * 服务对象
     */
    @Resource
    private DataReviewService dataReviewService;

    /**
     * 查询所有数据
     */
    @ResponseBody
    @GetMapping(value = "selectAll", produces = {"application/json;charset=utf-8"})
    public List<DataReview> selectAll(String reviewerTime1, DataReview dataReview, PatientSchedule ps, FollowUpGroupManagement fugm) {
        dataReview.setPs(ps);
        dataReview.setFugm(fugm);
        Date reviewerTime2 = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (reviewerTime1 == null) {
            reviewerTime2 = null;
        } else {
            try {
                reviewerTime2 = format.parse(reviewerTime1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<DataReview> dataReviews = dataReviewService.findAllDataReviewService(dataReview, reviewerTime2);
        return dataReviews;
    }

    @ResponseBody
    @GetMapping("update")
    public String update(DataReview dataReview) {
        int i = dataReviewService.update(dataReview);
        return JSON.toJSONString(i);
    }
}