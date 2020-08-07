package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ScheduleOfFollowUpGroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)表控制层
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
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
    /**
     * 展示所有
     *
     */
    @ResponseBody
    @RequestMapping(value = "selectAll")
    public String selectAll(){
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupService.queryAll(null);
        return JSON.toJSONString(scheduleOfFollowUpGroups);
    }

    /**
     *@description: 通过随访组id查询数据
     *@author: zyl
     */
    @RequestMapping("selectByFollowUpGroupId")
    public List<ScheduleOfFollowUpGroup> selectByFollowUpGroupId(Integer followUpGroupId){
         return  scheduleOfFollowUpGroupService.queryByFollowUpGroupId(followUpGroupId);
    }
}