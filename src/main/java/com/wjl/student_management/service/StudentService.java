package com.wjl.student_management.service;

import com.wjl.student_management.dao.param.StudentParam;
import com.wjl.student_management.entity.Student;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/11/2 10:21
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public interface StudentService {
    public void add(Student student);

    List<Student> search(StudentParam studentParam);

    List<Student> findAll();

    List<Student> findByStatus();

    void modifyStatus(int id,int status);
}
