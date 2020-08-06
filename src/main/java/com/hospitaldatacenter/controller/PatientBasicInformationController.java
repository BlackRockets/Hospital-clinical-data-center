package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.PatientBasicInformation;
import com.hospitaldatacenter.service.PatientBasicInformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PatientBasicInformation)表控制层
 *
 * @author makejava
 * @since 2020-08-06 17:35:07
 */
@RestController
@RequestMapping("patientBasicInformation")
public class PatientBasicInformationController {
    /**
     * 服务对象
     */
    @Resource
    private PatientBasicInformationService patientBasicInformationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PatientBasicInformation selectOne(Integer id) {
        return this.patientBasicInformationService.queryById(id);
    }

}