package com.hospitaldatacenter.controller;

import com.hospitaldatacenter.entity.TermApproval;
import com.hospitaldatacenter.service.TermApprovalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 术语审批
 * (TermApproval)表控制层
 *
 * @author makejava
 * @since 2020-08-18 15:40:28
 */
@RestController
@RequestMapping("termApproval")
public class TermApprovalController {
    /**
     * 服务对象
     */
    @Resource
    private TermApprovalService termApprovalService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TermApproval selectOne(Integer id) {
        return this.termApprovalService.queryById(id);
    }

}