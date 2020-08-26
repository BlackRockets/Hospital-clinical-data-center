package com.hospitaldatacenter.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }

    @RequestMapping(value = "/index")
    public String err() {
        return "index";
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        return "forward:/login";
    }

}
