package com.wjl.student_management.serviceImpl;

import com.wjl.student_management.dao.SchoolDao;
import com.wjl.student_management.entity.School;
import com.wjl.student_management.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/17 15:44
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolDao schoolDao;
    @Override
    public List<School> findAll() {
        List<School> schools = new ArrayList<>();
        schools = schoolDao.selectAll();
        return schools;
    }

    @Override
    public void addSchool(School school) {
        schoolDao.insert(school);
    }
}
