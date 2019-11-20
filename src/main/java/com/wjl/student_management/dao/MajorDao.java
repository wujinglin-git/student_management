package com.wjl.student_management.dao;

import com.wjl.student_management.entity.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/27 10:25
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Mapper
public interface MajorDao {

    public List<Major> selectById(int id);

    List<Major> seletAllMajor();

    List<Major> selectByMclass(String mclass);

    void insertMajor(@Param("schoolId") int schoolId,@Param("majorId") int majorId);
}
