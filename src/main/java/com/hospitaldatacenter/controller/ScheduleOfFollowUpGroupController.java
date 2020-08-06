package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ScheduleOfFollowUpGroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)表控制层
 *
 * @author makejava
 * @since 2020-08-06 17:35:07
 */
@RestController
@RequestMapping("scheduleOfFollowUpGroup")
public class ScheduleOfFollowUpGroupController {
    /**
     * 服务对象
     */
    @Resource
    private ScheduleOfFollowUpGroupService scheduleOfFollowUpGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ScheduleOfFollowUpGroup selectOne(Integer id) {
        return this.scheduleOfFollowUpGroupService.queryById(id);
    }

}