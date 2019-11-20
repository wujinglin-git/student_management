package com.wjl.student_management.service;

import com.wjl.student_management.dao.SchoolDao;
import com.wjl.student_management.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/14 10:35
 * 一给窝哩 giao giao 呀吼
 * 4
 */

public interface SchoolService {

    public List<School> findAll();


    public void addSchool(School school);
}
