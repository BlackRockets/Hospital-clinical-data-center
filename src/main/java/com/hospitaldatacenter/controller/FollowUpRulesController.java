package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.FollowUpRules;
import com.hospitaldatacenter.service.FollowUpRulesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FollowUpRules)表控制层
 *
 * @author makejava
 * @since 2020-08-14 16:33:16
 */
@RestController
@RequestMapping("followUpRules")
public class FollowUpRulesController {
    /**
     * 服务对象
     */
    @Resource
    private FollowUpRulesService followUpRulesService;

    /**
     *@description: 根据随访组id 查询所有符合要求的数据
     *@author: zyl
     */
    @RequestMapping("findByFollowUpGroupId")
    public List<FollowUpRules> findByFollowUpGroupId(@RequestBody String followUpRules) {
        return this.followUpRulesService.queryByFollowUpGroupId(followUpRules);
    }

    /**
     *@description: 新增
     *@author: zyl
     */
    @RequestMapping("newFollowUpRule")
    public void newFollowUpRule(@RequestBody String followUpRules) {
         this.followUpRulesService.insert(followUpRules);
    }

}