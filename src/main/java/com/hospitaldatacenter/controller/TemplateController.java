package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.DataReview;
import com.hospitaldatacenter.entity.Template;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.TemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public List<Template> selectAllNoCondition(Integer groupId){
        List<Template> templates = templateService.selectAllNoCondition(groupId);
        return templates;
    }

    @ResponseBody
    @RequestMapping(value = "save",produces = {"application/json;charset=utf-8"})
    public int save(@RequestParam("text")String text, @RequestParam("id")Integer id,@RequestParam("tempId")Integer tempId, HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        int save = templateService.save(text,id,tempId,user);
        return save;
    }

    @ResponseBody
    @RequestMapping(value = "releases",produces = {"application/json;charset=utf-8"})
    public int releases(@RequestParam("text")String text, @RequestParam("id")Integer id,@RequestParam("tempId")Integer tempId, HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        int save = templateService.releases(text, id,tempId,user);
        return save;
    }

    @ResponseBody
    @RequestMapping(value = "selectById")
    public Template  selectById(Integer id){
        Template template = templateService.queryById(id);
        return template;
    }
    @ResponseBody
    @RequestMapping("selectNamesByGroupId")
    public List<Template> selectNamesByGroupId(Integer groupId){
        System.out.println(groupId);
        List<Template> templates = templateService.selectNamesByGroupId(groupId);
        return templates;
    }

}