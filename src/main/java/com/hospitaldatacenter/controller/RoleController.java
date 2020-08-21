package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.Role;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.RoleService;
import com.hospitaldatacenter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: zyl
 * @time: 2020/8/20 17:35
 */
@Controller
@RequestMapping("role")
public class RoleController {

    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 添加单条数据
     */
    @ResponseBody
    @RequestMapping("findMenuByFollowUpGroupId")
    public List<Role> findMenuByFollowUpGroupId(Integer followUpGroupId) {
        List<Role> roles = roleService.queryMenuByFollowUpGroupId(followUpGroupId);
        return roles;
    }
}
