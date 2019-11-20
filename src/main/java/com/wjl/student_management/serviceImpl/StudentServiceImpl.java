package com.wjl.student_management.serviceImpl;

import com.wjl.student_management.dao.StudentDao;
import com.wjl.student_management.dao.param.StudentParam;
import com.wjl.student_management.entity.Student;
import com.wjl.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/11/2 10:22
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public void add(Student student) {
        studentDao.insert(student);
    }

    @Override
    public List<Student> search(StudentParam studentParam) {
        List<Student> list= new ArrayList<>();
        list = studentDao.selectByParams(studentParam);
        return list;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list= new ArrayList<>();
        list = studentDao.selectAll();
        return list;
    }

    @Override
    public List<Student> findByStatus() {
        List<Student> list = new ArrayList<>();
        list = studentDao.selectByStatus();
        return list;
    }

    @Override
    public void modifyStatus(int id,int status) {
        studentDao.updateByStatus(id,status);
    }
}
