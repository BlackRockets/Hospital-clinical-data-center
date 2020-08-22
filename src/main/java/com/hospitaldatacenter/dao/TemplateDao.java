package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.Template;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 模板(Template)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-12 09:40:18
 */
public interface TemplateDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Template queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Template> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Template> queryAll(@Param("groupName") String groupName,
                            @Param("creationDate1")Date creationDate1,
                            @Param("creationDate2")Date creationDate2,
                            @Param("templateName")String templateName,
                            @Param("creator")String creator);

    /**
     * 新增数据
     *
     * @param template 实例对象
     * @return 影响行数
     */
    int insert(Template template);

    /**
     * 修改数据
     *
     * @param template 实例对象
     * @return 影响行数
     */
    int update(Template template);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById();
    /**
     * 无条件
     *
     * @return 影响行数
     */
    List<Template> selectAllNoCondition(Integer groupId);
    /**
     * 保存
     */
   int save(Template template);

   String seelctVersion(Integer id);

    List<Template> selectByName(String name);

    int updateState(Template template);

    List<Template> selectNamesByGroupId(Integer groupId);
}