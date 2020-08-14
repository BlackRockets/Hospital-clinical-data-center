package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.DiagnosisAndTreatmentScheme;
import com.hospitaldatacenter.service.DiagnosisAndTreatmentSchemeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public List<DiagnosisAndTreatmentScheme> selectOne(@RequestParam("id") Integer id,@RequestParam("groupId")Integer groupId) {
        System.out.println(id+"=============="+groupId);

        DiagnosisAndTreatmentScheme diagnosisAndTreatmentScheme = diagnosisAndTreatmentSchemeService.queryById(id,groupId);
        String s = JSON.toJSONString(diagnosisAndTreatmentScheme);
        ArrayList<DiagnosisAndTreatmentScheme> list = new ArrayList<>();
        list.add(diagnosisAndTreatmentScheme);
        return list;
    }
    @RequestMapping("selectAllId")
    public List<DiagnosisAndTreatmentScheme> selectAllId(Integer groupId){
        System.out.println(groupId);
        List<DiagnosisAndTreatmentScheme> diagnosisAndTreatmentSchemes = diagnosisAndTreatmentSchemeService.queryAllId(groupId);
        return diagnosisAndTreatmentSchemes;
    }
    @RequestMapping("save")
    public int save(@RequestParam("pharmacy")String pharmacy,@RequestParam("checkout")String checkout,@RequestParam("examine")String examine,@RequestParam("treat")String treat,@RequestParam("operation")String operation,@RequestParam("inform")String inform,@RequestParam("groupId")Integer groupId){
        DiagnosisAndTreatmentScheme diag = new DiagnosisAndTreatmentScheme();
        diag.setCheckout(checkout);
        diag.setExamine(examine);
        diag.setInform(inform);
        diag.setOperation(operation);
        diag.setPharmacy(pharmacy);
        diag.setTreat(treat);
        diag.setFollowUpGroupId(groupId);
        int insert = diagnosisAndTreatmentSchemeService.insert(diag);
        return insert;
    }

}