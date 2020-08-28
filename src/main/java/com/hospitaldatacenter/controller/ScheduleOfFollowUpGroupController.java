package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ScheduleOfFollowUpGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
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
    @ResponseBody
    @RequestMapping(value = "selectAllByAdvanced")
    public String selectAllByAdvanced(){
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupService.queryAllAdvanced(null);
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

    /**
     *@description:  更新随访组成员
     *@author: zyl
     */
    @RequestMapping("selectByCondition")
    public List<ScheduleOfFollowUpGroup> selectByCondition(@RequestBody String scheduleOfFollowUpGroup){
        return scheduleOfFollowUpGroupService.queryByCondition(scheduleOfFollowUpGroup);
    }

    /**
     *@description: 按不同条件入组
     *@author: zyl
     */
    @RequestMapping("findAllDepartmentsByDepartmentsId")
    public void findAllDepartmentsByDepartmentsId(@RequestBody String patientSchedule) {
        scheduleOfFollowUpGroupService.addQueryAllDepartmentsByDepartmentsId(patientSchedule);
    }
    /**
     *@description: 高级检索批量删除
     *@author: zyl
     */
    @ResponseBody
    @RequestMapping("deleteAll")
    public String deleteAll(Integer[] ids) {
        int i = scheduleOfFollowUpGroupService.deleteAll(ids);
        return JSON.toJSONString(i);
    }
    @ResponseBody
    @RequestMapping("updateByAdvanced")
    public String updateByAdvanced(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup){
        int i=scheduleOfFollowUpGroupService.updateByAdvanced(scheduleOfFollowUpGroup);
        return JSON.toJSONString(i);
    }
    @ResponseBody
    @RequestMapping("findAdvanced")
    protected String findAdvanced(String[] list){
        String fieldName="";
        String symbol="";
        String value="";
        if (list.length==0){
            return JSON.toJSONString(0);
        }else if (list.length>3){
            fieldName.equals(list[0]);
            symbol.equals(list[1]);
            value.equals(list[2]);
            System.out.println(fieldName);
            System.out.println(symbol);
            System.out.println(value);
        }
        return JSON.toJSONString(0);
    }

    @RequestMapping("selectByDate")
    public HashMap<String,Object> selectByDate(String dat){
        System.out.println(dat);
        HashMap<String, Object> map = scheduleOfFollowUpGroupService.selectByDate(dat);
        System.out.println(map);
        return map;
    }
}