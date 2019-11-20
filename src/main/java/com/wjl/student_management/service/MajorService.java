package com.wjl.student_management.service;

import com.wjl.student_management.entity.Major;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/27 10:21
 * 一给窝哩 giao giao 呀吼
 * 4
 */

public interface MajorService {

    public List<Major> findById(int id);

    List<Major> findMajor();

    List<Major> findByMclass(String mclass);

    void addMajor(int schoolId,int majorId);
}
