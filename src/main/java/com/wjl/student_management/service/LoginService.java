package com.wjl.student_management.service;

import com.wjl.student_management.entity.User;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/11/17 9:42
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public interface LoginService {
    public User findByUsername(String username,String password);
}
