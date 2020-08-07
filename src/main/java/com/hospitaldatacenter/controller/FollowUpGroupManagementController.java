package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.service.FollowUpGroupManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 随访组管理表(FollowUpGroupManagement)表控制层
 *
 * @author makejava
 * @since 2020-08-07 10:31:09
 */
@RestController
@RequestMapping("followUpGroupManagement")
public class FollowUpGroupManagementController {
    /**
     * 服务对象
     */
    @Resource
    private FollowUpGroupManagementService followUpGroupManagementService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FollowUpGroupManagement selectOne(Integer id) {
        return this.followUpGroupManagementService.queryById(id);
    }


    /**
     *
     *
     *@description: 查询所有的随访组  需求是根据当前用户的权限进行筛选（还未实现）
     *@author: zyl
     *
     */
    @RequestMapping("selectAll")
    public List<FollowUpGroupManagement> selectAll(){
         List<FollowUpGroupManagement> followUpGroupManagements = followUpGroupManagementService.queryAll();
        return followUpGroupManagements;
    }

    /**
     *
     *查询所有科室
     *
     */
    @RequestMapping("selectResponsibilityDep")
    public List<FollowUpGroupManagement> selectResponsibilityDep(){
        List<FollowUpGroupManagement> followUpGroupManagements = followUpGroupManagementService.queryAllDep();
        return followUpGroupManagements;
    }

    /**
     *
     *查询所有随访组
     *
     */
    @RequestMapping("selectGroupName")
    public List<FollowUpGroupManagement> selectGroupName(){
        List<FollowUpGroupManagement> followUpGroupManagements = followUpGroupManagementService.queryAllGroupName();
        return followUpGroupManagements;
    }

}