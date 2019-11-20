package com.wjl.student_management.serviceImpl;

import com.wjl.student_management.dao.MajorDao;
import com.wjl.student_management.entity.Major;
import com.wjl.student_management.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/27 10:24
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorDao majorDao;
    @Override
    public List<Major> findById(int id) {
        List<Major> majors = new ArrayList<>();
        majors = majorDao.selectById(id);
        return majors;
    }

    @Override
    public List<Major> findMajor() {
        List<Major> majors = new ArrayList<>();
        majors = majorDao.seletAllMajor();

        return majors;
    }

    @Override
    public List<Major> findByMclass(String mclass) {
        List<Major> name = new ArrayList<>();
        name = majorDao.selectByMclass(mclass);
        return name;
    }

    @Override
    public void addMajor(int schoolId,int majorId) {
        majorDao.insertMajor(schoolId,majorId);
    }
}
