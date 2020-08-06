package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.service.PatientScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PatientSchedule)表控制层
 *
 * @author makejava
 * @since 2020-08-06 17:35:07
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

}