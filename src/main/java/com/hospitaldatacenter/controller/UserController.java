package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-08-12 15:56:16
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 添加单条数据
     */
    @ResponseBody
    @GetMapping("insert")
    public String insert(User user) {
        int i = userService.insert(user);
        return JSON.toJSONString(i);
    }

    @ResponseBody
    @GetMapping("selectAll")
    public List<User> selectAll(User user, Departments departments) {
        user.setDepartments(departments);
        List<User> users = userService.queryAll(user);
        return users;
    }

    @ResponseBody
    @GetMapping("update")
    public String update(User user) {
        int i = userService.update(user);
        return JSON.toJSONString(i);
    }
    @ResponseBody
    @RequestMapping("delete")
    public String delete(Integer id) {
       int i= userService.delete(id);
       return JSON.toJSONString(i);
    }
}