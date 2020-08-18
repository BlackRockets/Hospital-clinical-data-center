package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.HospitalPerson;
import com.hospitaldatacenter.entity.Permission;
import com.hospitaldatacenter.service.PermissionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表控制层
 *
 * @author makejava
 * @since 2020-08-14 16:27:59
 */
@Controller
@RequestMapping("permission")
public class PermissionController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionService permissionService;

    /**
     * 通过主键查询单条数据

     * @return 单条数据
     */
    @ResponseBody
    @RequestMapping("selectAll")
    public List<Permission> selectAll(Permission permission, HospitalPerson hp) {
        permission.setHp(hp);
        List<Permission> permissions=permissionService.queryAll(permission);
        return permissions;
    }
    @ResponseBody
    @RequestMapping("insert")
     public String insert(String departmentId,String personId){
        int i=permissionService.insert(departmentId,personId);
        return JSON.toJSONString(i);
    }
    @ResponseBody
    @RequestMapping("update")
    public String update(Integer id,String departmentId,String personId){
        int i=permissionService.update(id,departmentId,personId);
        return JSON.toJSONString(i);
    }
    @ResponseBody
    @RequestMapping("delete")
    public String delete(Integer[] ids) {
        int i = permissionService.delete(ids);
        return JSON.toJSONString(i);
    }
}