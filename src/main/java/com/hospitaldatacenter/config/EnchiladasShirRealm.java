package com.hospitaldatacenter.config;


import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.PermissionService;
import com.hospitaldatacenter.service.RoleService;
import com.hospitaldatacenter.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thymeleaf.util.StringUtils;


import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnchiladasShirRealm extends AuthorizingRealm {
    @Resource
    private UserService userService;
    @Resource
    private PermissionService permissionService;
    @Resource
    private RoleService roleService;

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取登录用户名
        String name = (String)principalCollection.getPrimaryPrincipal();
        // 查询用户的角色信息
        Set<String> roles = getRolesByUsername(name);
        // 查询角色的权限信息
        Set<String> permissions = getPermissionsByUserName(name);
        // 设置用户的角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        if (simpleAuthorizationInfo != null && simpleAuthorizationInfo.getStringPermissions() != null) {
            for (String permission : permissions) {
                if (StringUtils.isEmpty(permission)) {
                    permissions.remove(permission);
                }
            }
        }

        if(roles.size() > 0){
            simpleAuthorizationInfo.setRoles(roles);
        }

        if(permissions.size() > 0){
            simpleAuthorizationInfo.setStringPermissions(permissions);
        }

        return simpleAuthorizationInfo;
    }

    // 根据用户名字从数据库中获取当前用户的权限数据
    public Set<String> getPermissionsByUserName(String name) {
        List<String> list = roleService.selectMenuByRoleId(name);
        if( list != null ){
            Set<String> sets = new HashSet<>(list);
            return sets;
        }else{
            return null;
        }
    }

    // 根据用户名字从数据库中获取当前用户的角色数据
    public Set<String> getRolesByUsername(String name) {
        List<String> list = userService.queryUserRoleByName(name);
        if( list != null ){
            Set<String> sets = new HashSet<>(list);
            return sets;
        }else{
            return null;
        }
    }

    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 1.从主体传过来的信息中获取用户名
        String userName = (String)authenticationToken.getPrincipal();
        // 2.通过用户名到数据库获取凭证
        User user = userService.queryUserByUserName(userName);
        if(user != null){
            // 把当前用户存到 Session 中
            SecurityUtils.getSubject().getSession().setAttribute("user", user);
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user.getName(),user.getPassword(),getName());
            return simpleAuthenticationInfo;
        }else{
            return null;
        }
    }

    // 通过用户名从数据库中获取当前用户的密码
    public String getPasswordByUserName(String name) {
        User user = userService.queryUserByUserName(name);
        if( user != null ){
            return user.getPassword();
        }else{
            return null;
        }
    }

}
