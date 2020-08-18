package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @RequestMapping("insert")
    public String insert(User user) {
        int i = userService.insert(user);
        return JSON.toJSONString(i);
    }

    @ResponseBody
    @RequestMapping("selectAll")
    public List<User> selectAll(User user, Departments departments) {
        user.setDepartments(departments);
        List<User> users = userService.queryAll(user);
        return users;
    }

    @ResponseBody
    @RequestMapping(value = "update", produces = {"application/json;charset=utf-8"})
    public int update(@RequestBody String user) {
        return userService.update(user);
    }

    @ResponseBody
    @RequestMapping("delete")
    public String delete(Integer[] ids) {
        int i = userService.delete(ids);
        return JSON.toJSONString(i);
    }

    @ResponseBody
    @RequestMapping("findAllPeopleByOccupation")
    public Map<String, ArrayList<User>> findAllPeopleByOccupation() {
        HashMap<String, ArrayList<User>> map = userService.selectAllPeopleByOccupation();
        return map;
    }
}