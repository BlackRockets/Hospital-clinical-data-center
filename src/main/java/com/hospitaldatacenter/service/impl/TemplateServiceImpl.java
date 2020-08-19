package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.TemplateDao;
import com.hospitaldatacenter.entity.Template;
import com.hospitaldatacenter.service.TemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 模板(Template)表服务实现类
 *
 * @author makejava
 * @since 2020-08-12 09:40:18
 */
@Service("templateService")
public class TemplateServiceImpl implements TemplateService {
    @Resource
    private TemplateDao templateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public Template queryById() {
        return this.templateDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Template> queryAll(String groupName, Date creationDate1, Date creationDate2, String templateName, String creator) {
        return templateDao.queryAll(groupName,creationDate1,creationDate2,templateName,creator);
    }

    /**
     * 新增数据
     *
     * @param template 实例对象
     * @return 实例对象
     */
    @Override
    public Template insert(Template template) {
        this.templateDao.insert(template);
        return template;
    }

    /**
     * 修改数据
     *
     * @param template 实例对象
     * @return 实例对象
     */

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.templateDao.deleteById() > 0;
    }

    @Override
    public List<Template> selectAllNoCondition(Integer groupId) {
        List<Template> templates = templateDao.selectAllNoCondition(groupId);
        return templates;
    }
}