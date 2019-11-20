package com.wjl.student_management.dao;

import com.wjl.student_management.dao.param.StudentParam;
import com.wjl.student_management.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/11/2 10:23
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Mapper
public interface StudentDao {
    public void insert(Student student);


    List<Student> selectByParams(StudentParam studentParam);

    List<Student> selectAll();

    List<Student> selectByStatus();

    void updateByStatus(@Param("id") int id,@Param("status") int status);
}
