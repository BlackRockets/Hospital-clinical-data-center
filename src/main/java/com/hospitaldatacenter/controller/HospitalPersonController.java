package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.HospitalPerson;
import com.hospitaldatacenter.entity.Permission;
import com.hospitaldatacenter.service.HospitalPersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (HospitalPerson)表控制层
 *
 * @author makejava
 * @since 2020-08-14 16:27:36
 */
@Controller
@RequestMapping("hospitalPerson")
public class HospitalPersonController {
    /**
     * 服务对象
     */
    @Resource
    private HospitalPersonService hospitalPersonService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @ResponseBody
    @RequestMapping("selectOneByName")
    public List<HospitalPerson> selectOneByName() {
        List<HospitalPerson> hospitalPersonList = hospitalPersonService.queryByName();
        return hospitalPersonList;
    }

    @ResponseBody
    @RequestMapping("selectOneName")
    public String selectOneName(String personName) {
        String id = hospitalPersonService.queryName(personName);
        return id;
    }
}