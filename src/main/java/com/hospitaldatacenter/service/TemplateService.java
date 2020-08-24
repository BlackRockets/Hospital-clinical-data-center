package com.hospitaldatacenter.service;

import com.hospitaldatacenter.entity.Template;
import com.hospitaldatacenter.entity.User;

import javax.servlet.http.HttpServletRequest;
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
     * @return 实例对象
     */
    Template queryById(Integer id);

    /**
     * 查询多条数据
     *
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
     * @return 是否成功
     */
    boolean deleteById();
    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    List<Template> selectAllNoCondition(Integer groupId);
    /**
     * 保存
     */
    int save(String text, Integer id,Integer tempId, User user);

    int releases(String text, Integer id,Integer tempId, User user);

    List<Template> selectNamesByGroupId(Integer groupId);
}