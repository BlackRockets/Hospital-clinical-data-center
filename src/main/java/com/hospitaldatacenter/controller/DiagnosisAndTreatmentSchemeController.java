package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.DiagnosisAndTreatmentScheme;
import com.hospitaldatacenter.service.DiagnosisAndTreatmentSchemeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 诊疗方案(DiagnosisAndTreatmentScheme)表控制层
 *
 * @author makejava
 * @since 2020-08-12 09:31:25
 */
@RestController
@RequestMapping("diagnosisAndTreatmentScheme")
public class DiagnosisAndTreatmentSchemeController {
    /**
     * 服务对象
     */
    @Resource
    private DiagnosisAndTreatmentSchemeService diagnosisAndTreatmentSchemeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DiagnosisAndTreatmentScheme selectOne(Integer id) {
        return this.diagnosisAndTreatmentSchemeService.queryById(id);
    }

}