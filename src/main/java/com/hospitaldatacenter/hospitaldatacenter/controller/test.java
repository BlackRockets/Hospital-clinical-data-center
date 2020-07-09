package com.hospitaldatacenter.hospitaldatacenter.controller;


import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {

    @RequestMapping("index")
    @ResponseBody
    public String test(){
        return JSON.toJSONString("你真的是一头猪");
    }



}
