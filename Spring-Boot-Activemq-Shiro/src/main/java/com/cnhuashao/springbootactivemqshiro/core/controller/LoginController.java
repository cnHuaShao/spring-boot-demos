package com.cnhuashao.springbootactivemqshiro.core.controller;

import com.cnhuashao.springbootactivemqshiro.core.bean.UserBean;
import com.cnhuashao.springbootactivemqshiro.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>TODO(com.cnhuashao.springbootactivemqshiro.core.controller @TODO)</b><br>
 * 版权所有 <a href="http://www.cnhuashao.com">中国-華少版本所有</a><br>
 * 这是一个依据Spring Boot官方API编写的相关功能测试用例，仅供学习使用。
 *
 * @Description: TODO 创建人：lz239
 * @CreateDate 2017 2017/10/10 14:56 10 修改人：lz239
 * <a href="mailto:lz2392504@gmail.com">cnhuashao $</a>
 * 修改备注：
 * @since V1.0
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(UserBean ub){
        //测试地址,基础登录,基于user.ini用户表
        //http://127.0.0.1:8080/login?name=cnhuashao&pwd=cnhuashao
        loginService.loginSelect(ub);
        return null;
    }
    @RequestMapping("/loginRealm")
    public String loginRealm(UserBean ub){
        //测试地址,基础登录,基于user.ini用户表
        //http://127.0.0.1:8080/loginRealm?name=cnhuashao&pwd=cnhuashao
        loginService.loginSelectUserRealm(ub);
        return null;
    }
}
