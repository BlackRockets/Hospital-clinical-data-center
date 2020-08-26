package com.hospitaldatacenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: zyl
 * @time: 2020/8/24 16:00
 */
@Controller
public class FilterController {


    /**
     *@description: 分组管理
     *@author: zyl
     */
    @RequestMapping("/toGroup_management")
    public String toGroup_management(){
        return "group_management";
    }

    /**
     *@description: 单个随访组管理
     *@author: zyl
     */
    @RequestMapping("/inDividualFollowUpGroupManagement")
    public String toInDividualFollowUpGroupManagement(){
        return "inDividualFollowUpGroupManagement";
    }

    /**
     *@description: 权限管理
     *@author: zyl
     */
    @RequestMapping("/toAuthorityManagement")
    public String toAuthorityManagement(){
        return "authorityManagement";
    }

    /**
     *@description: 入组管理
     *@author: zyl
     */
    @RequestMapping("/theGroupManagement")
    public String theGroupManagement(){
        return "theGroupManagement";
    }

    /**
     *@description: 模板设置
     *@author: zyl
     */
    @RequestMapping("/templateSettings")
    public String templateSettings(){
        return "templateSettings";
    }

    /**
     *@description: 随访规则设定
     *@author: zyl
     */
    @RequestMapping("/toFollowUpRuleSetting")
    public String toFollowUpRuleSetting(){
        return "followUpRuleSetting";
    }

    /**
     *@description: 诊疗方案
     *@author: zyl
     */
    @RequestMapping("/diagnosisAndTreatmentScheme")
    public String diagnosisAndTreatmentScheme(){
        return "diagnosisAndTreatmentScheme";
    }

    /**
     *@description: 创建模板
     *@author: zyl
     */
    @RequestMapping("/templateDesign")
    public String templateDesign(){
        return "templateDesign";
    }

    /**
     *@description: 节假日管理
     *@author: zyl
     */
    @RequestMapping("/toHoliday")
    public String toHoliday(){
        return "holiday";
    }

    /**
     *@description: 随访进度及计划明细
     *@author: zyl
     */
    @RequestMapping("/toPatientDetailsPage")
    public String toPatientDetailsPage(){
        return "patientDetailsPage";
    }

    /**
     *@description:  高级检索
     *@author: zyl
     */
    @RequestMapping("/toAdvancedSearch")
    public String toAdvancedSearch(){
        return "advancedSearch";
    }

}
