package com.wjl.student_management.dao;

import com.wjl.student_management.entity.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/17 16:14
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Mapper
public interface SchoolDao {

    public List<School> selectAll();

    public void insert(School school);
}
