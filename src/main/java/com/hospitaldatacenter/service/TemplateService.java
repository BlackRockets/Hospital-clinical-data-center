package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.Template;

import java.util.Date;
import java.util.List;

/**
 * 模板(Template)表服务接口
 *
 * @author makejava
 * @since 2020-08-12 09:40:18
 */
public interface TemplateService {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    Template queryById();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Template> queryAll(String groupName, Date creationDate1, Date creationDate2, String templateName, String creator);

    /**
     * 新增数据
     *
     * @param template 实例对象
     * @return 实例对象
     */
    Template insert(Template template);

    /**
     * 修改数据
     *
     * @param template 实例对象
     * @return 实例对象
     */
  /*  Template update(Template template);*/

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById();

}