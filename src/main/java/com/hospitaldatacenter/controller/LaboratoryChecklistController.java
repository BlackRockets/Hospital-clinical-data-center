package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.LaboratoryChecklist;
import com.hospitaldatacenter.service.LaboratoryChecklistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (LaboratoryChecklist)表控制层
 *
 * @author makejava
 * @since 2020-08-06 17:35:06
 */
@RestController
@RequestMapping("laboratoryChecklist")
public class LaboratoryChecklistController {
    /**
     * 服务对象
     */
    @Resource
    private LaboratoryChecklistService laboratoryChecklistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LaboratoryChecklist selectOne(Integer id) {
        return this.laboratoryChecklistService.queryById(id);
    }

}