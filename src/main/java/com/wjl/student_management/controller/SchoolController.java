package com.wjl.student_management.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjl.student_management.common.constant.PaginationConstant;
import com.wjl.student_management.common.util.ResponseResult;
import com.wjl.student_management.entity.School;
import com.wjl.student_management.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/12 17:31
 * 一给窝哩 giao giao 呀吼
 * 4
 */
@Controller
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    /**
     * 查询所有
     * @param pageNum
     * @param model
     * @return
     */
    @GetMapping("/schools")
    public String findAll(Integer pageNum, Model model){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum=PaginationConstant.PAGE_NUM;
    }
        PageHelper.startPage(pageNum, 10);

        List<School> schools = schoolService.findAll();
        PageInfo<School> pageInfo = new PageInfo<>(schools);
        model.addAttribute("pageInfo",pageInfo);

        return "schoolManager";
    }



    /**
     *
     * 转到添加页面
     */
    @GetMapping("/school")
    public String toAdd(Model model){

        return null;
    }


    /**
     *
     * 添加
     */
    @PostMapping("/school")
    @ResponseBody
    public ResponseResult add(School school){
        ResponseResult result = new ResponseResult();
        schoolService.addSchool(school);
        result.setMessage("添加成功");
        return result;

    }
    /**
     * 转到修改页面
     */
    @GetMapping("/school/{id}")
    public String toModify(@PathVariable("id") Integer id, Model model){
        return null;
    }

    /**
     * 修改
     */
    @PutMapping("/school")
    public String modify(){
        return null;
    }


}
