package com.hospitaldatacenter.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hospitaldatacenter.dao.PatientScheduleDao;
import com.hospitaldatacenter.dao.ScheduleOfFollowUpGroupDao;
import com.hospitaldatacenter.entity.FollowUpGroupManagement;
import com.hospitaldatacenter.entity.PatientSchedule;
import com.hospitaldatacenter.entity.ScheduleOfFollowUpGroup;
import com.hospitaldatacenter.service.ScheduleOfFollowUpGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 随访组明细表(ScheduleOfFollowUpGroup)表服务实现类
 *
 * @author makejava
 * @since 2020-08-07 10:31:13
 */
@Service
public class ScheduleOfFollowUpGroupServiceImpl implements ScheduleOfFollowUpGroupService {
    @Autowired
    private ScheduleOfFollowUpGroupDao scheduleOfFollowUpGroupDao;
    @Resource
    private PatientScheduleDao patientScheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ScheduleOfFollowUpGroup queryById(Integer id) {
        return this.scheduleOfFollowUpGroupDao.queryById(id);
    }


    /**
     *@description: 通过随访组id查询数据
     *@author: zyl
     */
    @Override
    public List<ScheduleOfFollowUpGroup> queryByFollowUpGroupId(Integer followUpGroupId) {
        return scheduleOfFollowUpGroupDao.queryByFollowUpGroupId(followUpGroupId);
    }

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    @Override
    public List<ScheduleOfFollowUpGroup> queryAll(ScheduleOfFollowUpGroup scheduleOfFollowUpGroup) {
       return this.scheduleOfFollowUpGroupDao.queryAll(scheduleOfFollowUpGroup);
    }

    /**
     * 新增数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(String scheduleOfFollowUpGroup) {
        JSON parse = (JSON) JSON.parse(scheduleOfFollowUpGroup);
        ScheduleOfFollowUpGroup scheduleOfFollowUpGroup1 = JSON.toJavaObject(parse, ScheduleOfFollowUpGroup.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        scheduleOfFollowUpGroup1.setGroupEntryTime(format);
        return this.scheduleOfFollowUpGroupDao.insert(scheduleOfFollowUpGroup1);
    }

    /**
     * 修改数据
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return
     */
    @Override
    public int update(String scheduleOfFollowUpGroup) {
        JSON parse = (JSON) JSON.parse(scheduleOfFollowUpGroup);
        ScheduleOfFollowUpGroup scheduleOfFollowUpGroup1 = JSON.toJavaObject(parse, ScheduleOfFollowUpGroup.class);
        return this.scheduleOfFollowUpGroupDao.update(scheduleOfFollowUpGroup1);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(Integer[] ids) {
        for (int i = 0; i < ids.length; i++) {
            this.scheduleOfFollowUpGroupDao.deleteById(ids[i]);
        }
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param scheduleOfFollowUpGroup 实例对象
     * @return 对象列表
     */
    @Override
    public List<ScheduleOfFollowUpGroup> queryAllByCondition(String dataItem) {
        ScheduleOfFollowUpGroup sch = JSONObject.parseObject(dataItem, ScheduleOfFollowUpGroup.class);
        FollowUpGroupManagement fol = JSONObject.parseObject(dataItem, FollowUpGroupManagement.class);
        sch.setFollowUpGroupManagement(fol);
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupDao.queryAllByCondition(sch);
        return scheduleOfFollowUpGroups;
    }

    @Override
    public List<ScheduleOfFollowUpGroup> queryByCondition(String scheduleOfFollowUpGroup) {
        ScheduleOfFollowUpGroup fol = JSONObject.parseObject(scheduleOfFollowUpGroup, ScheduleOfFollowUpGroup.class);
        return scheduleOfFollowUpGroupDao.queryByCondition(fol);
    }

    @Override
    public List<ScheduleOfFollowUpGroup> selectAllByFollowUpState() {
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupDao.selectAllByFollowUpState();
        return scheduleOfFollowUpGroups;
    }

    @Override
    public List<ScheduleOfFollowUpGroup> selectAllByNoFollowUpState() {
        List<ScheduleOfFollowUpGroup> scheduleOfFollowUpGroups = scheduleOfFollowUpGroupDao.selectAllByNoFollowUpState();
        return scheduleOfFollowUpGroups;
    }



    @Override
    public void addQueryAllDepartmentsByDepartmentsId(String patientSchedule) {
        PatientSchedule patientSchedule1 = JSONObject.parseObject(patientSchedule, PatientSchedule.class);
        Integer id = patientSchedule1.getId();

        List<PatientSchedule> patientSchedules = patientScheduleDao.selectAllDepartmentsByDepartmentsId(patientSchedule1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        for (PatientSchedule patientSchedule2 : patientSchedules) {
            patientSchedule2.setGroupEntryTime(format);
            patientSchedule2.setFollowUpState("未随访");
            patientSchedule2.setFollowUpGroupId(id);
            scheduleOfFollowUpGroupDao.insertPatientSchedule(patientSchedule2);
        }
    }
}