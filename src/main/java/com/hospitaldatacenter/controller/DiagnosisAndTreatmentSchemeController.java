package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.DiagnosisAndTreatmentScheme;
import com.hospitaldatacenter.service.DiagnosisAndTreatmentSchemeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
        System.out.println(id);
        DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme = diagnosisAndTreatmentSchemeService.queryById(id);
        System.out.println(diagnosisAndTreatmentScheme);
        return diagnosisAndTreatmentScheme;
    }
    @RequestMapping("selectAllId")
    public List<DiagnosisAndTreatmentScheme> selectAllId(){
        List<DiagnosisAndTreatmentScheme> diagnosisAndTreatmentSchemes = diagnosisAndTreatmentSchemeService.queryAllId();
        for (DiagnosisAndTreatmentScheme scheme : diagnosisAndTreatmentSchemes) {
            System.out.println(scheme);
        }
        return diagnosisAndTreatmentSchemes;
    }

}