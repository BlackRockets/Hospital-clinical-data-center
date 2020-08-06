package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.service.FollowUpGroupManagementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 随访组管理表(FollowUpGroupManagement)表控制层
 *
 * @author makejava
 * @since 2020-08-06 17:33:39
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

}