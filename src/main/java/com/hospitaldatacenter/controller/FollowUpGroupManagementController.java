package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.FollowUpGroupMember;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.FollowUpGroupManagementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

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

    /**
     *@description:  随访组新增
     *@author: zyl,produces = {"application/json;charset=utf-8"}
     */
    @CrossOrigin
    @RequestMapping(value = "insert")
    public int insert(@RequestBody String followUpGroupManagement){
        int insertRow = followUpGroupManagementService.insert(followUpGroupManagement);
        return insertRow;
    }


    /**
     *
     *
     *@description: 条件查询所有的随访组
     *@author: zyl
     *
     */
    @RequestMapping("selectAllCondition")
    public List<FollowUpGroupManagement> selectAllCondition(@RequestBody String followUpGroupManagement){
        List<FollowUpGroupManagement> followUpGroupManagements = followUpGroupManagementService.queryAllCondition(followUpGroupManagement);
        return followUpGroupManagements;
    }

    /**
     *
     *
     *@description: 批量删除根据id
     *@author: zyl
     *
     */
    @RequestMapping("deleteById")
    public void deleteById(@RequestBody Integer[] ids){
        followUpGroupManagementService.deleteById(ids);
    }

    /**
     *
     *
     *@description: 更新数据
     *@author: zyl
     *
     */
    @RequestMapping("updateById")
    public int updateById(@RequestBody String followUpGroupManagement){
        return  followUpGroupManagementService.update(followUpGroupManagement);
    }

    /**
     *
     *
     *@description: 根据随访组id所有（非患者）成员
     *@author: zyl
     *
     */
    @RequestMapping("findByFollowUpGroupId")
    public Set<User> findByFollowUpGroupId(@RequestBody String followUpGroupMember){
        return followUpGroupManagementService.queryByfollowUpGroupId(followUpGroupMember);
    }

    /**
     *
     *
     *@description: 删除某个随访组中的某个角色权限
     *@author: zyl
     *
     */
    @RequestMapping("delById")
    public void delById(@RequestBody Integer[] ids){
        followUpGroupManagementService.delById(ids);
    }

    /**
     *@description: 新增组内角色
     *@author: zyl
     */
    @RequestMapping("addGroupRole")
    public void addGroupRole(@RequestBody String followUpGroupMember){
        followUpGroupManagementService.newGroupRole(followUpGroupMember);
    }
}