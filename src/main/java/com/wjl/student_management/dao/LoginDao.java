package com.wjl.student_management.dao;

import com.wjl.student_management.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/11/17 9:44
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Mapper
public interface LoginDao {

    public User selectAll(@Param("username") String username, @Param("password") String password);
}
