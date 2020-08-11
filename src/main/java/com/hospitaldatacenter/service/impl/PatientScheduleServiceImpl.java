package com.hospitaldatacenter.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hospitaldatacenter.dao.PatientScheduleDao;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.PatientScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 患者明细表(PatientSchedule)表服务实现类
 *
 * @author makejava
 * @since 2020-08-07 10:31:12
 */
@Service("patientScheduleService")
public class PatientScheduleServiceImpl implements PatientScheduleService {
    @Resource
    private PatientScheduleDao patientScheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PatientSchedule queryById(Integer id) {
        return this.patientScheduleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<PatientSchedule> queryAllByLimit(int offset, int limit) {
        return this.patientScheduleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param patientSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public PatientSchedule insert(PatientSchedule patientSchedule) {
        this.patientScheduleDao.insert(patientSchedule);
        return patientSchedule;
    }

    /**
     * 修改数据
     *
     * @param patientSchedule 实例对象
     * @return 实例对象
     */
    @Override
    public PatientSchedule update(PatientSchedule patientSchedule) {
        this.patientScheduleDao.update(patientSchedule);
        return this.queryById(patientSchedule.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.patientScheduleDao.deleteById(id) > 0;
    }
    /**
     * 通过id查询
     *
     * @return 影响行数
     */
    @Override
    public List<PatientSchedule> selectByName(String name) {
        List<PatientSchedule> patientSchedules = patientScheduleDao.selectByName(name);
        return patientSchedules;
    }
    /**
     * 通过条件查询
     *
     * @return 影响行数
     */
    @Override
    public List<PatientSchedule> selectAllByCondition(String  dataItem) {
        List<PatientSchedule> patientSchedules=null;
        PatientSchedule pat = JSONObject.parseObject(dataItem, PatientSchedule.class);
        ScheduleOfFollowUpGroup sch = JSONObject.parseObject(dataItem, ScheduleOfFollowUpGroup.class);
        FollowUpGroupManagement fol = JSONObject.parseObject(dataItem, FollowUpGroupManagement.class);
        pat.setFollowUpGroupManagement(fol);
        pat.setScheduleOfFollowUpGroup(sch);
        System.out.println(pat);
        if ("1".equals(pat.getCondition())){
            patientSchedules = patientScheduleDao.selectAllByCondition(pat);
        }else if ("2".equals(pat.getCondition())){
            patientSchedules = patientScheduleDao.selectAllByConditionEnd(pat);
        }else if ("3".equals(pat.getCondition())){
            patientSchedules = patientScheduleDao.selectAllByConditionMax(pat);
        }else if ("4".equals(pat.getCondition())){
            patientSchedules = patientScheduleDao.selectAllByConditionMin(pat);
        }
        System.out.println("--------------------"+patientSchedules);
        return patientSchedules;
    }
}