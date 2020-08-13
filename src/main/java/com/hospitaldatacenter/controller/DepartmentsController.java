package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.Departments;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.DepartmentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Departments)表控制层
 *
 * @author makejava
 * @since 2020-08-13 09:11:35
 */
@Controller
@RequestMapping("departments")
public class DepartmentsController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentsService departmentsService;



    @GetMapping("selectDepartments")
    public List<Departments> selectDepartments(){
        List<Departments> departments=departmentsService.queryDepartments();
        return departments;
    }
}