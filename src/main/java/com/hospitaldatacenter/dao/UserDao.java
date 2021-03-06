package com.hospitaldatacenter.dao;

import com.hospitaldatacenter.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-12 15:56:15
 */
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    User queryById(Integer userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    List<User> queryDepartments();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);


    List<User> selectName();

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    int distribution(String[] list,@Param("departmentId") Integer departmentId);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int delete(Integer[] list);

    /**
     * @description: 查询（医生）职业的人
     * @author: zyl
     */
    List<User> selectUserByDoctor();

    /**
     * @description: 查询（护士）职业的人
     * @author: zyl
     */
    List<User> selectUserByNurse();

    /**
     * @description: 查询（技师）职业的人
     * @author: zyl
     */
    List<User> selectUserByTechnician();

    /**
     * @description: 查询（药师）职业的人
     * @author: zyl
     */
    List<User> selectUserByPharmacist();

    /**
     * @description: 根据名字查询所有对应的角色
     * @author: zyl
     */
    User selectUserRoleByName(String name);

    /**
     * @description: 根据用户名查询用户Id
     * @author: zyl
     */
    List<User> selectUserIdByName(String[] names);

    /**
     * @description: 根据用户id查询用户
     * @author: zyl
     */
    List<User> selectUserByUserId(String[] userIdArr);

    User getUserByName(String name);
}