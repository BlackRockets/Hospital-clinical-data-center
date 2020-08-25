package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.Condition;
import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.UserService;
import com.hospitaldatacenter.service.impl.ConditionServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    private ConditionServiceImpl conditionService;

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

    @ResponseBody
    @RequestMapping("findAllUserName")
    public List<User> findAllUserName() {
        return userService.selectName();
    }

    /**
     *@description: 设定组内用户或权限
     *@author: zyl
     */
    @ResponseBody
    @RequestMapping("addTeamInUserOrPer")
    public void   addTeamInUserOrPer(String[] names,String[] permissionName,Integer roleId,Integer groupId,Integer teamDataId) {
        userService.insertTeamInUserOrPer(names,permissionName,roleId,groupId,teamDataId);
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(User user, HttpServletRequest request, HttpServletResponse response) {
        // 根据用户名和密码创建 Token
        String name = user.getName();
        String password = user.getPassword();
        UsernamePasswordToken token;
        if(name != null && password!=null){
            token = new UsernamePasswordToken(user.getName(), user.getPassword());
        }else {
            return "信息不能为空";
        }

        // 获取 subject 认证主体

        Subject subject = SecurityUtils.getSubject();
        try{
            // 开始认证，这一步会跳到我们自定义的 Realm 中
            subject.login(token);
            Cookie cookie = new Cookie("userName",user.getName());
            cookie.setPath("/");
            response.addCookie(cookie);
            //request.getSession().setAttribute("user", user);
            return "success";
        }catch(Exception e){
            e.printStackTrace();
            //request.getSession().setAttribute("user", user);
            request.setAttribute("error", "用户名或密码错误！");
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "updatePassword")
    public int updatePassword(@RequestParam("username") String username,@RequestParam("newPasswordTrue") String newPasswordTrue){
        System.out.println(username);
        User user = userService.queryUserByUserName(username);
        user.setPassword(newPasswordTrue);
        int update = userService.updatePassword(user);
        return update;
    }

    @ResponseBody
    @RequestMapping("selectByName")
    public User selectByName(String username){
        User user = userService.queryUserByUserName(username);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "advanceSearch",produces = {"application/json;charset=utf-8"})
    public  String advanceSearch(@RequestBody List<Condition> list){
        int insert = conditionService.insert(list);
        System.out.println(insert);
        return null;
    }

}