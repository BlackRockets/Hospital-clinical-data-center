package com.hospitaldatacenter;


import com.hospitaldatacenter.entity.User;
import com.hospitaldatacenter.service.PermissionService;
import com.hospitaldatacenter.service.RoleService;
import com.hospitaldatacenter.service.UserService;
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


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnceladusShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private RoleService roleService;

    // 角色权限和对应权限添加
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
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    // 根据用户名字从数据库中获取当前用户的权限数据
    private Set<String> getPermissionsByUserName(String name) {
        List<String> list = permissionService.queryPermissionNameByUserName(name);
        if( list != null ){
            Set<String> sets = new HashSet<>(list);
            return sets;
        }else{
            return null;
        }
    }

    // 根据用户名字从数据库中获取当前用户的角色数据
    private Set<String> getRolesByUsername(String name) {
        List<String> list = roleService.queryRoleNameByUsername(name);
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
        String password = getPasswordByUserName(userName);
        if( password == null ){
            return  null;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userName,password,"myShiroRealm");
        return simpleAuthenticationInfo;
    }

    // 通过用户名从数据库中获取当前用户的密码
    private String getPasswordByUserName(String name) {
        User user = userService.queryUserByUserName(name);
        if( user != null ){
            return user.getPassword();
        }else{
            return null;
        }
    }

}
