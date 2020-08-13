package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.DataReview;
import com.hospitaldatacenter.entity.Template;
import com.hospitaldatacenter.service.TemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 模板(Template)表控制层
 *
 * @author makejava
 * @since 2020-08-12 09:40:19
 */
@Controller
@RequestMapping("template")
public class TemplateController {
    /**
     * 服务对象
     */
    @Resource
    private TemplateService templateService;


    @ResponseBody
    @GetMapping(value = "selectAll", produces = {"application/json;charset=utf-8"})
    public List<Template> selectAll(String groupName, String creationDate1,String creationDate2,String templateName,String creator) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date creationDate01= null;
        try {
            creationDate01 = format.parse(creationDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date creationDate02= null;
        try {
            creationDate02 = format.parse(creationDate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<Template> templates = templateService.queryAll(groupName,creationDate01,creationDate02,templateName,creator);
        return templates;
    }

    @ResponseBody
    @RequestMapping("selectAllNoCondition")
    public List<Template> selectAllNoCondition(){
        List<Template> templates = templateService.selectAllNoCondition();
        return templates;
    }

}