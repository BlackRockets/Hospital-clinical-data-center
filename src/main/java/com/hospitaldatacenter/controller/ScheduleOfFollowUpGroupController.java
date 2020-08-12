package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ScheduleOfFollowUpGroupService;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    @RequestMapping(value = "selectById")
    public ScheduleOfFollowUpGroup selectOne(Integer id) {
        System.out.println(id);
        return null;
    }
    /**
     * 展示所有
     *无条件
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

    /**
     * 展示所有
     *条件查询
     */
    @ResponseBody
    @RequestMapping(value = "selectAllByCondition")
    public String selectAllByCondition(@RequestBody(required = false) String dataItem){
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupService.queryAllByCondition(dataItem);
        return JSON.toJSONString(scheduleOfFollowUpGroups);
    }
    /**
     *已随访
     */
    @ResponseBody
    @RequestMapping(value = "selectAllByFollowUpState")
    public String selectAllByFollowUpState(@RequestBody(required = false) String status){
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupService.selectAllByFollowUpState();
        return JSON.toJSONString(scheduleOfFollowUpGroups);
    }
    /**
     *未随访
     */
    @ResponseBody
    @RequestMapping(value = "selectAllByNoFollowUpState")
    public String selectAllByNoFollowUpState(@RequestBody(required = false) String status){
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupService.selectAllByNoFollowUpState();
        return JSON.toJSONString(scheduleOfFollowUpGroups);
    }

    /**
     *@description: 添加随访组成员
     *@author: zyl
     */
    @RequestMapping("newAddScheduleOfFollowUpGroup")
    public int newAddScheduleOfFollowUpGroup(@RequestBody String scheduleOfFollowUpGroup){
        return  scheduleOfFollowUpGroupService.insert(scheduleOfFollowUpGroup);
    }

    /**
     *@description: 删除随访组成员
     *@author: zyl
     */
    @RequestMapping("deleteScheduleOfFollowUpGroup")
    public void deleteScheduleOfFollowUpGroup(@RequestBody Integer[] ids){
          scheduleOfFollowUpGroupService.deleteById(ids);
    }

    /**
     *@description:  更新随访组成员
     *@author: zyl
     */
    @RequestMapping("updateScheduleOfFollowUpGroup")
    public int updateScheduleOfFollowUpGroup(@RequestBody String scheduleOfFollowUpGroup){
        return scheduleOfFollowUpGroupService.update(scheduleOfFollowUpGroup);
    }
}