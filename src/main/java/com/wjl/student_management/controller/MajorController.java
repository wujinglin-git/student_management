package com.wjl.student_management.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjl.student_management.common.constant.PaginationConstant;
import com.wjl.student_management.common.util.ResponseResult;
import com.wjl.student_management.entity.Major;
import com.wjl.student_management.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wugege
 * @Date: 2019/10/13 16:39
 * 一给窝哩 giao giao 呀吼
 * 4
 */

@Controller
public class MajorController {

    @Autowired
    MajorService majorService;

    @GetMapping("/major/{id}")
    public String findAll(@PathVariable("id") int id, Model model, Integer pageNum, HttpSession session){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= PaginationConstant.PAGE_NUM;
        }
        PageHelper.startPage(pageNum, 10);

        List<Major> majors = majorService.findById(id);
        PageInfo<Major> pageInfo = new PageInfo<>(majors);
        model.addAttribute("pageInfo",pageInfo);
        session.setAttribute("id",id);
        return "student/major";
    }

    @GetMapping("/major")
    @ResponseBody
    public ResponseResult findMajor(){
        ResponseResult result = new ResponseResult();
        List<Major> majors = majorService.findMajor();
        result.setData(majors);
        return result;
    }

    @ModelAttribute("/major")
    public List<Major> majorList(Model model){
        List<Major> list= majorService.findMajor();
        model.addAttribute("major",list);
        return list;
    }
    @GetMapping("major/sonSelect")
    @ResponseBody
    public ResponseResult majors(String mclass){
        ResponseResult result = new ResponseResult();
        List<Major> name = new ArrayList<>();
        name = majorService.findByMclass(mclass);
        result.setData(name);
        System.out.println(result.getData());
        return result;
    }

    /**
     *
     * 添加专业信息
     *
     */
    @PostMapping("/major")
    @ResponseBody
    public ResponseResult add(int schoolId,int majorId){
        ResponseResult result = new ResponseResult();
        majorService.addMajor(schoolId,majorId);
        result.setMessage("添加成功");
        return result;
    }
}
