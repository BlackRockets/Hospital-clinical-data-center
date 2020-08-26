package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.service.PatientScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * 患者明细表(PatientSchedule)表控制层
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
 */
@RestController
@RequestMapping("patientSchedule")
public class PatientScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private PatientScheduleService patientScheduleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PatientSchedule selectOne(Integer id) {
        return this.patientScheduleService.queryById(id);
    }

    @RequestMapping("selectById")
    public List<PatientSchedule> selectById(String name) {
        List<PatientSchedule> patientSchedules = patientScheduleService.selectByName(name);
        return patientSchedules;
    }

    @ResponseBody
    @RequestMapping(value = "selectAllByCondition")
    public String selectAllByCondition(@RequestBody(required = false) String dataItem){
        List<PatientSchedule> scheduleOfFollowUpGroups = patientScheduleService.selectAllByCondition(dataItem);
        return JSON.toJSONString(scheduleOfFollowUpGroups);
    }

    /**
     *@description:查询所有科室
     *@author: zyl
     */
    @RequestMapping(value = "findAllDepartments")
    public List<Departments>  findAllDepartments(){
        return patientScheduleService.queryAllDepartments();
    }

    /**
     * @description:导出
     * @author: zyl
     */
    @ResponseBody
    @RequestMapping(value = "PatientScheduleExport", produces = {"application/json;charset=utf-8"})
    public String Export(Integer[] ids, String name)  {
        try {
            List list = patientScheduleService.findPatientScheduleIds(ids, name);
        } catch (IOException e) {

        }
        return JSON.toJSONString("1");

    }
    @RequestMapping("save")
    public Integer save(@RequestBody(required = false) String dataItem){
        int save = patientScheduleService.save(dataItem);
        return save;
    }
}