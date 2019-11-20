package com.wjl.student_management.controller;

import com.wjl.student_management.entity.User;
import com.wjl.student_management.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: wugege
 * @Date: 2019/10/12 9:57
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Controller
@RequestMapping("/sysUser")
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/login")
    public String login(String username, String password, Model model, HttpSession session){
        User user = loginService.findByUsername(username,password);
       if(user!=null){
           int role = user.getRole();
           session.setAttribute("role",role);
           session.setAttribute("schoolId",user.getSchoolId());

           if(role==1) {
               return "main";
           }else if (role==0){
               return "proMain";
           }
       }
        //完成登录功能
        model.addAttribute("msg","账号密码错误");
        return "login";
    }
}
