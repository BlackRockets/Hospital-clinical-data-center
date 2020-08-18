package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }

    @RequestMapping(value = "/err")
    public String err(){
        return "/err";
    }

    @RequestMapping(value = "/subLogin")
    public String subLogin(User user){
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(),user.getPassword());
        try{
            subject.login(token);
        }catch (AuthenticationException e){
            e.printStackTrace();
            return e.getMessage();
        }
        return "success";
    }

    @RequiresRoles(value = "admin")
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return  "123";
    }

}
