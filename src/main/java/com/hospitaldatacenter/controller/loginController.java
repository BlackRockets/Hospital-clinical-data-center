package com.hospitaldatacenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: zyl
 * @time: 2020/8/18 13:47
 */
@Controller
public class loginController {

    @RequestMapping("goLogin")
    public String login(){
        return  "/login";
    }

    @RequestMapping("index")
    public String index(){
        return  "/index";
    }
}
