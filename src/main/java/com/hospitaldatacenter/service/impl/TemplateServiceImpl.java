package com.hospitaldatacenter.service.impl;

import com.hospitaldatacenter.dao.TemplateDao;
import com.hospitaldatacenter.entity.Template;
import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.TemplateService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
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
     * @return 实例对象
     */
    @Override
    public Template queryById(Integer id) {
        return this.templateDao.queryById(id);
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

    @Override
    public int save(String text, Integer id,Integer tempId, User user) {
        /*System.out.println(id);
        System.out.println(tempId);
        System.out.println(text);
*/
       if(tempId==0){
           Template template = new Template();
           int i=(int)(Math.random()*90000)+10000;
           template.setVersionNumber(""+0);
           template.setTemplateName(id+"-"+i);
           Date date = new Date();
           template.setContext(text);
           template.setFollowUpGroupId(id);
           template.setCreator(user.getName());
           template.setUpdatedBy(user.getName());
           template.setCreationDate(date);
           template.setUpdateDate(date);
           template.setTemplateState(3);
           int save = templateDao.save(template);
           return save;
       }else {
           Template template = templateDao.queryById(tempId);
           if(text.equals(template.getContext())){
               return 2;
           }else{
               String s = templateDao.seelctVersion(id);
               template.setTemplateId(null);
               template.setVersionNumber(""+(Integer.parseInt(s)+1));
               Date date = new Date();
               template.setUpdateDate(date);
               template.setUpdatedBy(user.getName());
               template.setContext(text);
               template.setTemplateState(3);
               int save = templateDao.save(template);
               return save;
           }

       }



    }

    @Override
    public int releases(String text, Integer id,Integer tempId, User user) {
        System.out.println("随访组id="+id);
        System.out.println("模板id="+tempId);
        System.out.println("模板内容="+text);
        if(tempId == 0){
            Template template = new Template();
            int i=(int)(Math.random()*90000)+10000;
            template.setVersionNumber(""+0);
            template.setTemplateName(id+"-"+i);
            Date date = new Date();
            template.setContext(text);
            template.setFollowUpGroupId(id);
            template.setCreator(user.getName());
            template.setUpdatedBy(user.getName());
            template.setCreationDate(date);
            template.setUpdateDate(date);
            template.setTemplateState(1);
            int save = templateDao.save(template);
            return save;
        }else {
            Template template = templateDao.queryById(tempId);
            if(template.getTemplateState()!=3){
                return 2;
            }else {
                template.setContext(text);
                Date date = new Date();
                template.setUpdateDate(date);
                template.setUpdatedBy(user.getName());
                template.setTemplateState(1);
                List<Template> templates = templateDao.selectByName(template.getTemplateName());
                for (Template template1 : templates) {
                    if(template1.getTemplateState()==1){
                        template1.setTemplateState(2);
                        templateDao.updateState(template1);
                    }
                }
                int update = templateDao.update(template);
                return update;
            }
        }

    }

    @Override
    public List<Template> selectNamesByGroupId(Integer groupId) {
        List<Template> templates = templateDao.selectNamesByGroupId(groupId);
        return templates;
    }


}