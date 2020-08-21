package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.Menu;
import com.hospitaldatacenter.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Menu)表控制层
 *
 * @author makejava
 * @since 2020-08-20 16:36:48
 */
@Controller
@RequestMapping("menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Resource
    private MenuService menuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Menu selectOne(Integer id) {
        return this.menuService.queryById(id);
    }
     @ResponseBody
     @RequestMapping("selectAll")
     public List<Menu> selectAll(){
        List<Menu> menus=menuService.queryAll();
        return menus;
     }
}