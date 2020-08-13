package com.hospitaldatacenter.controller;

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
     * 通过主键查询单条数据
     *
     */
    @GetMapping("selectAll")
    @ResponseBody
    public List<User> selectAll() {
        List<User> users=userService.queryAll();
        return users;
    }

}