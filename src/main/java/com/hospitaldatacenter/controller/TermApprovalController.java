package com.hospitaldatacenter.controller;

import com.alibaba.fastjson.JSON;
import com.hospitaldatacenter.entity.DataReview;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.TermApproval;
import com.hospitaldatacenter.service.TermApprovalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 术语审批
 * (TermApproval)表控制层
 *
 * @author makejava
 * @since 2020-08-18 15:40:28
 */
@Controller
@RequestMapping("termApproval")
public class TermApprovalController {
    /**
     * 服务对象
     */
    @Resource
    private TermApprovalService termApprovalService;


    @ResponseBody
    @RequestMapping("selectOne")
    public TermApproval selectOne(String name) {
        if (name == "") {
            return null;
        } else {
            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println(now);
            TermApproval termApprovals = termApprovalService.queryOne(name);
            termApprovals.setCreateTime(now);
            return termApprovals;
        }
    }

    @ResponseBody
    @RequestMapping("selectAll")
    public List<TermApproval> selectAll() {
        List<TermApproval> termApprovals = termApprovalService.queryAll();
        return termApprovals;
    }

    @ResponseBody
    @RequestMapping("selectClassification")
    public List<TermApproval> selectClassification() {
        List<TermApproval> termApprovals = termApprovalService.selectClassification();
        return termApprovals;
    }

    @ResponseBody
    @RequestMapping("selectType")
    public List<TermApproval> selectType() {
        List<TermApproval> termApprovals = termApprovalService.selectType();
        return termApprovals;
    }

    @ResponseBody
    @RequestMapping("update")
    public String update(TermApproval termApproval) {
        int i = termApprovalService.update(termApproval);
        return JSON.toJSONString(i);
    }
}