package com.wjl.student_management.serviceImpl;

import com.wjl.student_management.dao.LoginDao;
import com.wjl.student_management.entity.User;
import com.wjl.student_management.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/11/17 9:43
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;

    @Override
    public User findByUsername(String username,String password) {
        User user = loginDao.selectAll(username ,password);


        return user;
    }
}
